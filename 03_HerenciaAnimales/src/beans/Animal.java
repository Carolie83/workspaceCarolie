package beans;

public class Animal {
	protected String color; //pongo protected para que gato pueda usar mi atributo color
	public Animal() {
		super();
	}
	public Animal(String color) {
		super();
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Animal [color=" + color + "]";
	}
	public void saludar() {  System.out.println("Soy un animal");}
	public void sonido() { System.out.println("soy ficticio ni P.i. del sonido que hago");}
	
	
}
