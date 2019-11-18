package ejercicios;
import java.util.Scanner;

public class Ejercicio04Supuesto3 {

	public static void main(String[] args) {
		/*3.	Leemos un numero entero que representa el radio de una circunferencia, y calculamos
		a.	La circunferencia(2*PI*r)
		b.	El área del circulo (PI * r2)    */

		//1ºdeclarar variables
		int radio = 0;
		double circunferencia = 0, areaCirculo = 0;
		// 2º Obtener datos de entrada
				Scanner leer = new Scanner(System.in);
				System.out.println("Teclea un número : ");
				radio = leer.nextInt();	
				
				leer.close();
				//3º Procesar datos de entrada generando salida parcial o total
				circunferencia = (2 * (Math.PI) * radio);
				System.out.println("Circunferencia : " + circunferencia);
				areaCirculo = ((Math.PI) * (Math.pow(radio, 2)));
				System.out.println("El área del círculo es  : " + areaCirculo);
				
				//4º Escribir estadísticas
	}

}
