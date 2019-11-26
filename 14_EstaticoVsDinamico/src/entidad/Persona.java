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
	 * es un m�todo dinamico, el ciclo de vidad de este m�todo depende del objeto,
	 * un m�todo dinamico se crea SIN PONER STATIC
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
