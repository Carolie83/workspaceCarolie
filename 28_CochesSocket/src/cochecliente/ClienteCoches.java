package cochecliente;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class ClienteCoches {

	public static void main(String[] args) {
		
	// System.in es un stream de entrada
	Scanner sc = new Scanner(System.in);

	System.out.println("Introduzca el id: ");
	String id = sc.next();
	System.out.println("introduzca la matricula: ");
	String matricula = sc.next();
	System.out.println("introduzca el modelo: ");
	String modelo = sc.next();
	System.out.println("introduzca la marca: ");
	String marca = sc.next();
	int iId = Integer.parseInt(id);
// nos conectamos al servidor para mandarle los numeros

// las variables que queremos cerrar automaticamente se ponen dentro de los parentesis del try y cuando salga se cerrara,
//Con el comando ipconfig podemos saber nuestras ip
	try (Socket socket = new Socket("127.0.0.1", 1983);
// PrintStream es el objeto q creamos dentro del Socket para poder escribir
		PrintStream ps = new PrintStream(socket.getOutputStream())) {
		// creamos el tubo

	// creamos un objeto que me permite escribir sobre el output stream del socket,es mas optimo enviar todo de una vez
					ps.println(id + "/" + matricula + "/" + modelo + "/" + marca);

// ahora en el cliente tendremos que ver la inforamcion del servidor
// InputStreamReader lo usa el cliente para poder leer lo que llega del servidor caracter a caracter,
// como podemos necesitar leer varios caracteres seguidos, se apoya en la herramienta BufferedReader
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


	


