package modelo.entidad;

public class Coche {
private int id;
private String matricula;
private String marca;
private String Modelo;
public Coche(String matricula, String marca, String modelo) {
	super();
	this.matricula = matricula;
	this.marca = marca;
	Modelo = modelo;
}
public Coche() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return Modelo;
}
public void setModelo(String modelo) {
	Modelo = modelo;
}
@Override
public String toString() {
	return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", Modelo=" + Modelo + "]";
}

}
