package main;

import entidad.Persona;

public class MainEstatico {
	/*
	 * observar que este método es estático, es decir no está ligado a ningún
	 * objeto, existe sinempre sin necesidad de new
	 */

	public static void main(String[] args) {
		Persona p1 = new Persona();
		/*
		 * fijaos que para acceder al métodO setNombre accedo a traves de la referencia
		 * al objeto
		 */
		p1.setNombre("Harry Calahan");
		p1.setEdad(85);
		System.out.println(p1);
		// como todo lo estatico existe siempre, esto lo puedo hacer
		imprimirEstatico(p1);
		// para invocar un método dinamico, necesito el objeto creado, fijaos en
		// p1.setNombre
		// imprimirDinámico(p1)así pues creamos el objeto:
		MainEstatico mainEstatico = new MainEstatico();
		// y ahora podemos invocar el metodo
		mainEstatico.imprimirDinamico(p1);

		/*
		 * Si no estoy dentro de la clase que tiene el atributo o el metodo estatico, se
		 * accede a traves del nombre de la clase
		 */
		Persona.numeroPesonas++;
		/*
		 * notese la diferencia entre cuando queria acceder a un metodo o atributo
		 * dinamico, que lo que necesitaba era una referencia al objeto
		 */
	}
	/*
	 * Lo dinamico solo existe a petición.Dos formas o hago statico el siguiente
	 * método, o bien hago new el objeto
	 */

	public static void imprimirEstatico(Persona p1) {
		System.out.println(p1);
	}

//da error porque desde lo estatico no podemos acceder a lo dinamico
	// imprimirDinamico(p1);
	public void imprimirDinamico(Persona p1) {
		System.out.println(p1);
		imprimirEstatico(p1);
	}

}
