package curso.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import curso.modelo.entidad.Cliente;

import curso.modelo.negocio.GestorCliente;


@Controller
public class ControladorUsuario {
	@Autowired
	private GestorCliente gc;
	@Autowired
	private Cliente cliente;
	
	//1º ir a formulario login para rellenar
	@RequestMapping("mostrarLogin")
	public String mostrarLogin() {
		
		//la direccion del recurso resultante seria
		// /WEB-INF/vistas/login.jsp
		System.out.println("Vamos a mostrar el formulario Login");
		return "login";}
	
	@RequestMapping("doLogin")
	private ModelAndView hacerLogin(@RequestParam String usuario,
			@RequestParam String password, ModelAndView mav) {
		System.out.println("Vamos a comprobar si los datos introducidos son validos ");
		System.out.println("El usuario es : " + usuario);
		System.out.println("La password es : " + password);
		//si se loguea va a inicio, sino vuelve a login
		cliente.setUsuario(usuario);
		cliente.setPassword(password);
		
		if(gc.validar(cliente)==0) {
		
			mav.setViewName("redirect:mostrarInicio");
		}else {
			System.out.println("error al loguear");
			
			mav.setViewName("redirect:mostrarRegistro");
		}
		return mav;
	}
	//3ºsin logueado, mostrar página registarse		
	@RequestMapping("mostrarRegistro")
	public String mostrarRegistro() {
		
		//la direccion del recurso resultante seria
		// /WEB-INF/vistas/login.jsp
		System.out.println("Vamos a mostrar el formulario de registro");
		return "registro";
}
	//esto no lleva al registro q rellenamos, TOMA LOS DATOS Y TRABAJA CON ELLOS
	@RequestMapping("procesarRegistro")
	public ModelAndView procesarRegistro(ModelAndView mav,
			@RequestParam("usuario")String usuario,
			@RequestParam("password")String password,
			@RequestParam("email")String email){
		System.out.println("los datos introducidos son : ");
		System.out.println("El usuario es : " + usuario);
		System.out.println("La password es : " + password);
		System.out.println("El email es : " + email);
	
		cliente.setUsuario(usuario);
		cliente.setPassword(password);
		cliente.setEmail(email);

		gc.alta(cliente);
		
		mav.getModelMap().addAttribute("mensaje","El cliente se ha registrado y será redireccionado para loguearse");
		//opcion 2
		//mav.setViewName("redirect:pepe?mensaje=El usuario se ha registrado");
	
		mav.setViewName("redirect:mostrarLogin");//como ya lo tenemos mapeado, esto hace q me mande a login
		//esto se usa solo cuando necesitamos pasar el objeto a l vista para q lo pinte,
		//pero no necesitamos que nos lo pinte
		//mav.addObject("usuario", usuario);
		System.out.println("El nuevo cliente ha sido dado de alta");
		return mav;//vamos a un /vistas/formulario.jsp	
		
	}
}