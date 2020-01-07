package cliente.modelo.negocio;

import cliente.modelo.entidad.ClientePelicula;
import cliente.modelo.persistencia.DaoClientePelicula;;

public class GestorClientePelicula {
	DaoClientePelicula dcp = new DaoClientePelicula();
	
	public int PrepararDatos(ClientePelicula pelicula, String tipoGestion) {
		System.out.println("[Encapsulando datos . . . ]");
		
		switch(tipoGestion) {
		
			case "ALTA":
				String resultado = dcp.encapsularDatosAlta(pelicula, tipoGestion);
				if (resultado.equals("1")) {
					return 1; //Gestion exitosa

				}else if (resultado.equals("2")) { 
					return 2;

				}else if (resultado.equals("3")) { //Faltaron datos por suministrar en el Alta
					return 3;

				}else {
					return 0;
				}
			case "BAJA":
				
				if (dcp.encapsularDatosBaja(pelicula.getId(), tipoGestion).equals("0")) {
					return 1;
				}else {
					return 0;
				}
				
			case "BUSCAR":
				// dcp.encapsularDatosBuscar(id);
				
		}
		return 0;
	}
}