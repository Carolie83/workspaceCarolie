package ejercicios;
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
	/*8.	Leer dos números y una palabra, y si  la palabra es:
	a.	Sumar:  escribimos el resultado de sumar  los dos números b.	Restar: la resta c.	Multiplicar: el producto
	d.	Dividir: la división e.	Resto: el resto de dividir uno entre otro f.	Cualquier otra palabra, Escribimos opción errónea   */
		//Declarar variables
		double num1 = 0;
		double num2 = 0;
		String palabra = null;
		//Leer datos procesar y presentar
		Scanner leer = new Scanner(System.in);
		System.out.println("Teclea un número, num1 : ");
		num1 = leer.nextDouble();
		System.out.println("Teclea un número,num2 : ");	
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
				System.out.println("la multiplicación es : " + (num1 * num2));
					break;
				case "Dividir":
					System.out.println("la división es : " + (num1 / num2));
					break;
				case "Resto":
					System.out.println("el resto es : " + (num1 % num2));	
					break;
				default:
					System.out.println("Opción erronea ");}
			System.out.println(" Terminado");	
			leer.close();				
	}}