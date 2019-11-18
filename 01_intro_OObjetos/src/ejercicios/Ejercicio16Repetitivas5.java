package ejercicios;
import java.util.Scanner;

public class Ejercicio16Repetitivas5 {

	public static void main(String[] args) {
		/*    5.	Leer de consola nombres de personas, hasta que me teclean la palabra “FIN”. Al final del proceso indicar, 
		cuantas palabras tienen un número impar de caracteres, cuantas un número par,y cuantas palabras hemos leído válidas.*/
		Scanner leer = new Scanner(System.in);
		System.out.println("Teclea un nombre repetidamente hasta que decidas escribir FIN : ");
		
		//declarar variables
		String nombres = null;
		nombres = leer.toString();
		while (nombres != "Fin")
		{ 
		nombres = leer.toString();} 
		System.out.println(nombres);
		
	//	??????NO SE HA HECHO EN CLASE Y NO SEGUÍ, NO VA
		
		//String []nombres = new String[];

		//NO SE PUEDE USAR STRING PORQUE TENGO QUE SABE3R CUANTOS TENGO
					//nombres = leer.toString(nombres[]);
					//System.out.println(nombres[]);
		/*int []pares = {2, 6, 8,10,34,68};
		String [] nombres = {"andres", "esteban", "zacarias", "eva", "ana"};
		
		System.out.println(pares.length);
		System.out.println(nombres.length);
		pares[1] = 66;
		for (int i= 0; i < pares.length; i ++)
			
			{System.out.println("en la posición" + i + "hay" + pares[i]);}
		for (String ele:nombres)
		{	System.out.println("me llamo : " + ele);  }*/


		leer.close();	
	}
	
}
//ver ejercicio 16 profesor