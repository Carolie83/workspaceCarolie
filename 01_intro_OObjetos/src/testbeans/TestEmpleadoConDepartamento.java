package testbeans;

import beans.Departamento;
import beans.Empleado;

public class TestEmpleadoConDepartamento {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado(200, "eva", "perez", "m", 34, 120000, 100, null);
		
		
		Departamento dep40 = new Departamento(40, "Formacion");
		Empleado emp2 = new Empleado(210, "sara", "ruiz", "m", 47, 98000, 300, dep40);
		
		System.out.println(emp1);
		System.out.println(emp2);
		/*mostrar por consola el nombre del empleado 2, su salario y el nobre del departamento al que pertenece el empleado2,
		 *  el empleado 1 no lo podemos hacer porque casca porque tiene un campo null*/

		
		System.out.println("nombre empleado 2 - sara : " + emp2.getNombre());
		System.out.println("salario empleado 2 - 98000 : " + emp2.getSalario());
		System.out.println("nombre dep del empleado 2 - formacion : " + emp2.getDepartamento().getNombre().toUpperCase());
		
	}

}
