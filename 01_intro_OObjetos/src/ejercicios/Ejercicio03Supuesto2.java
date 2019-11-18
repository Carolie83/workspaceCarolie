package ejercicios;

public class Ejercicio03Supuesto2 {

	public static void main(String[] args) {
		//1ºdeclarar variables
		int lado1 = 0, lado2 = 0;
		int perimetro = 0; 
		int area = 0;
		double hipotenusa = 0;
		// 2º Obtener datos de entrada
		lado1 = 7;
		lado2 = 4;		
		//3º Procesar datos de entrada generando salida parcial o total
		perimetro = ((lado1 * 2) + (lado2 * 2));
		System.out.println("resultado esperado perimetro 22 : " + perimetro);
		area = (lado1 * lado2);
		System.out.println("resultado esperado area 28 : " + area);
		hipotenusa = Math.sqrt((lado1*lado1) + (lado2*lado2));
		System.out.println("resultado esperado hipotenusa 8.algo : " + hipotenusa);
		String prueba = String.valueOf(12);
		System.out.println(prueba);
		String prueba2 = String.valueOf(true);
		System.out.println(prueba2);
		String prueba3 = String.valueOf(12.24);
		System.out.println(prueba3);
		
		//4º Escribir estadísticas
	}

}
