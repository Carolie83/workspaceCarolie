package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.entidad.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DaoPelicula;

public class Aplivideoclub {

	public static void main(String[] args) {
		GestorPelicula gp = new GestorPelicula();
		DaoPelicula daoPelicula = new DaoPelicula();
		int opcion = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					"Elige una opción entre : 1- Alta pelicula, 2- Baja pelicula por Id,3- Modificar pelicula por IdListar peliculas,"

							+ " 4- Buscar pelicula por Id, 5- Listar peliculas, 6- Salir de la aplicación ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:

				System.out.println("Procedemos a realizar Alta pelicula");
				Pelicula pelicula = new Pelicula();
				// rellenar
				pelicula.setTitulo();
				pelicula.setDirector();
				pelicula.setGenero();
				pelicula.setAnioDePublicacion();
				gp.alta(pelicula);
				break;
			case 2:
				System.out.println("Procedemos a realizar Baja pelicula por id");
				gp.baja(pelicula);
				break;
			case 3:
				System.out.println("Procedemos a modificar pelicula por id");
				gp.modificar(pelicula);
				break;
			case 4:
				System.out.println("Procedemos a buscar pelicula por id");
				gp.buscar(id);
				break;
			case 5:
				System.out.println("Procedemos a listar peliculas");
				gp.listar();
				break;
			case 6:
				System.out.println("Salir de la aplicación");
				break;
			}
		} while (opcion != 0);
	}
}
