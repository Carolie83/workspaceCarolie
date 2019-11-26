package entidad;

public class Persona {
	private String Nombre;
	private int edad;
	public static int numeroPesonas = 0;
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/*
	 * es un método dinamico, el ciclo de vidad de este método depende del objeto,
	 * un método dinamico se crea SIN PONER STATIC
	 */
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", edad=" + edad + "]";
	}

}
