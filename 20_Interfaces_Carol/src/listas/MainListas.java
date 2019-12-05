package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;;

public class MainListas {

	public static void main(String[] args) {
		ArrayList<String> listaStrings = new ArrayList<String>();
		listaStrings.add("pepe");
		listaStrings.add("pepa");
/*Las interfaces son una colección de métodos abstractos. Sirven para varias cosas, entre ellas implementar una herencia multiple 
 * en java con una referencia de una interfaz podemos apuntar a cualquier objeto que implemente dicha interfaz.
 * Las interfaces, dice el "QUE" mientras que las clases que implementan dicha interface dice el "COMO"
 * Ejemplo, la clase ArrayList es una implementación de la interface List, que por debajo utiliza arrays normales java,
 *  y cuando se llena, crea uno nuevo mas grande */
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("pepe");
		listaNombres.add("pepa pig");
		
		LinkedList<String> listaLinked = new LinkedList<String>();
		ArrayList<String> listaArray = new ArrayList<String>();
		Vector<String> listaVector = new Vector<String>();
		recorrerArray(listaArray);
		recorrerLinked(listaLinked);
		recorrerVector(listaVector);
		//gracias a las interfaces, puedo tener solo un método en lugar de 3.
		recorrer(listaArray);
		recorrer(listaLinked);
		recorrer(listaVector);
	}
		private static void recorrerLinked (LinkedList<String>lista) {
			//trabajos con los datos de la lista
			for (String s : lista) {
				System.out.println(s);
			}
		}
		private static void recorrerArray (ArrayList<String>lista) {
			//trabajos con los datos de la lista
			for (String s : lista) {
				System.out.println(s);
	}
		}
		private static void recorrerVector (Vector<String>lista) {
			//trabajos con los datos de la lista
			for (String s : lista) {
				System.out.println(s);
			}
			}
		private static void recorrer (List<String>lista) {
			//trabajos con los datos de la lista
			for (String s : lista) {
				System.out.println(s);
}
}
}