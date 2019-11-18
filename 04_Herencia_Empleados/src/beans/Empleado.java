package beans;

public class Empleado {
	public final static int MESES_NOMINA = 14;
	public final static double VALOR_ACCION = 5;
		protected int idEmpleado;
		protected String nombre, apellidos, sexo;
		protected int edad;
		protected double salario;
		protected double comision;
		protected Departamento departamento;//variable departamento de la clase Departamento relación de 1 a muchos.
		
		public Empleado(int idEmpleado, String nombre, String apellidos, String sexo, int edad, double salario,
				double comision, Departamento departamento) {
			super();
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.sexo = sexo;
			this.edad = edad;
			this.salario = salario;
			this.comision = comision;
			this.departamento = departamento;
		}

		/*public Empleado( int idEmpleado, String nombre, String apellidos, String sexo, int edad, double salario)
		{ this.idEmpleado = idEmpleado ;  }
		public Empleado( int idEmpleado, String nombre, String apellidos)
		{  this.idEmpleado = idEmpleado  ; }*/ 
		
		
		
		public double getComision() {
			return comision;
		}

		public void setComision(double comision) {
			this.comision = comision;
		}

		public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}

		//con atributo private ya no lo veo, necesitamos : GET y SET
		 //OTRA FORMA RAPIDA: SOURCE-->GENERATE CONSTRUCTOR CON CAMPOS
		public int getIdEmpleado() {
			return idEmpleado;
		}

		/*public Empleado(int idEmpleado, String nombre, String apellidos, String sexo, int edad, double salario) {
			super();
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.sexo = sexo;
			this.edad = edad;
			this.salario = salario;}*/
		 

		public Empleado(int idEmpleado, String nombre, String apellidos) {
			super();
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;}
		
//este método vacio meterlo siempre para los orcos
		public Empleado() {
			super();
		}

		public Empleado(int idEmpleado, String nombre, String apellidos, String sexo, int edad, double salario) {
			super();
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.sexo = sexo;
			this.edad = edad;
			this.salario = salario;
		}
		
		

		public void setIdEmpleado(int idEmpleado) {
			this.idEmpleado = idEmpleado;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
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

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		//forma rapida: pinchaer en código, boton derecho--> source-->generate toString--> selleccionar capos..lugar...
		
		@Override
		public String toString() {
			return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
					+ sexo + ", edad=" + edad + ", salario=" + salario + ", comision=" + comision + ", departamento="
					+ departamento + "]";
		}

		
		//para avisar a los q trabajen con ello que el método ha sido reescrito se pone @ override
		//el hijo empleado reescribe de la case del padre object
		//@Override   
	//public String toString() {
		
		//return "nombre : " + nombre + " salario : " + salario;
		public String nombreCompleto() {
			return apellidos + ", " + nombre;}
			public double salarioMensual() {
				return (salario + comision)/MESES_NOMINA; }
			public double salarioMensual(int meses) {
			return (salario + comision)/meses;}
			public double aumentarSalario (double aumento) {
				return salario *= ( 1 + (aumento/100));//salario = salario * 1 + (aumento/100)
			}
	//public double salarioMensual()  está sobrecargado el método, si no me das datos lo divido entre 14 si me das meses
	//lo divido ente meses.Empleado Mismo nombre de metodo, distinas funciones segun lo que recibo
			
//ver ejercicio profe
//hemos cambiado atributos a protected para que las clases gerente y director hereden de Empleado

public double totalSalario() {
	return salario + comision;}
//nombre completo y aumentar salario,nos vale para los hijos tal cual sin cambiar nada pero en otros habrá que redefinir.
}

