package bean;

public class Habitacion {
private double m2;
private String tipo;

public Habitacion(double m2, String tipo) {
	super();
	this.m2 = m2;
	this.tipo = tipo;
}

public Habitacion() {
	super();
}

public double getM2() {
	return m2;
}
public void setM2(double m2) {
	this.m2 = m2;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}

@Override
public String toString() {
	return "Habitacion [m2=" + m2 + ", tipo=" + tipo + "]";
}

}
