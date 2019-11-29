package modelo.entidad;

public abstract class Empleado {
	//atributos comunes que heredarán las otras clases
protected String dni;
protected String nombre;
protected double salarioBase;
protected int edad;
 //metodo q sobreescribiremos en cada clase
public abstract double sueldoTotal();
//constructores
public Empleado(String dni, String nombre, double salarioBase, int edad) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.salarioBase = salarioBase;
	this.edad = edad;
}

public Empleado() {
	super();
}
//getter y setter
public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getSalarioBase() {
	return salarioBase;
}

public void setSalarioBase(double salarioBase) {
	this.salarioBase = salarioBase;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}
//to String
@Override
public String toString() {
	return "Empleado [dni=" + dni + ", nombre=" + nombre + ", salarioBase=" + salarioBase + ", edad=" + edad + "]";
}

}