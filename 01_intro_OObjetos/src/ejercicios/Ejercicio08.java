package ejercicios;
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
	/*8.	Leer dos n�meros y una palabra, y si  la palabra es:
	a.	Sumar:  escribimos el resultado de sumar  los dos n�meros b.	Restar: la resta c.	Multiplicar: el producto
	d.	Dividir: la divisi�n e.	Resto: el resto de dividir uno entre otro f.	Cualquier otra palabra, Escribimos opci�n err�nea   */
		//Declarar variables
		double num1 = 0;
		double num2 = 0;
		String palabra = null;
		//Leer datos procesar y presentar
		Scanner leer = new Scanner(System.in);
		System.out.println("Teclea un n�mero, num1 : ");
		num1 = leer.nextDouble();
		System.out.println("Teclea un n�mero,num2 : ");	
		num2 = leer.nextDouble();
		System.out.println("Teclea una palabra: Sumar, Restar, Multiplicar, Dividir o Resto");
		palabra = leer.next();
				switch(palabra){
				case "Sumar":
					System.out.println("la suma es : " + (num1 + num2));
					break;
				case "Restar":
					System.out.println("la resta es : " + (num1 - num2));
					break;
				case "Multiplicar":
				System.out.println("la multiplicaci�n es : " + (num1 * num2));
					break;
				case "Dividir":
					System.out.println("la divisi�n es : " + (num1 / num2));
					break;
				case "Resto":
					System.out.println("el resto es : " + (num1 % num2));	
					break;
				default:
					System.out.println("Opci�n erronea ");}
			System.out.println(" Terminado");	
			leer.close();				
	}}