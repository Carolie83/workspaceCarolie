package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class PruebaBuscar {

	public static void main(String[] args) {
		DaoPelicula daoPelicula = new DaoPelicula();
		Pelicula pelicula = new Pelicula();
	
		//test sobre función buscar pelicula por id, la conexión ya está en cuenta dentro de la función 
				
			System.out.println(daoPelicula.buscar(10));
				System.out.println("prueba buscar acabada");

	}

}
