package testbeans;
import beans.Empleado;

public class TestEmpleado {
	public static void main(String[] args) {
		Empleado emp1, emp2, emp3;
		emp1 = new Empleado();
		emp2 = new Empleado(127, "sara", "robles", "m", 22, 30000);
	//	emp2 = new Empleado(114, "eva", "perez", 25, 3200, "m");
		emp3 = new Empleado(119, "miriam", "santos","m", 34, 7000);
		emp1.setIdEmpleado(23);
		emp1.setNombre("ramon");
		emp1.setApellidos("pepino");
		emp1.setEdad(43);
		emp1.setSalario(31000);
		emp1.setSexo("H");
		/*emp1.idEmpleado= 100;
		emp1.nombre = "tomas";
		emp1.apellidos = "escu delgado";
		emp1.edad = 58;
		emp1.salario = 25000;
		emp1.sexo = "h";
			emp2.idEmpleado= 105;
			emp2.nombre = "carol";
			emp2.apellidos = "de la Fuente";
			emp2.edad = 35;
			emp2.salario = 90000;
			emp2.sexo = "m";
				emp3.idEmpleado= 107;
				emp3.nombre = "cucu";
				emp3.apellidos = "drulu";
				emp3.edad = 23;
				emp3.salario = 67000;
				emp3.sexo = "h";   */
		//si ahora igualo empleado 2 a 3 el emp2 pasa a apuntar al emp3
		System.out.println(emp1.toString());
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp2.getNombre());
		System.out.println(emp2.getNombre().charAt(3));
	}

}
