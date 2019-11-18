package testBeans;

import beans.Animal;
import beans.Gato;

public class TestZoologico {

	public static void main(String[] args) {
	Animal a1 = new Animal("camaleon - verde");
	Animal a2 = new Animal("hipotatimo - marrón");
	
	Gato gato1 = new Gato("gato siaqmes", 7);
	Gato gato2 = new Gato("callejero", 5);
	
	a1.sonido();
	gato1.sonido();
	Animal [] zoo = {  a1,a2,gato1,gato2};
	for (Animal ele: zoo)//como ele es de animal solo veo los métods de animal
	{ele.sonido();
	/* if (ele instanceof Gato ) {
			((Gato) ele).mostrarDatos().al poner ele.sale metodos de animal, mostrarDatos es de gato, 
			y hace casting automáticamente*/
		}
		}
	}

