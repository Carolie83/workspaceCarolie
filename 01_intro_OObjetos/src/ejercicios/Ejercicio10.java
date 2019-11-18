package ejercicios;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*10.	Pedimos por pantalla un nombre y una contraseña:
			a.	si el nombre coincide con “sara”, preguntamos por  la contraseña y si coincide con “sarita”, escribimos 
			el mensaje “usuario y contraseña correctas, bienvenido a la aplicación”
			b.	Si el nombre NO es “sara” Escribimos usuario incorrecto”
			c.	Si el nombre es correcto y la contraseña NO, Escribimos “contraseña incorrecta”   */
		//Declarar variables
		String nombre = null;
		String contraseña = null;
		
		//Leer datos procesar y presentar
		Scanner leer = new Scanner(System.in);
		System.out.println("Teclea un nombre : ");
		nombre = leer.next();
		System.out.println("Teclea una contraseña : ");	
		contraseña = leer.next();
		
		if (nombre.equals("sara")) {
	//		System.out.println("Teclea una contraseña : ");	
	//		contraseña = leer.next();
				if (contraseña.equals("sarita")) 
				{ System.out.println("usuario y contraseña correctas, bienvenido a la aplicación");}
				else
				{System.out.println("contraseña incorrecta");} 
		}
		else
		{System.out.println("usuario incorrecto");}
		
		
		System.out.println(" Terminado");	
		leer.close();
		}
}




			

	
