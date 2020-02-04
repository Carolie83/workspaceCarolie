package curso.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorMultiplicar {
/*
	@RequestMapping("multiplicar")
	public ModelAndView multiplicar(ModelAndView mav) {
		mav.setViewName("multiplicar");
		return mav;
		
	}
	
	*/
		//El objeto ModelAndView sirve para establecer la vista a la que vamos y tambien le podemos
		//establecer los atributos que queremos pasarle a la vista
		//Recoger parametros se hace de manera sencilla
			@RequestMapping("multiplicar")
				public ModelAndView multiplicar(ModelAndView mav, 
						@RequestParam("numero")String param) {
					System.out.println("El número a multiplicar es : " + param);
					System.out.println();
					mav.setViewName("multiplicar");
					return mav;}
	}

