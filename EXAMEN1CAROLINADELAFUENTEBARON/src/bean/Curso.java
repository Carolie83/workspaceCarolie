package bean;

public class Curso {
	//1� Declaro atributos de la case Alumno
	private int idCurso;
	private String nombreCurso;
	private double horas;
	private double precio;
	private Profesor profesor;//variable profesor de la clase Profesor  se incluyer por existir relaci�n de 1 a muchos.
	
	
	//2� Realizo constructores
	public Curso(int idCurso, String nombreCurso, double horas, double precio, Profesor profesor) {
		super();
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.horas = horas;
		this.precio = precio;
		this.profesor = profesor;
	}
	public Curso() {
		super();
	}
	
	//3� Realizo Getter y setter para pode interactuar con los atributos
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + ", horas=" + horas + ", precio=" + precio
				+ ", profesor=" + profesor + "]";
	}

	//4� introduzco @override  (to String)
	//5� M�todos reescritos de object
	
	//6� M�todos responsabilidad de la clase
	public String datosProfesor() {
	return profesor.getNombre() ;
	
}
}
