package curso.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Operacion;
import curso.modelo.negocio.GestorCalculadora;


@Controller
public class ControladorCalculadora {
	@Autowired
	private GestorCalculadora gc;
	
	@Autowired
	private Operacion operacion;
		
	@RequestMapping("saludoOperacion")
	public ModelAndView mostrarcalculadora_web(
			@RequestParam("numero1")double numero1,
			@RequestParam("numero2")double numero2,
			@RequestParam("tipoOperacion")String tipoOperacion,
			ModelAndView mav) {
		System.out.println("Vamos a mostrar la operacion " + tipoOperacion + "en la calculadora web");
		operacion.setNumero1(numero1);
		operacion.setNumero2(numero2);
		operacion.setTipoOperacion(tipoOperacion);
		
		//gc.realizarOperacion();   errores sin arreglar
		
		mav.setViewName("calculadora_web");
		mav.addObject("Operacion", operacion);
		return mav;//vamos a un /vistilla/mostrarTabla.jsp	
	}
}


