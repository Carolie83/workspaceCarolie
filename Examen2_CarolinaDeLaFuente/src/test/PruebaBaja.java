package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class PruebaBaja {

	public static void main(String[] args) {
		DaoPelicula daoPelicula = new DaoPelicula();
		Pelicula pelicula3 = new Pelicula();
		pelicula3.setId(3);
		//test sobre función baja de pelicula, la conexión ya está en cuenta dentro de la función 
				daoPelicula.baja(pelicula3);
			
				System.out.println("prueba baja acabada");
	}

}
