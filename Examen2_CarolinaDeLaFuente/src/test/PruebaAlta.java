package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class PruebaAlta {

	public static void main(String[] args) {
		DaoPelicula daoPelicula = new DaoPelicula();
		Pelicula pelicula1 = new Pelicula("Superman 2", "Pepito Perez", "Accion", 2004);
		Pelicula pelicula = new Pelicula();
		
		pelicula.setTitulo("el viaje de Chihiro");	
		pelicula.setDirector("H. Miyazaqky");
		pelicula.setGenero("infantil");
		pelicula.setAnioDePublicacion(2001);
		//test sobre función alta, la conexión ya está en cuenta dentro de la función alta
		daoPelicula.alta(pelicula);
	
		System.out.println("prueba alta acabada");
	}



	}


