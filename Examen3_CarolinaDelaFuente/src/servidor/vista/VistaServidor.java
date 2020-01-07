package servidor.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.DecimalFormat;

import servidor.modelo.entidad.ServidorPelicula;
import servidor.modelo.negocio.GestorServidorPelicula;

public class VistaServidor {
	public static void main(String[] args) {
		
		System.out.println("[API Servidor - Gestión de Películas] ");
		System.out.println("Esperándo solicitudes . . . .\n");
		
		GestorServidorPelicula gsp = new GestorServidorPelicula();
		ServidorPelicula pelicula = null;
		
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(2019);
		} catch (UnknownHostException uwhe) {
			System.out.println("[ERROR: Estableciendo el canal en el Servidor]\n");
			//uwhe.printStackTrace();
		}catch (IOException ioe) {
			System.out.println("[ERROR: Se ha producido un fallo excepcional estableciendo el canal en el Servidor\n");
			//ioe.getStackTrace();
		}
		
		
		while(true) {
			try (Socket socket = serverSocket.accept()){

				InputStreamReader isr = 
						new InputStreamReader(socket.getInputStream());

				BufferedReader bf = new BufferedReader(isr);
				String cadena = bf.readLine();
				System.out.println("Se ha recibido la siguiente petición del cliente: " + serverSocket.getInetAddress().getHostAddress());
				System.out.println("-----------------------------------------------------------");

				String[] datospelicula = cadena.split("-");
				
				String id = datospelicula[0];
				String titulo = datospelicula[1];
				String director = datospelicula[2];
				String gestionpelicula = datospelicula[3]; //Aqui se guarda si se desea un Alta, Baja, Modificacion, etc

				String resultado = "0";
				int iId = Integer.parseInt(id);

				System.out.println("Gestión: Tipo ** " + gestionpelicula + "**");
				System.out.println("Datos del pelicula: ");
				System.out.println("Id: " + id);
				System.out.println("Título: " + titulo);
				System.out.println("Director: " + director);
				System.out.println("--------------------------------------------------------");
				System.out.println("[Iniciando el proceso . . . .]");
				//Preparamos el objeto pelicula con lo recibido del cliente vía socket

				pelicula = new ServidorPelicula();
				pelicula.setId(iId);
				pelicula.setTitulo(titulo);
				pelicula.setDirector(director);

				switch(gestionpelicula.toUpperCase()) {

				//Alta de pelicula
				case "ALTA": 
					if (gsp.altaPelicula(pelicula)) {
						System.out.println("[OK: Petición de ALTA realizada exitosamente]");
						resultado = "1";
					}else {
						System.out.println("[ERROR: La petición de ALTA no pudo ser realizada]");
						resultado = "0";
					}
					break;

					//Baja
				case "BAJA": 
					if (gsp.borrarPelicula(iId)==0) {
						System.out.println("[OK: Petición de BAJA realizada exitosamente]");
						resultado = "1";
					}else {
						System.out.println("[ERROR: La petición de BAJA no pudo ser realizada]");
						resultado = "0";
					}
					break;

					//Modificar un pelicula
				case "BUSCAR":
					//resultado = dOperando1 * dOperando2;
					
					if (gsp.buscarPelicula(iId)==null){
						System.out.println("[ERROR: La petición de BUSQUEDA no pudo ser realizada, Id Película inválido]");
						resultado = "0";
					}else {
						resultado = gsp.buscarPelicula(iId).getId() + "-" + gsp.buscarPelicula(iId).getTitulo() + "-" + 
								gsp.buscarPelicula(iId).getDirector();	
					}
					break;

				case "default":
					System.out.println("[ERROR: La Operación a realizar no ha podido ser reconocida]\n");
					resultado = "0";
				}
				PrintStream ps = new PrintStream(socket.getOutputStream());

				ps.println(resultado);// + resultado);

				System.out.println("[OK: Canal preparado para recibir nuevas peticiones . . .]");
			} catch (IOException e) {
				System.out.println("[ERROR: Ha habido un fallo leyendo los datos del pelicula]\n");
				//e.printStackTrace();
			}
		}
	}
}