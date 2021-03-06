package colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import bean.Persona;

public class MainColecciones {

	public static void main(String[] args) {
		ArrayList<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Mortadelo");
		listaNombres.add("Filemon");
		listaNombres.add("Dr. Bacterio");
		listaNombres.add("Ofelia");
		listaNombres.add("Super Intendente Vicente");

		System.out.println(listaNombres.get(0));// devuelve posicion 0 mortadelo
		System.out.println(listaNombres.get(3));// devuelve posici�n 3 Ofelia
		System.out.println(listaNombres.size());// devuelve cantidad de elementos, empieza a contar en 1.
		// manera mala o poco usada de recorrer listas
		for (int i = 0; i < listaNombres.size(); i++) {
			System.out.println(listaNombres.get(i));
		}
		// manera buena, se usa normalmente para recorrer arraylist
		/* FOR EACH la primera parte hay que declarar una variable dentro del for del mismo tipo que la lista que queremos
		 *  recorrer la segunda parte es la lista que queremos recorrer */
		System.out.println("*********");
		for (String valor : listaNombres) {
			System.out.println(valor);
		}
		System.out.println("*****array enteros*****");
		/* Si queremos crear un array de enteros, debemos de usar su correspondiente
		 * tipo wrapper (envoltorio) todos los primitivos tiene su tipo wrapper */
		int i = 5;// aqu� se trabaja con el 5 como primitivo
		Integer entero = new Integer(4); // aqu� trabajamos con 4 como objeto
		Integer entero2 = 5; // auto boxing: proceso automatico que hace lo mismo que lo de arriba
		double primitivoDouble = 6.9;
		Double objetoDouble = 6.9;
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		listaEnteros.add(1);// auto boxing
		listaEnteros.add(45);// auto boxing
		listaEnteros.add(new Integer(89));
		for (Integer v : listaEnteros) {
			System.out.println(v);
		}
		System.out.println("*************");
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Persona p1 = new Persona();
		p1.setNombre("Penelope");
		p1.setEdad("33");
		Persona p2 = new Persona();
		p2.setNombre("Ana");
		p2.setEdad("45");
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		for (Persona p : listaPersonas) {
			System.out.println("1 - El nombre es : " + p.getNombre());
			System.out.println("2 - la edad es : " + p.getEdad());
			System.out.println("*************");
		}
		/*puedo eliminar por posicion. Eliminamos de lista el indice 1. Pero no eliminamos el objeto, 
		 * el colector de basura no elimina el objeto hasta que no tenga ninguna referencia al objeto para acceder a �l,
		 *  en ese momento ya lo eliminar� cuando pase, p2 sigue apuntando a ella. Se podr�a borrar tambien por referencia*/
		// listaPersonas.remove(1); eliminar de lista por clave
		listaPersonas.remove(p2);
		System.out.println(listaPersonas);
		// no podemos acceder a una posici�n que no ex�sta
		// System.out.println(listaPersonas.get(1));
		System.out.println("******___Comenzamos Mapas_____*********");
		HashMap<String, String> mapaUsuarioContrasenia = new HashMap<String, String>();
		mapaUsuarioContrasenia.put("Felix", "1234");
		mapaUsuarioContrasenia.put("Pepe", "qwerty");
		mapaUsuarioContrasenia.put("Pepa", "123456");
		System.out.println(mapaUsuarioContrasenia.get("Felix")); // est� pensado para acceder por la clave
		mapaUsuarioContrasenia.remove("Felix");
		System.out.println(mapaUsuarioContrasenia.get("Felix"));// ahora devolvera null
		mapaUsuarioContrasenia.put("Pepe", "989898898989");
		System.out.println(
				mapaUsuarioContrasenia.get("Pepe")); 
		/*estructura clave valor no puede haber 2 claves iguales, lo que har� es reecribir una nueva pasword en Pepe */
		HashMap<String, Persona> mapaUsuarioPersona = new HashMap<String, Persona>();
		mapaUsuarioPersona.put(p1.getNombre(), p1);
		mapaUsuarioPersona.put(p2.getNombre(), p2);
		System.out.println(mapaUsuarioPersona);
	}
}
