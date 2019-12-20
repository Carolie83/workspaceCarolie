package cocheServidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServidorCoches {

	public static void main(String[] args) {
		String fichero =ficheroCoches;
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(1983);
			System.out.println("Server escuchando por el puerto 1983");
		} catch (IOException e1) {

			e1.printStackTrace();
			return;
		}
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();

// hacemos que el servidor nunca se pare y esta escuchando peticiones mientras llegan (while)
		while (true) {
			System.out.println("Escuchando peticiones...");
			try (Socket socket = ss.accept();) {
				// ServerSocket ss = new ServerSocket(2019);
				// abrimos el puerto y escuchamos peticiones hechas por un socket

				// Socket socket = ss.accept();
				// Este metodo se quedara parado el hilo de ejecucion hasta que llegue la
				// peticion de un cliente
				// cuando llegue la peticion de un cliente se continuara ejecutando el codigo y
				// se nos creara un objeto Socket

				// usamos la clase InputStreamReader para leer del tunel de entrada de datos, lo
				// que pasa es que esta clase
				// solo me permite leer caracter a caracter

				// podemos pintar la ip que me llame
				System.out.println(socket.getInetAddress().getHostAddress());

				InputStreamReader isr = new InputStreamReader(socket.getInputStream());

				// para leer por frases, podemos usar la siguiente clase
				BufferedReader bf = new BufferedReader(isr);
				String cadena = bf.readLine();
				System.out.println("Ha llegado lo siguiente al servidor: " + cadena);
				String[] vehiculo = cadena.split("/");
				String id = vehiculo[0];
				String matricula = vehiculo[1];
				String modelo = vehiculo[2];
				String marca = vehiculo[3];
				int iId = Integer.parseInt(id);
				PrintStream ps = new PrintStream(socket.getOutputStream());
				Coche coche = new Coche();
				coche.setId(iId);
				coche.setMatricula(matricula);
				coche.setModelo(modelo);
				coche.setMarca(marca);
				listaCoches.add(coche);
				ps.println("El coche se ha introducido correctamente: " + coche);
				System.out.println("Lista de coches acutalizada: " + listaCoches);
				System.out.println("Fin del servidor");
			} catch (IOException e) {

				e.printStackTrace();
			} catch (NumberFormatException nfe) {
				System.out.println("Datos inroducidos incorrectos");
				//para guardar en fichero
				try(FileWriter fw = new FileWriter(ficheroCoches, true);

        				PrintWriter pw = new PrintWriter(fw);) {

        			//Si ponemos (nombreFichero,true) add en vez de borrar

        			pw.println("\nA continuación mostramos el listado de coches registrados hasta ahora: \n" + listaCoches);
                }
			}
		}
	}

}
