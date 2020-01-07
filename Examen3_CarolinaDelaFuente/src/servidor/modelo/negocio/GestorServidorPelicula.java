package servidor.modelo.negocio;

import servidor.modelo.entidad.ServidorPelicula;
import servidor.modelo.persistencia.DaoServidorPelicula;

public class GestorServidorPelicula {
		
	DaoServidorPelicula dsp = new DaoServidorPelicula();

	//Opcion 1-ALTA del menu principal
	public boolean altaPelicula(ServidorPelicula pelicula) {
		if (dsp.alta(pelicula)) {
			return true;
		}
		return false;
	}
	
	//Opcion 2-BORRAR del menu principal
	public int borrarPelicula(int id) {
		if (dsp.obtener(id)==null) {
			return 1; //No consigue la Película
		}
		
		if (dsp.borrar(dsp.obtener(id))) {
			return 0;
		}
		return 1;
	}


	//Opcion 3-BUSCAR del menu principal
	public ServidorPelicula buscarPelicula(int id) {
		if (dsp.obtener(id)==null) {
			return null; //No consigue la Película
		}
		return dsp.obtener(id);
	}	
	
}