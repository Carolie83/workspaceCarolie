package testBeans;
import beans.Animal;
import beans.Gato;

public class TestVariablesAnimal {

	public static void main(String[] args) {
		Animal a1, a2, a3, a4, a5;/*en tiempo de compilacion(escribirfuente)al poner punto solo veo cosas de animal
		solo puedo ejecutar saludar y sonido*/
		Gato gato1;
		a1 = new Animal("Pulpo - rojizo");
		a2 = new Gato("montes - marron", 6);
		a3 = new Animal("camaleón - verde");
		a4 = new Gato("gatuno - marron", 2);
		a4.saludar();
		a4.sonido();
		((Gato) a4).mostrarDatos();		
		a5 = findAnimal();
		gato1 = (Gato)findAnimal();
		String tontada = (String) readObject();
		System.out.println(tontada);
		/*Gato g2 = (Gato) readObject(); hemos hecho casting a gato y devuelve string, no puede ser*/
		
	}
	public static Animal findAnimal() {
		return new Gato ("Callejero - blanco", 2);	
	}
	public static Object readObject() {
		return new String ("Vaya tela el Tomasín");
	}
}
