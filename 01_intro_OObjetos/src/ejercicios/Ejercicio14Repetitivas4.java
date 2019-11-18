package ejercicios;
public class Ejercicio14Repetitivas4 {

	public static void main(String[] args) {
		/* 4.	Leer 10 números al azar, ente 1 y 50 (y almacenarlos en un arreglo- ahora no). 
		 * Leer cada uno, escribirlos y al final del proceso Escribir:
			a.	Cuál es la media de los números leídos.
			b.	 Cuál es la suma de los números leídos.
			c.	Cuantos son pares y cuantos son impares.*/
		
		int numero = 0, pares = 0, impares = 0;
		double media = 0;
		double suma = 0;
		
		//DECLARAR VARIABLES y ramdom
		
		for (int i = 1; i <= 10; i++ ) {
		
			numero = (int)(Math.random()*50 + 1);
			System.out.println(numero);   
			suma += numero;
			media = suma/10;
					if (numero %2 == 0)
						{pares++;}
					else 
						{impares++;}
		}
		//procesar datos
		
		System.out.println(" La suma es : "+ suma ); 
		System.out.println(" La media es : "+ media ); 
		
	
	}

}
