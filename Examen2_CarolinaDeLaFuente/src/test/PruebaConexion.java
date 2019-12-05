package test;

import modelo.persistencia.DaoPelicula;

public class PruebaConexion {

	public static void main(String[] args) {

		
				//crear el objeto que me conecta con BBDD
				DaoPelicula daoPelicula = new DaoPelicula();
				boolean estaConectado = daoPelicula.abrirConexion();
				System.out.println("Conectado: " + estaConectado);
				

			}




	}


