package main;

import java.util.ArrayList;

import bean.Direccion;
import bean.Persona;

public class MainPersona {

	public static void main(String[] args) {
	Persona p1 = new Persona();
	Persona pAux = p1;//creo un mando universal- referencia que apunta al objeto p1.
	p1.setNombre("Bud Spencer");
	p1.setEdad(89);
	p1.setPeso(120);
	
	Persona p2 = new Persona("Terence Hill", 67, 70);
		pAux.setEdad(33);
		System.out.println(p1);
		System.out.println(p1.getEdad());
		cambiarEdad(p1);
		
		p2 = pAux; //tras esto Terence Hill desaparece ya no hay referencias a �l y lo eliminar� el colector de basura
		int numero = 50;
		cambiarEntero(numero);
		System.out.println(numero);
		System.out.println(pAux);
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Persona p3 = new Persona();
		/*	listaPersonas.add(p3); tambien se podr�a poner aqu�y el resultado ser� el mismo
		System.out.println(listaPersonas); en este punto rellena a null y 0, con los set posteriores lo rellena*/
		p3.setNombre("Harry potter");
		p3.setEdad(19);
		p3.setPeso(56);
		listaPersonas.add(p3);//la funci�n add, a�ade en la primera posici�n libre del arrary dicho objeto
		System.out.println(listaPersonas.get(0));
		//2 metodos de cambiar edad a harry potter porq puedo acceder de dos formas
		p3.setEdad(20);
		listaPersonas.get(0).setEdad(21);
		listaPersonas.add(pAux);
		pAux = null;
		
		System.out.println(listaPersonas);
		// num = 0xFFF base hexadecimal
		// otro = 0b101 binario
		int cp = 12345;
		System.out.println(cp);
		int otroCP = 01234; //lo interpreta como base octal por empezar por 0
		System.out.println(otroCP);
		Persona p4 = new Persona();
		p4.setNombre("Mortadelo");
		p4.setEdad(80);
		p4.setPeso(70);
		
		Direccion d1 = new Direccion();
		d1.setTipoVia("Calle");
		d1.setNombreVia("Gran v�a");
		d1.setCiudad("Madrid");
		d1.setCp("28054");
		
		p4.setDireccion(d1);
		listaPersonas.add(p4);
	}
		public static void cambiarEdad(Persona p) {
			p.setEdad(45);
			System.out.println(p.getEdad());
		}//p desaparece al cerrarse esta llave
		public static void cambiarEntero(int numero) {
			numero = 100;
		}
		
	}


