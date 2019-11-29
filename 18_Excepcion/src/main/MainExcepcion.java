package main;

import java.util.Scanner;

public class MainExcepcion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Este bloque de aquí, sera la parte que va a intentar java ejecutar.
		//si ocurriera, en vez de parar el programa entraría por la parte cath
	try {
		System.out.println("Introduzca el nominador");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduzca el denominador");
		int numero2 = sc.nextInt();
		//si ponemos el numero2 con un 0, nos da error en tiempo de ejecución y el programa se para
		int resultado = numero1 / numero2;//esto puede arrojar excepciones aritmeticas.
		//en caso de excepcion, deja de ejecutar el resto del bloque try.
		System.out.println("El resultado es : " + resultado);
	}catch (ArithmeticException ae) {
		//si ocurre excepción en bloque try de tipo arithmeticException, entraremos por esta parte del codigo
		System.out.println("no se puede dividir por 0");
		/*en la variable ae, tenenmos información A cerca del error que se ha producido y podemos mostrarla o no,
		 *  segun nuestro criterio*/
		//podemos sacar mensaje
		System.out.println("mensaje" + ae.getMessage());
		//o podemos imprimir toda la traza
		//ae.printStackTrace();
	}
	System.out.println("Fin del programa, gracias por usarlo");
	}

}
