package vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import negocio.GestorCalculadora;

public class VistaExcepcion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	try {
		System.out.println("Introduce los dos numeros");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		GestorCalculadora gc = new GestorCalculadora();
		int resultado = gc.dividir(numero1,  numero2);
	}catch (ArithmeticException ae) {
		ae.printStackTrace();
		System.out.println("No se puede dividir por 0");
	}catch (InputMismatchException ime) {
		System.out.println("No se admiten palabras");
	}
		
	}

}
