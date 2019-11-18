package ejercicios;

public class Ejercicio05Switch {

	public static void main(String[] args) {
		int mes = 17;
		switch(mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("el mes : " + mes + " es de 31");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println("el mes : " + mes + " es de 30");
			break;
		case 2:
			System.out.println("el mes : " + mes + " es de 28/29");
			break;
		default:
			System.out.println(" La que has liao pollito");
			break;
		}
		
		System.out.println(" Terminado");
	}

}
