package ejercicios;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*10.	Pedimos por pantalla un nombre y una contrase�a:
			a.	si el nombre coincide con �sara�, preguntamos por  la contrase�a y si coincide con �sarita�, escribimos 
			el mensaje �usuario y contrase�a correctas, bienvenido a la aplicaci�n�
			b.	Si el nombre NO es �sara� Escribimos usuario incorrecto�
			c.	Si el nombre es correcto y la contrase�a NO, Escribimos �contrase�a incorrecta�   */
		//Declarar variables
		String nombre = null;
		String contrase�a = null;
		
		//Leer datos procesar y presentar
		Scanner leer = new Scanner(System.in);
		System.out.println("Teclea un nombre : ");
		nombre = leer.next();
		System.out.println("Teclea una contrase�a : ");	
		contrase�a = leer.next();
		
		if (nombre.equals("sara")) {
	//		System.out.println("Teclea una contrase�a : ");	
	//		contrase�a = leer.next();
				if (contrase�a.equals("sarita")) 
				{ System.out.println("usuario y contrase�a correctas, bienvenido a la aplicaci�n");}
				else
				{System.out.println("contrase�a incorrecta");} 
		}
		else
		{System.out.println("usuario incorrecto");}
		
		
		System.out.println(" Terminado");	
		leer.close();
		}
}




			

	
