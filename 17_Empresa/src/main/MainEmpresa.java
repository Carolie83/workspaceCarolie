package main;

import java.util.ArrayList;

import bean.Director;
import bean.Empleado;
import bean.JefeProyecto;
import bean.Programador;

public class MainEmpresa {

	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		Programador programador1 = new Programador();
		programador1.setDni("555555e");
		programador1.setEdad(21);
		programador1.setNombre("Pepito");
		programador1.setSalarioBase(12_000);
		listaEmpleados.add(programador1);
		
		Programador programador2 = new Programador();
		programador2.setDni("666666q");
		programador2.setEdad(22);
		programador2.setNombre("Albertito");
		programador2.setSalarioBase(13_000);
		listaEmpleados.add(programador2);
		
		Programador programador3 = new Programador();
		programador3.setDni("7777777w");
		programador3.setEdad(23);
		programador3.setNombre("Martinita");
		programador3.setSalarioBase(14_000);
		listaEmpleados.add(programador3);
		
		Programador programador4 = new Programador();
		programador4.setDni("88888888z");
		programador4.setEdad(24);
		programador4.setNombre("Josito");
		programador4.setSalarioBase(15_000);
		listaEmpleados.add(programador4);
		
		/*Se podría usar p1 para los 4, son referencias y no se
		 *  machacan los objetos porque están soportados en el arraylist*/
		 
		JefeProyecto jefeProyecto1 = new JefeProyecto();
		jefeProyecto1.setDni("4444444t");
		jefeProyecto1.setEdad(26);
		jefeProyecto1.setNombre("Camilo");
		jefeProyecto1.setSalarioBase(28_000);
		jefeProyecto1.setIncentivos(1_000);
		listaEmpleados.add(jefeProyecto1);
		
		JefeProyecto jefeProyecto2 = new JefeProyecto();
		jefeProyecto2.setDni("33333333y");
		jefeProyecto2.setEdad(27);
		jefeProyecto2.setNombre("Jorge");
		jefeProyecto2.setSalarioBase(29_000);
		jefeProyecto2.setIncentivos(1500);
		listaEmpleados.add(jefeProyecto2);
		
		
		Director director1 = new Director();
		director1.setDni("222222f");
		director1.setEdad(35);
		director1.setNombre("Carol");
		director1.setSalarioBase(40_000);
		ArrayList<Empleado> subEmpleados = new ArrayList<Empleado>();
		subEmpleados.add(jefeProyecto1);
		subEmpleados.add(programador2);
		subEmpleados.add(programador1);
		director1.setSubEmpleados(subEmpleados);
		listaEmpleados.add(director1);
	
	System.out.println("El sueldo total del director es : " + director1.sueldoTotal());
	for (Empleado salariosEmpleado: subEmpleados) {
	
		System.out.println("Nombre empleado : " + salariosEmpleado.getNombre()+"----"  +
		" Tipo empleado : " + salariosEmpleado.getClass()+"----" +" Sueldo : " +
		salariosEmpleado.sueldoTotal());
		
	}
	for (Empleado empleado: listaEmpleados) {
		System.out.println("Nombre empleado : " + empleado.getNombre() +"---- " + 
	"Sueldo Total : " + empleado.sueldoTotal());
	}
	}/*EMPLEAMOS POLIMORFISMO.SEGÚN OBJETO AL QUE APUNTAMOS CALCULA SUELDO TOTAL,
	 SEGÚN SU MÉTODO SOBREESCRITO*/
 
}
