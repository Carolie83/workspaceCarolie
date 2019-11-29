package modelo.entidad;

public class JefeProyecto extends Empleado {
private double incentivos;

	@Override
	public double sueldoTotal() {
		return (salarioBase + incentivos);

	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public String toString() {
		return "JefeProyecto [incentivos=" + incentivos + ", getDni()=" + getDni() + ", getNombre()=" + getNombre()
				+ ", getSalarioBase()=" + getSalarioBase() + ", getEdad()=" + getEdad() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
