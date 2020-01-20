package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidad.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainInsertar {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(
						Configuracion.class);
		
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		
		p.setTitulo("Totoro");
		p.setGenero("infantil");
		p.setDirector("Hayao");
		p.setYear(1985);
		
		gp.alta(p);
		
		System.out.println("Fin del alta pelicula" + gp.alta(p) );
	}
}
