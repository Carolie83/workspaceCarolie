package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ClaseServidora {

	public static void main(String[] args) {
		System.out.println("Escuchando peticiones");
	try (ServerSocket ss = new ServerSocket(2019);
	Socket socket = ss.accept();){
		//ServerSocket ss = new ServerSocket(2019)
		//abrimos el puerto y escuchamos peticiones hechas por un socket
		//Socket socket = ss.accept();
		//Este metodo se quedará parado el hilo de ejecución hasta que llegue la petición de un cliente 
		//cuando llegue la petición de un cliente se continuará ejecutando el codigo y se nos creará un objeto socket
		//usamos la clase InputStreamReader para leer del tune de entrada de datos, lo que pasa es que esta clase solo mepermite leer caracter a caracter
		InputStreamReader isr = new InputStreamReader()
		BufferedReader bf = new BufferedReader(socket.getInputStream())
	} catch (IOException e) {
	
		e.printStackTrace();
	}

	}

}
