package modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class GestorPelicula {

	private DaoPelicula daoPelicula;
	private Pelicula pelicula;

//Además, incluiremos parametros especiales que necesitemos cuplir: No puede haber campos vacios ni dos películas con mismo nombre

	public boolean alta(Pelicula pelicula) {
		daoPelicula = new DaoPelicula();
		if (pelicula.getTitulo().isEmpty()) {
			return false;
		}
		if (pelicula.getDirector().isEmpty()) {
			return false;
		}
		if (pelicula.getGenero().isEmpty()) {
			return false;
		}
		if (pelicula.getAnioDePublicacion()< 0) {
			return false;
		}
		if(pelicula.getTitulo().equals(pelicula.getTitulo())) {
			return false;
		}
		return daoPelicula.alta(pelicula);
	}

	public boolean baja(Pelicula pelicula) {
		daoPelicula = new DaoPelicula();
		return daoPelicula.baja(pelicula);
	}

	public boolean modificar(Pelicula pelicula) {
		daoPelicula = new DaoPelicula();
		daoPelicula = new DaoPelicula();
		if (pelicula.getTitulo().isEmpty()) {
			return false;
		}
		if (pelicula.getDirector().isEmpty()) {
			return false;
		}
		if (pelicula.getGenero().isEmpty()) {
			return false;
		}
		if (pelicula.getAnioDePublicacion()< 0) {
			return false;
		}
		if(pelicula.getTitulo().equals(pelicula.getTitulo())) {
			return false;
		}
		
		return daoPelicula.modificar(pelicula);
	}

	public Pelicula buscar(int id) {
		daoPelicula = new DaoPelicula();
		return daoPelicula.buscar(id);
	}

	public List<Pelicula> listar() {
		daoPelicula = new DaoPelicula();
		return daoPelicula.listar();
	}

}
