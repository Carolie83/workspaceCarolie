package clienteCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteDaNumeros {

	public static void main(String[] args) {
		// System.in es un stream de entrada
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el numero 1: ");
		String numero1 = sc.next();
		System.out.println("introduzca el numero 2: ");
		String numero2 = sc.next();
		System.out.println("Desea sumar, restar, multiplicar o dividir");
		String opcion = sc.next();

		// nos conectamos al servidor para mandarle los numeros

		// si hacemos esto de una manera clasica, deberiamos crear estar variables fuera
		// del try y luego
		// cerrarlas en el bloque finally. Desde la version 1.7 de java, podemos poner
		// las variables que queremos cerrar automaticamente
		// dentro de los parentesis del try y cuando salga se cerrara,.Con el comando
		// ipconfig podemos saber nuestras ips
		try (Socket socket = new Socket("127.0.0.1", 1995);
				// PrintStream es el objeto q creamos dentro del Socket para poder escribir
				PrintStream ps = new PrintStream(socket.getOutputStream())) {
			// creamos el tubo

			// creamos un objeto que me permite escribir sobre el output stream del socket,
			//es mas optimo enviar todo de una vez
			ps.println(numero1 + "/" + numero2 + "/" + opcion);

			// ahora en el cliente tendremos que ller la inforamcion del servidor
			// InputStreamReader lo usa el cliente para poder leer lo que llega del servidor
			// caracter a caracter,
			// como podemos necesitar leer varios caracteres seguidos, se apoya en una
			// herramienta BufferedReader
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());

			// para leer por frases, podemos usar la siguiente clase
			BufferedReader bf = new BufferedReader(isr);
			// en este linea nos quedaremos parados hasta que el servidor nos responda
			System.out.println("cliente: " + bf.readLine());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
