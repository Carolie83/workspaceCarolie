package test;

import java.util.ArrayList;
import java.util.List;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class PruebaListar {

	public static void main(String[] args) {
		DaoPelicula daoPelicula = new DaoPelicula();
		Pelicula pelicula = new Pelicula();
		List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		//Prueba Listar

		daoPelicula.listar();
		System.out.println(daoPelicula.listar());
		System.out.println("prueba Listar acabada");
	}

}
