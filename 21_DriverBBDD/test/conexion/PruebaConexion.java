package conexion;

import modelo.persistencia.DaoCoche;

public class PruebaConexion {

	public static void main(String[] args) {
		//crear el objeto que me conecta con BBDD
		DaoCoche daoCoche = new DaoCoche();
		boolean estaConectado = daoCoche.abrirConexion();
		System.out.println("Conectado: " + estaConectado);
		

	}

}
