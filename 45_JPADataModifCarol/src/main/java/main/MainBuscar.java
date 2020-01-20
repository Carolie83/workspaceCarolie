package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidad.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainBuscar {

	public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
		
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		
		
		
		gp.obtener(8);
		
		System.out.println("Pelicula con id 1 es :  " + 	gp.obtener(8));

	}

}
