package bean;

public class Profesor {
	//1º Declaro atributos de la case Alumno
	private String dni;
	private String nombre;
	private int edad;
	private double salario;
	private String sexo;
	
	
	//2º Realizo constructores
	public Profesor(String dni, String nombre, int edad, double salario, String sexo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.sexo = sexo;
	}
	public Profesor() {
		super();
	}
	//3º Realizo Getter y setter para pode interactuar con los atributos
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	//4º introduzco @override  (to String)
	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", sexo="
				+ sexo + "]";
	}
	//5º Métodos reescritos de object
	
	//6º Métodos responsabilidad de la clase
	public double salarioMensual(int meses) {
		return (salario)/meses;
	}
}
