package modelo.entidad;

import java.util.ArrayList;

public class Director extends Empleado {
	private ArrayList<Empleado> subEmpleados;

	public ArrayList<Empleado> getSubEmpleados() {
		return subEmpleados;
	}

	public void setSubEmpleados(ArrayList<Empleado> subEmpleados) {
		this.subEmpleados = subEmpleados;
	}

	@Override
	public double sueldoTotal() {
		return (salarioBase + (subEmpleados.size() * 100));//subempleados punto size, es el número de empleados

	}

	@Override
	public String toString() {
		return "Director [subEmpleados=" + subEmpleados + ", getDni()=" + getDni() + ", getNombre()=" + getNombre()
				+ ", getSalarioBase()=" + getSalarioBase() + ", getEdad()=" + getEdad() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
