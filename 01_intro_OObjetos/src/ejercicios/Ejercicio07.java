package ejercicios;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
	
		/*7.	Leemos un número y si es:
			a.	1: Escribimos “uno”
			b.	2: escribimos “dos”
			c.	3: escribimos “Tres”
			d.	Cualquier otro número, escribimos “Otro número”*/
		
		 Scanner leer = new Scanner(System.in);
		//Declarar variables
		int num = 1;
		
		//Procesar datos y presentación
		System.out.println("Teclea un número");
		num = leer.nextInt();
	
			switch(num) {
			case 1:
				System.out.println("uno " + num);
				break;
			case 2:
				System.out.println("dos " + num);
				break;
			case 3:
				System.out.println("tres " + num);
				break;
			default:
				System.out.println("Otro número " + num);
				}
		
		System.out.println(" Terminado");
		leer.close();
	}

}
