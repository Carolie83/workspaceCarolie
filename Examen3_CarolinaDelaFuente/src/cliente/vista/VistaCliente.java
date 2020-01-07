package cliente.vista;

import java.util.Scanner;

import cliente.modelo.entidad.ClientePelicula;
import cliente.modelo.negocio.GestorClientePelicula;

public class VistaCliente {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String salir = "N";
		String tipoString;
		ClientePelicula cp = null;

		
		do {
			System.out.println("[API Cliente - Gestión de Coches]");
			System.out.println("Indique la letra del Tipo de Gestión que desea realizar");
			System.out.println("[A] - Alta");
			System.out.println("[B] - Baja");
			System.out.println("[O] - Buscar");
			System.out.println("[S] - Salir del Programa");

			String tipoGestion = sc.nextLine();


			System.out.println("Ingresar Id Película: ");
			String id = sc.nextLine();
			int resultado =0;

			switch (tipoGestion.toUpperCase()) {

			case "A":
				tipoGestion = "ALTA";

				System.out.println("Ingresar el Título: ");
				String titulo = sc.nextLine();

				System.out.println("Ingresar el Director: ");
				String director = sc.nextLine();

				cp = new ClientePelicula();

				cp.setId(Integer.parseInt(id));
				cp.setTitulo(titulo);
				cp.setDirector(director);
				
				GestorClientePelicula gcp = new GestorClientePelicula();
				resultado = gcp.PrepararDatos(cp, tipoGestion);
				
				break;

			case "B":
				tipoGestion = "BAJA";
				int iId = Integer.parseInt(id);
				//resultado = gcp.(iId, tipoGestion);
				break;

			case "O":
				tipoGestion = "BUSCAR";
				break;


			case "S":
				salir = "S";
				break;
				
			}
			
			if (resultado==1) {
				System.out.println("[Tipo de Gestión "+ tipoGestion + " realizada con éxito]");
			}else if (resultado==2) {
				System.out.println("[Tipo de Gestión "+ tipoGestion + " Ya existe un Coche con esa Matricula. Negada el ALTA del Coche]");
			}else if (resultado==3) {
				System.out.println("[Tipo de Gestión "+ tipoGestion + " Faltaron datos por suministrar. Negada el ALTA del Coche]");
			}else if (resultado==0)
				System.out.println("[Tipo de Gestión "+ tipoGestion + " Negada la Petición]");
			System.out.println("\n¿Desea hacer una nueva Gestión [S/N}?");

			if (sc.nextLine().toUpperCase().equals("S")){
				salir = "S";
			}
			
			
		} while(salir.equals("N"));
		
		System.out.println("\n ***** Ha decidido salir del programa. Hasta Pronto!! *****");
	}
}
