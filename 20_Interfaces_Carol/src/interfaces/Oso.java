package interfaces;

public class Oso extends Animal implements Movible{
//Eclipse como la clase no se marcó como abstracta directamente implementa el método
	@Override
	public void comer(Object comida) {
		if (comida instanceof Animal) {
			Animal a =(Animal)comida;
			System.out.println("soy un oso que me llamo" + nombre + "y me voy aq coer al animal de tipo" + a.getClass().getSimpleName() + " y q se llama" + a.nombre);
		}
		else { System.out.println("EY Ey Ey bubu, los osos solo comemos animales");
		}
	}

@Override
public void moverseLento() {
	System.out.println("Soy un oso y me muevo 5 metros");
	
}

@Override
public void moverse(int metros) {
	System.out.println("Soy un oso y si corro es que hay comida y me muevo " + metros + "metros");
	
}

}
