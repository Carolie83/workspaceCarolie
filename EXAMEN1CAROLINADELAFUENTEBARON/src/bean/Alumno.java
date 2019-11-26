package bean;

public class Alumno {
//1º Declaro atributos de la case Alumno
private String dni;
private String nombreCompleto;
private String sexo;
private int edad;
private Curso curso;//variable curso de la clase Curso  se incluyer por existir relación de 1 a muchos.

//2º Realizo constructores
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


//3º Realizo Getter y setter para pode interactuar con los atributos
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
//4º introduzco @override  (to String)
@Override
public String toString() {
	
//5º Métodos reescritos de object
if (curso == null )
	return "Alumno [dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", sexo=" + sexo + ", edad=" + edad
			+ ", curso=" + curso + "]";
else
	return "Alumno [dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", sexo=" + sexo + ", edad=" + edad + "]";
}
	//6º Métodos responsabilidad de la clase

}
