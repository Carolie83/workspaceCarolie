package curso.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Cliente;
import curso.modelo.entidad.ListaProductosSeleccionados;
import curso.modelo.entidad.Producto;
import curso.modelo.negocio.GestorProducto;

@Controller
public class ControladorProducto {
	@Autowired
	private GestorProducto gp;
	
	@Autowired
	private Cliente cliente;
	
	@Autowired
	private ListaProductosSeleccionados listaProductosSeleccionados;

//  mostrar formulario proodcuto para rellenar alta de prodcutos
	@RequestMapping("mostrarAltaProducto")
	public ModelAndView mostrarAltaProducto(ModelAndView mav) {
		List<Producto> listaProductos = gp.listarProductos();

		mav.addObject("listaProductos", listaProductos);
		mav.setViewName("altaProducto");
		return mav;
	}
	
	
	
//re recogen datos de la vista y se trabaja con ellos para darlos de alta
	@RequestMapping("altaProducto")
	public ModelAndView altaProducto(@RequestParam() String nombre, @RequestParam() double precio,
			@RequestParam() String categoria, ModelAndView mav) {

		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		producto.setCategoria(categoria);

		gp.altaProducto(producto);
	

		mav.getModelMap().addAttribute("mensaje", "Producto dado de alta. Id: " + producto.getId());
		mav.setViewName("redirect:mostrarInicio");
		return mav;
	}
	//Mostrar página de supermercado inicio para seleccionar prodcutos
	@RequestMapping("mostrarInicio")
	public String mostrarInicio(Model model) {
		System.out.println("Vamos a mostrar la pagina de productos del supermercado");
		List<Producto> listaProductos = gp.listarProductos();
		model.addAttribute("cliente",cliente);
		model.addAttribute("listaProductos",listaProductos);
		model.addAttribute("listaProductosSeleccionados", listaProductosSeleccionados.getLista());
		return "inicio";
	}
	
	@RequestMapping("addProductoLista")
	public String addProducto(@RequestParam int id,Model model) {
		System.out.println("Vamos a añadir productos al carrito");
		Producto p = gp.buscar(id);
		if(p != null) {
			listaProductosSeleccionados.getLista().add(p);
		
			
		}
				
		return "redirect:mostrarInicio";
	}
	
//Mostrar página de supermercado inicio para seleccionar prodcutos
	
		//desde aquí mostrarSeleccion mandamos a pagarSeleccion
		@RequestMapping("mostrarSeleccion")
		public String mostrarSeleccion(Model model) {
			System.out.println("vamos a calcular el total de la compra");
			gp.calcularTotal(listaProductosSeleccionados);
			model.addAttribute("listaProductosSeleccionados", listaProductosSeleccionados);
			return"pagarSeleccion";
		}
}