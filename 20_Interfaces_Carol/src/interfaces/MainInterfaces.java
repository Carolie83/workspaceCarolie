package interfaces;

import java.util.ArrayList;
import java.util.List;

public class MainInterfaces {

	public static void main(String[] args) {
		Movible m = new Oso(); /*con movible puedo apuntar a cualquier clase que implemente de �l, solo tendr� los m�todos de movible,
		 tenemos menos m�todos, pero puede interesarme tener solo la referencia al objeto*/
		m.moverseLento();

		List<Movible>listaMovibles = new ArrayList <Movible>();//new: dependencias de objetos fuertes
		listaMovibles.add(m);
		
		Persona p = new Persona ();
		p.setNombre("pepe");
		listaMovibles.add(p);
		
		}

}
