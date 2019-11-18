package ejercicios;
import java.util.Scanner;

public class Ejercicio06AlrededorSexo {

	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		
		char sexo ='M';
			if (sexo == 'H') 
				{System.out.println("Hombre");}
			else
				{System.out.println("Mujer");}
		String sexoS = "H";
		
			if (sexoS == "H")
				{System.out.println("Hombre String");}
			else
				{System.out.println("Mujer String");}
		
		char sexoLeer;
		sexoLeer = leer.next().charAt(0);
			if (sexoLeer == 'H') 
				{System.out.println("Hombre con caracter");}
			else
				{System.out.println("Mujer con caracter");}	
		
		String sexoLeerString = null;
		sexoLeerString = leer.next();
			if (sexoLeerString == "H") 
				{System.out.println("Hombre leer String");}
			else
				{System.out.println("Mujer leer String");}
		
			if (sexoLeerString.equals ("H")) 
				{System.out.println("Hombre leer String 2");}
			else
				{System.out.println("Mujer leer String 2");}
		System.out.println("pepe".compareTo("Pepe"));
		leer.close();
			}

}
