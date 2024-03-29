package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidad.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainModificar {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
		
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		Pelicula p = context.getBean("pelicula",Pelicula.class);
	//por set tengo que introducir el id que quiero modificar
		p.setId(5);
		p.setTitulo("Monstruos SA");
		p.setGenero("infantil");
		p.setDirector("Rodolfo");
		p.setYear(2003);
		System.out.println("Pelicula 2 modificada" + gp.modificar (p) );

	}

}
