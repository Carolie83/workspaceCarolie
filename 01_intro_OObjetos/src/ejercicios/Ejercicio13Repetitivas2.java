package ejercicios;
public class Ejercicio13Repetitivas2 {

	public static void main(String[] args) {
		//2.	Escribir los n�meros m�ltiplos de 3 y de 7, que hay entre el 1 y el 250.
		/*3.	Lo mismo que el anterior, y adem�s escribir al final, cu�ntos de los 250 son:
			a.	M�ltiplos de 3 y de 7.  b.	Cuantos hay m�ltiplos solo de 3   c.	Cuantos hay m�ltiplos solo de 7.*/
/*     Algoritmo multiplos37
	contadorMultiplos = 0;					contadorResto = 0;
	Para i<-1 Hasta 250 Con Paso 1 Hacer
		Si i%3 = 0 y  i%7 = 0 Entonces
			Escribir "Multiplo de 3 y 7 : ",  i;
				contadorMultiplos = contadorMultiplos + 1;	
			SiNO					contadorResto = contadorResto + 1;	
			Fin Si						Fin Para
	Escribir "cuantos m�tiplos hay de 3 y 7 : ", contadorMultiplos   ;	
	Escribir  "no son multiplos de 3 y 7 : ",  contadorResto ;
FinAlgoritmo */
		//declarar variables    no hace falta crear estas variables si no vamos a hacer mas, las usamos para ejercicio 3
		int contadorMultiplos = 0;
		int contador3 = 0;
		int contador7 = 0;
		int contadorResto = 0;
		//procesar datos
		for (int i = 1; i <= 250; i++ ) {
			if (i%3 == 0 && i%7 == 0) 
			{ System.out.println("Multiplo de 3 y 7 : " +  i); 
			contadorMultiplos++;}
					else	
					{contadorResto = (250 - (contador3 + contador7 -contadorMultiplos));}
			if (i%3 == 0) 
				{contador3++;}
			if (i%7 == 0)  
				{contador7++; }}
			System.out.println("N�mero de  multiplos de 3 y 7 : " +  contadorMultiplos);
			System.out.println("N�mero de  multiplos solo de 3 : " +  contador3);
			System.out.println("N�mero de  multiplos solo de 7 : " +  contador7);
			System.out.println("No son Multiplo de 3 y 7 : " +  contadorResto); }}


