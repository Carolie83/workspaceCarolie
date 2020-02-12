package curso.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Usuario;
import curso.modelo.negocio.GestorUsuario;



@Controller
public class ControladorUsuario {
	@Autowired
	private GestorUsuario gu;
	@Autowired
	private Usuario usuario;
	//1º mostrar pagina login
	@RequestMapping("mostrarLogin")
	public String mostrarLogin() {
		
		//la direccion del recurso resultante seria
		// /WEB-INF/vistas/login.jsp
		System.out.println("Vamos a mostrar el formulario Login");
		return "login";
}
	//2º si ya registrado, enviar va a /dologin si correcto bienvenido

	@RequestMapping("mostrarInicio")
	public ModelAndView mostrarInicio(ModelAndView mav,
			@RequestParam("nombre")String nombre,
			@RequestParam("password")String password) {
		System.out.println("Vamos a comprobar sus datos");
		System.out.println("El nombre es : " + nombre);
		System.out.println("La password es : " + password);
		
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		if(gu.validar(usuario) == 0) {
			mav.setViewName("inicio");
			mav.addObject("usuario", usuario);
		}else {
			mav.setViewName("redirect:mostrarLogin");
		}
	
		return mav;//vamos a un /vistas/inicio.jsp	
		}
	//3ºsin logueado, mostrar página registarse		
	@RequestMapping("mostrarRegistro")
	public String mostrarRegistro() {
		
		//la direccion del recurso resultante seria
		// /WEB-INF/vistas/login.jsp
		System.out.println("Vamos a mostrar el formulario de registro");
		return "registro";
}
	//esto nos lleva al registro q rellenamos
	@RequestMapping("procesarRegistro")
	public ModelAndView procesarRegistro(ModelAndView mav,
			@RequestParam("nombre")String nombre,
			@RequestParam("password")String password,
			@RequestParam("email")String email,
			@RequestParam("edad")String edad){
		System.out.println("los datos introducidos son : ");
		System.out.println("El nombre es : " + nombre);
		System.out.println("La password es : " + password);
		System.out.println("El email es : " + email);
		System.out.println("la edad es : " + edad);
		Usuario usuario= new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		usuario.setEmail(email);
		int iEdad=Integer.parseInt(edad);
		usuario.setEdad(iEdad);
		gu.alta(usuario);
		System.out.println("El nuevo usuario ha sido dado de alta");
		mav.setViewName("redirect:mostrarLogin");//como ya lo tenemos mapeado, esto hace q me mande a login
		//esto se usa solo cuando necesitamos pasar el objeto a l vista para q lo pinte,
		//pero no necesitamos que nos lo pinte
		//mav.addObject("usuario", usuario);
		return mav;//vamos a un /vistas/formulario.jsp	
}
}