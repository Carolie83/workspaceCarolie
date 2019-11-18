package ejercicios;

public class Ejercicio17ArraysClase2 {

	public static void main(String[] args) {
		String [] dias =  { "lunes ", "martes", "miercoles","jueves" ,"viernes", "sabado", "domingo"} ;
		int ind = 0;
		int diaSemana = 1;
		
		System.out.println("hoy es : " + dias[diaSemana-1]);
		for (String dia: dias) //siempre que sepamos que está lleno VER EJERCICIO17 PROFE
			System.out.println("dia : " + dia.toUpperCase());/*toUpperCase lo podemos usar porque sabemos que está lleno, 
			sino va a crugir porque no va a saber con que string trabaja si hay valores null, habría q preguntar por cada 
			uno antes del Syso if (dia != null) pero si sabemos q los 5 priemro estan llenos escribiriamos:
			 for (int i = 0 , i < 5, i++) los huecos se dejan al final*/
		while (ind < dias.length && dias[ind] != null ) {
			System.out.println(dias[ind]);
			ind++;
		}
		////DA ERRORES PORQ PARTE LO HE DEJADO CON EXPLICACIONES Y NO HE PUESTRO LOS NULL...
		
		
	}

}
