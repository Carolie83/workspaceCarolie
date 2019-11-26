package entidad;

public class Oso extends Animal {
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

}
