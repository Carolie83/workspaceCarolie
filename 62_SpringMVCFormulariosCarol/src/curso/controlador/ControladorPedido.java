package curso.controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Ordenador;
import curso.modelo.entidad.Pedido;
import curso.modelo.negocio.GestorPedido;

@Controller
public class ControladorPedido {
	@Autowired
	private GestorPedido gp;
	@Autowired
	private Pedido pedido;
	
	@RequestMapping("procesarFormulario")
	public ModelAndView procesarFormulario(ModelAndView mav,
			@RequestParam("nombre")String nombreCliente,
			@RequestParam("direccion")String direccion,
			@RequestParam("email")String email,
			@RequestParam("ram")String ram,
			@RequestParam("procesador")String procesador,
			@RequestParam("opciones")	String[] perifericos,
			@RequestParam("comentarios")String comentario) {
		System.out.println("Vamos a procesar su pedido");
		System.out.println("El nombre es : " + nombreCliente);
		System.out.println("La dirección es : " + direccion);
		System.out.println("El email es : " + email);
		System.out.println("la ram seleccinada es : " + ram);
		System.out.println("El procesador seleccionado es : " + procesador);
		System.out.println("las opciones de periféricos son : " + perifericos);
		System.out.println("El comentario realizado es : " + comentario);
		pedido.setNombreCliente(nombreCliente);
		pedido.setDireccion(direccion);
		pedido.setEmail(email);
		
		List<String> listaPerifericos = new ArrayList<String>();
		listaPerifericos = Arrays.asList(perifericos);//asList convierte de String array  (array normal) a array list
		Ordenador ordenador = new Ordenador();
		ordenador.setRam(ram);
		ordenador.setProcesador(procesador);
		ordenador.setListaPerifericos(listaPerifericos);
		pedido.setOrdenador(ordenador);
		pedido.setComentario(comentario);
		
		gp.validar(pedido);
		//no está validando bien , falta direcccion email y comentario, sin embargo si me dijo error 400 falta procesador,
//y falta redireccionar a la pagina otra vez si falta algo
		mav.setViewName("final");
		mav.addObject("pedido", pedido);
		return mav;//vamos a un /vistas/formulario.jsp	
	}
		@RequestMapping("mostrarFormulario")
		public String mostrarFormulario() {
			//este tipo de envio seria por forward
			//y consultaria con el viewResolver para saber
			//donde se encuentra esre recurso
			//la direccion del recurso resultante seria
			// /WEB-INF/vistas/final.jsp
			System.out.println("Vamos a mostrar el formulario");
			return "formulario";
	}
}
