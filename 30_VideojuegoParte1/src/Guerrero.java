
public class Guerrero {
	private String nombre;
	private Arma arma;
	
	
	public void atacar() {
		System.out.println("Soy el guerrero " + nombre + ".. ARGGGGGGG!!!!");
		arma.usar();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Arma getArma() {
		return arma;
	}


	public void setArma(Arma arma) {
		this.arma = arma;
	}


	
	
}
