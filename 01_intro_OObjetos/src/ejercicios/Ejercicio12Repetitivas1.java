package ejercicios;
import java.util.Scanner;

public class Ejercicio12Repetitivas1 {
	/*1.	Leer un n�mero detr�s de otro mientras que el n�mero le�do sea distinto de cero.
	Al final del proceso mostrar cuantos n�meros v�lidos he le�do, y cuanto suman las cantidades de los n�meros introducidos.*/
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Declarar variables
		double numero = 0;
		double contador = 0;
		double acumulador = 0;
		//procesar datos
		System.out.println("Teclea un n�mero : ");
		numero = leer.nextDouble();	
		
		while (numero != 0)
			{ contador++;
			acumulador += numero;
				System.out.println("Teclea un n�mero : ");
				numero = leer.nextDouble();	}//vuelvo a leer que se bucla
				 
							System.out.println("Los n�meros v�lidos has sido" + contador);
							System.out.println("Los n�meros v�lidos suman" + acumulador);
		
		
		
		leer.close();
	}

}
// 1� hago public static main...genero scanner leer , importo java util,
// 2� genero variables adem�s de contador y acumulador
//3 � proceso variables : leo n�meros
// 4 hago while (condici�n)    ordenes en while: contador++ y acumularo += numero y VOLVER A LEER EN EL WHILE 
//CIERRO LLAVES Y PRESENTO DATOS