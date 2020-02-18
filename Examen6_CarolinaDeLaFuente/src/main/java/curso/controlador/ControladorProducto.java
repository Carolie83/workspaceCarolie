package curso.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Producto;
import curso.modelo.negocio.GestorProducto;

@Controller
public class ControladorProducto {
	@Autowired
	private GestorProducto gp;

//  mostrar pagina de alta de pelicula
	@RequestMapping("mostrarAltaProducto")
	public ModelAndView mostrarAltaProducto(ModelAndView mav) {
		List<Producto> listaProductos = gp.listarProductos();

		mav.addObject("listaProductos", listaProductos);
		mav.setViewName("altaProducto");
		return mav;
	}

	@RequestMapping("altaProducto")
	public ModelAndView altaProducto(@RequestParam() String nombre, @RequestParam() double precio,
			@RequestParam() String categoria, ModelAndView mav) {

		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		producto.setCategoria(categoria);

		int respuesta = gp.altaProducto(producto);
		if (respuesta == 1) {
			mav.getModelMap().addAttribute("error1", "Falta el nombre");
			return mav;
		}

		if (respuesta == 2) {
			mav.getModelMap().addAttribute("error2", "Falta el precio");
			return mav;
		}

		if (respuesta == 3) {
			mav.getModelMap().addAttribute("error3", "Falta la categoría");
			return mav;
		}

		if (respuesta == 0) {
			return mav;
		}

		mav.getModelMap().addAttribute("mensaje", "Producto dado de alta. Id: " + producto.getId());
		mav.setViewName("redirect:mostrarAltaProducto");
		return mav;
	}

}
