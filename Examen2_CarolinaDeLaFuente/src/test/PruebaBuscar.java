package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class PruebaBuscar {

	public static void main(String[] args) {
		DaoPelicula daoPelicula = new DaoPelicula();
		Pelicula pelicula = new Pelicula();
	
		//test sobre funci�n buscar pelicula por id, la conexi�n ya est� en cuenta dentro de la funci�n 
				
			System.out.println(daoPelicula.buscar(10));
				System.out.println("prueba buscar acabada");

	}

}
