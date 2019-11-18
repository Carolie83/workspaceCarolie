package beans;

public class Departamento {
	private int idDepartamento;
	private String nombre;
	private Empleado jefe;//atributo jefe de la clase Empleado relación de 1 a muchos.
	
	public Departamento(int idDepartamento, String nombre, Empleado jefe) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
		this.jefe = jefe;   }
	public Departamento() {    }
	public Departamento(int idDepartamento, String nombre) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;  }
	public Empleado getJefe() {
		return jefe;  }
	public void setJefe(Empleado jefe) {
		this.jefe = jefe;  }
	public int getIdDepartamento() {
		return idDepartamento;  }
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;  }
	public String getNombre() {
		return nombre;  }
	public void setNombre(String nombre) {
		this.nombre = nombre;  }
	@Override
	public String toString() {
		if (jefe == null)
		{return "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", jefe=" + jefe + "]";  }
		else
	{return "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", jefe=" + jefe.getIdEmpleado() + "]";}
	}}
/*@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", jefe=" + jefe + "]";  }	
 * *///para eliminar el bucle o hago lo de arriba o elimino el que da problema jefe:
	// "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre /*+ ", jefe=" + jefe*/ + "]";*/
 