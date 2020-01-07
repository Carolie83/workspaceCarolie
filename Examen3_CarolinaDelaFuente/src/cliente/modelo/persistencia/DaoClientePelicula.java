package cliente.modelo.persistencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import cliente.modelo.entidad.ClientePelicula;;

public class DaoClientePelicula {
	static String ipAddress = "127.0.0.1";
	static int puerto = 2019;
	
	public String encapsularDatosAlta(ClientePelicula cp, String tipoGestion) {

		System.out.println("[Enviando datos por el canal hacia el Servidor . . . ]");

		Socket socket = null;
		try {
			socket = new Socket(ipAddress, puerto);
		} catch (UnknownHostException uwhe) {
			System.out.println("[ERROR: Estableciendo el canal con el Servidor]\n");
			//uwhe.printStackTrace();
		}catch (IOException ioe) {
			System.out.println("[ERROR: Se ha producido un fallo excepcional estableciendo el canal con el Servidor\n");
			//ioe.getStackTrace();
		}
		
		try (PrintStream ps = new PrintStream(socket.getOutputStream());) {
			
			if (tipoGestion.equals("ALTA")) {
				ps.println(cp.getId() + "-" + cp.getTitulo() + "-" + cp.getDirector() + "-" + tipoGestion);
			}else if (tipoGestion.equals("BAJA")) {
				ps.println(cp.getId() + "-" + tipoGestion);
			}else if (tipoGestion.equals("BUSCAR")) {
				ps.println(cp.getId() + "-" + tipoGestion);
			}

			//ahora en el cliente tendremos que ller la inforamcion
			//del servidor
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());

			//para leer por frases, podemos usar la siguiente clase
			BufferedReader bf = new BufferedReader(isr);
			//en este linea nos quedaremos parados hasta que 
			//el servidor nos responda

			String cadena;
			
			try {
				cadena = bf.readLine();
			} catch (Exception e) {
				System.out.println("[ERROR: Se ha producido un falla en el flujo de entrada\n");
				return "0";
				//e.getStackTrace();
			}
			
			String[] respuestaServidor = cadena.split("-");
			
			if (respuestaServidor[0].equals("0")) {
				bf.close();
				return "0"; //No finalzó bien porque existia el Id Pelicula (Alta) o porque no consiguió el Id para eliminiarlo (Baja)
			}else if (respuestaServidor[0].equals("1")) {
				bf.close();
				return "1"; //La peticion de Alta o Baja fue exitosa
			} else if (respuestaServidor[0].equals(null)) {
				bf.close();
				return "2"; // Hubo una error de excepcion
			} else {
				//desemsamblo el objeto pelcula para enviarlo a la gestora
				
				int id = Integer.parseInt(respuestaServidor[0]);
				String titulo = respuestaServidor[1];
				String director = respuestaServidor[2];
				String gestionPelicula = respuestaServidor[3];
				
				cp = new ClientePelicula();
				cp.setId(id);
				cp.setTitulo(titulo);
				cp.setDirector(director);
				
				bf.close();
			}
					
		} catch (IOException ioe) {
			System.out.println("[ERROR: Se ha producido un fallo excepcional creando el flujo de salida del canal]\n");
			//ioe.getStackTrace();
			return "0";
		}
		return "0";
	}	
	
	public String encapsularDatosBaja(int id, String tipoGestion) {

		System.out.println("[Enviando datos por el canal hacia el Servidor . . . ]");

		Socket socket = null;
		try {
			socket = new Socket(ipAddress, puerto);
		} catch (UnknownHostException uwhe) {
			System.out.println("[ERROR: Estableciendo el canal con el Servidor]\n");
			//uwhe.printStackTrace();
		}catch (IOException ioe) {
			System.out.println("[ERROR: Se ha producido un fallo excepcional estableciendo el canal con el Servidor\n");
			//ioe.getStackTrace();
		}
		
		try (PrintStream ps = new PrintStream(socket.getOutputStream());) {
			
			String sId = String.valueOf(id);
			
			ps.println(sId + "-" + tipoGestion);

			//ahora en el cliente tendremos que ller la inforamcion
			//del servidor
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());

			//para leer por frases, podemos usar la siguiente clase
			BufferedReader bf = new BufferedReader(isr);
			//en este linea nos quedaremos parados hasta que 
			//el servidor nos responda

			String cadena;
			
			try {
				cadena = bf.readLine();
			} catch (Exception e) {
				System.out.println("[ERROR: Se ha producido un falla en el flujo de entrada\n");
				return "0";
				//e.getStackTrace();
			}
			
			String[] respuestaServidor = cadena.split("-");
			
			if (respuestaServidor[0].equals("0")) {
				bf.close();
				return "0"; //Borró correctamente
			}else if (respuestaServidor[0].equals("1")) {
				bf.close();
				return "1"; //No existe el Id de la Peli
			}
			bf.close();
					
		} catch (IOException ioe) {
			System.out.println("[ERROR: Se ha producido un fallo excepcional creando el flujo de salida del canal]\n");
			//ioe.getStackTrace();
		}
		return "0";
	}	
}