package modelo.entidad;

public class Programador extends Empleado {

	@Override
	public double sueldoTotal() {
		return salarioBase;

	}

	@Override
	public String toString() {
		return "Programador [getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getSalarioBase()="
				+ getSalarioBase() + ", getEdad()=" + getEdad() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
