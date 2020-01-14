package cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteSuma {
	
public static void main(String[] args) {
	//System.in es un stream de entrada
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca el numero 1: ");
	int numero1 = sc.nextInt();
	System.out.println("Introduzca el numero 2: ");
	int numero2 = sc.nextInt();
	/*nos conectamos al servido para mandarle los numeros
	para conectarnos a nuestra maquina localhost o nuestra ip 127.0.0.1 y puerto q no este ocupado porbamos aleatoriamente 2019 pero esto nos lo da el servidor
	si hacemos esto de una manera clasica, deberiamos crear estas variables fuera de try y luego cerrarlas en el bloque finally.Desde la version 1.7 de java,
	podemos cerrar automaticamente dentro del parentesis del try*/
	try(Socket socket = new Socket("127.0.0.1",2019);
			PrintStream ps = new PrintStream(socket.getOutputStream())) {
		//creamos el tubo
		
		//creamos un objeto que me permite escribir
		//sobre el output stream del socket
		ps.println("Hola mundo");
		
	} catch (UnknownHostException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	} 
}
}