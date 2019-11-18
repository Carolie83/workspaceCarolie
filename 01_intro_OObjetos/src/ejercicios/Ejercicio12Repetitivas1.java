package ejercicios;
import java.util.Scanner;

public class Ejercicio12Repetitivas1 {
	/*1.	Leer un número detrás de otro mientras que el número leído sea distinto de cero.
	Al final del proceso mostrar cuantos números válidos he leído, y cuanto suman las cantidades de los números introducidos.*/
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Declarar variables
		double numero = 0;
		double contador = 0;
		double acumulador = 0;
		//procesar datos
		System.out.println("Teclea un número : ");
		numero = leer.nextDouble();	
		
		while (numero != 0)
			{ contador++;
			acumulador += numero;
				System.out.println("Teclea un número : ");
				numero = leer.nextDouble();	}//vuelvo a leer que se bucla
				 
							System.out.println("Los números válidos has sido" + contador);
							System.out.println("Los números válidos suman" + acumulador);
		
		
		
		leer.close();
	}

}
// 1º hago public static main...genero scanner leer , importo java util,
// 2º genero variables además de contador y acumulador
//3 ª proceso variables : leo números
// 4 hago while (condición)    ordenes en while: contador++ y acumularo += numero y VOLVER A LEER EN EL WHILE 
//CIERRO LLAVES Y PRESENTO DATOS