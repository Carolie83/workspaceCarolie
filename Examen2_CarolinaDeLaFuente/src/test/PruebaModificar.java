package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class PruebaModificar {

	public static void main(String[] args) {
		DaoPelicula daoPelicula = new DaoPelicula();
		Pelicula pelicula1 = new Pelicula();
		
	pelicula1.setTitulo("Totoro");	
	pelicula1.setDirector("H. Miyazaqky");
	pelicula1.setGenero("infantil");
	pelicula1.setAnioDePublicacion(1993);
	pelicula1.setId(2);
	//test del método modificar pelicula
	daoPelicula.modificar(pelicula1);
	
	System.out.println("prueba modificar acabada");

	}

}
