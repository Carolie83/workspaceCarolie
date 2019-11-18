package ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		double num1 = 5.20; //hemos metido double por lo que ya los resultados nos los da con decimales.
		int num2 = 15;
		double resultado = 0;
		int resul = 0;
	resultado = num1 %num2;	
	resul = (int)num1 * num2; //con el int nos convierte a entero justo lo que hay detras. cuidado con operacionesy ()
	System.out.println("tras casting es : " + (resul));
	resul = (int)(num1 * num2);
	System.out.println("tras casting es : " + (resul));
	//tras casting
	

	}

}
