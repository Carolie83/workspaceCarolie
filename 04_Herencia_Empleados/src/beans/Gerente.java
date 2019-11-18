package beans;
public class Gerente extends Empleado {
	private int plazaGaraje;
	private String movil;
	private double variable;
	public Gerente() {
		super();}
	public Gerente(int idEmpleado, String nombre, String apellidos, String sexo, int edad, double salario,
			double comision, Departamento departamento, int plazaGaraje, String movil, double variable) {
		super(idEmpleado, nombre, apellidos, sexo, edad, salario, comision, departamento);
		this.plazaGaraje = plazaGaraje;
		this.movil = movil;
		this.variable = variable;}
	public int getPlazaGaraje() {
		return plazaGaraje;}
	public void setPlazaGaraje(int plazaGaraje) {
		this.plazaGaraje = plazaGaraje;}
	public String getMovil() {
		return movil;}
	public void setMovil(String movil) {
		this.movil = movil;}
	public double getVariable() {
		return variable;}
	public void setVariable(double variable) {
		this.variable = variable;}
	@Override
	public String toString() {
	if (departamento == null)
	return "Gerente [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
	+ sexo + ", edad=" + edad + ", salario=" + salario + ", comision=" + comision + ", departamento="
	+ departamento + ", plazaGaraje=" + plazaGaraje + ", movil=" + movil + ", variable=" + variable + "]";
	else
	return "Gerente [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
	+ sexo + ", edad=" + edad + ", salario=" + salario + ", comision=" + comision + ", departamento="
	+ departamento.getIdDepartamento() + ", plazaGaraje=" + plazaGaraje + ", movil=" + movil + ", variable=" + variable + "]";
	}
	@Override
	public double salarioMensual() {
	
		return ( (salario + comision + variable)/MESES_NOMINA);
	}
	@Override
	public double salarioMensual(int meses) {

		return ((salario + comision + variable)/meses);
	}
	@Override
	public double totalSalario() {
		
		return (salario + comision+ variable);
	}
	
	}

