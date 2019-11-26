package main;

import entidad.Animal;
import entidad.PezPayaso;
import entidad.Placton;
import entidad.Trucha;

public class MainPez {

	public static void main(String[] args) {
		/*no podemos hacer esto porque Animal es una clase abstracta
		Animal a = new Animal();*/
		Animal a = new Trucha();/*referencia generica apuntado a objeto concreto apunto con mando animal
		 a trucha porq quiero atibutos de animal usarlos en trucha*/
		a.setNombre("Ruperta");//ya no apunta a null, hacemos que apunte a ruperta
		a.setPeso(3);
		/*a = new PezPayaso();
		a.setNombre("Nemo");nos hemos cargado a ruperta porque ya no hay referencias a ella y no se puede hacer equal a null*/
		Animal b = new PezPayaso();
		b.setNombre("Nemo");
		a.comer(b);
		Placton p = new Placton();
		p.setCalorias(100);
		System.out.println(a.toString());
		a.comer(p);
		System.out.println(a.toString());//ejecuta el syso del objeto q está apuntando (trucha), que lo tene heredado de pez
	}

}
