package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Usuario;

import modelo.negocio.GestorUsuario;


/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando por doGet");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
	
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setEmail(email);
	
		GestorUsuario gp = new GestorUsuario();
		boolean validada = gp.validar(usuario);
		if(validada) {
			//ojo, aqui estamos haciendo un 300 (codigo http de respuesta) al navegador
			response.sendRedirect("ParaisoCervecero.html");
		}else {
			response.sendRedirect("Inicio.html");
		}	
	}
		//response.getWriter().append("Served at: ").append(request.getContextPath());


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
