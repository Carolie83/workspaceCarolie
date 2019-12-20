package servidorCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorOperaCalculadora {

	public static void main(String[] args) {

		ServerSocket ss = null;
		try {
			ss = new ServerSocket(1995);
			System.out.println("Server escuchando por el puerto 1995");
		} catch (IOException e1) {

			e1.printStackTrace();
			return;
		}

		// hacemos que el servidor nunca se pare y esta escuchando peticiones mientras
		// llegan (while)
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

// usamos la clase InputStreamReader para leer del tunel de entrada de datos, lo que pasa es que esta clase solo me permite leer caracter a caracter

				// podemos pintar la ip que me llame
				System.out.println(socket.getInetAddress().getHostAddress());

				InputStreamReader isr = new InputStreamReader(socket.getInputStream());

				// para leer por frases, podemos usar la siguiente clase
				BufferedReader bf = new BufferedReader(isr);
				String cadena = bf.readLine();
				System.out.println("Ha llegado lo siguiente al servidor: " + cadena);
				String[] calculadora = cadena.split("/");
				String numero1 = calculadora[0];
				String numero2 = calculadora[1];
				String opcion = calculadora[2];
				double iNumero1 = Double.parseDouble(numero1);
				double iNumero2 = Double.parseDouble(numero2);
				PrintStream ps = new PrintStream(socket.getOutputStream());
				switch (opcion) {
				case "sumar":
					double resultadoSuma = iNumero1 + iNumero2;
					ps.println("la suma es : " + resultadoSuma);

					break;
				case "restar":
					double resultadoResta = iNumero1 - iNumero2;
					ps.println("la resta es : " + resultadoResta);
					break;
				case "multiplicar":
					double resultadoMultiplicacion = iNumero1 * iNumero2;
					ps.println("la multiplicación es : " + resultadoMultiplicacion);
					break;
				case "dividir":
					double resultadoDivision = iNumero1 / iNumero2;
					ps.println("la división es : " + resultadoDivision);
					break;
				default:
					ps.println("Debe introducir una opción correcta");
				}

				System.out.println("Fin del servidor");
			} catch (IOException e) {

				e.printStackTrace();
			} catch (NumberFormatException nfe) {
				System.out.println("No es un numero lo que han mandado");
			}
		}
	}
}
