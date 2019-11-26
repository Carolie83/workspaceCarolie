package bean;

public class Alumno {
//1� Declaro atributos de la case Alumno
private String dni;
private String nombreCompleto;
private String sexo;
private int edad;
private Curso curso;//variable curso de la clase Curso  se incluyer por existir relaci�n de 1 a muchos.

//2� Realizo constructores
public Alumno(String dni, String nombreCompleto, String sexo, int edad, Curso curso) {
	super();
	this.dni = dni;
	this.nombreCompleto = nombreCompleto;
	this.sexo = sexo;
	this.edad = edad;
	this.curso = curso;
}
public Alumno() {
	super();
}


//3� Realizo Getter y setter para pode interactuar con los atributos
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getNombreCompleto() {
	return nombreCompleto;
}
public void setNombreCompleto(String nombreCompleto) {
	this.nombreCompleto = nombreCompleto;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public Curso getCurso() {
	return curso;
}
public void setCurso(Curso curso) {
	this.curso = curso;
}
//4� introduzco @override  (to String)
@Override
public String toString() {
	
//5� M�todos reescritos de object
if (curso == null )
	return "Alumno [dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", sexo=" + sexo + ", edad=" + edad
			+ ", curso=" + curso + "]";
else
	return "Alumno [dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", sexo=" + sexo + ", edad=" + edad + "]";
}
	//6� M�todos responsabilidad de la clase

}
