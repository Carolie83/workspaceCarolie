package ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
	/*	String nombre = "Sebastian";
		System.out.println(nombre.toUpperCase());
		System.out.println(String.valueOf(1234).substring(1,3));
		*/
		/* 1.	Leemos dos números enteros y calculamos y mostramos por la consola:
			a.	La suma
			b.	La resta
			c.	El producto
			d.	La división
			e.	El resto de su división */

		//definir variables
		int num1 = 0, num2 = 0, resultado = 0; //puedo generar la variable interna resultado si lo usaré mas veces...
		//simulamos que leemos
		num1 = 15;
		num2 = 25;
		//Proceso
		resultado = num1 + num2;
		System.out.println("la suma es : " + (num1 + num2));
		System.out.println(" la suma es : " + resultado); // solo vale si generé resultado
		System.out.println("la resta es : " + (num1 - num2));
		System.out.println("la multiplicación es : " + (num1 * num2));
		System.out.println("la división es : " + (num1 / num2)); //java: la división siempre entera no se ponen decimales
		System.out.println("el resto es : " + (num1 % num2)); // el resto es entero, lo que nos sobra de la división
	}

}
