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
		//test sobre funci�n alta, la conexi�n ya est� en cuenta dentro de la funci�n alta
		daoPelicula.alta(pelicula);
	
		System.out.println("prueba alta acabada");
	}



	}


