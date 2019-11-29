package vistaMenuEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.entidad.Director;
import modelo.entidad.Empleado;
import modelo.entidad.JefeProyecto;
import modelo.entidad.Programador;
import modelo.negocio.GestorEmpresa;

public class MenuEmpleados {

	public static void main(String[] args) {
		/*
		 * Esta clase hace labores de vista, cuya funcion basicamente es la de
		 * comunciarse con el cliente (entrada y salida de información. Así como
		 * interacturar con la capa de modelo.negocio
		 */
		Scanner sc = new Scanner(System.in);
		String opcion = "0";

		/*
		 * creamos el gestor Empresa que es el que va a llevar la logica de la
		 * aplicacion
		 */
		GestorEmpresa gEmp = new GestorEmpresa();
		/*
		 * el gestor empresa necesita de un array para funcionar lo creamos y se
		 * lopasamos
		 */
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		gEmp.setListaEmpleados(listaEmpleados);

		do {
			System.out.println("Pulse :1- Alta de empleado / 2- lista de Empleados /"
					+ "3- Calcular sueldo total (salario) de empleados / 0- Salir del program");
			opcion = sc.nextLine();
			if (opcion.equals("1")) {
				System.out.println("Pulse :1- Alta Programador/2- Alta Jefe de Proyecto /3- Alta Director :");
				opcion = sc.nextLine();

				switch (opcion) {
				case "1": {
					System.out.println("Introduzca programador : ");
					System.out.println("Introduzca nombre del programador");
					String nombre = sc.nextLine();
					System.out.println("Introduzca dni del programador");
					String dni = sc.nextLine();
					System.out.println("Introduzca salario base del programador");
					String salarioBase = sc.nextLine();
					System.out.println("Introduzca edad del programador");
					String edad = sc.nextLine();

					double dSalarioBase = Double.parseDouble(salarioBase);
					int iEdad = Integer.parseInt(edad);
					Programador programador = new Programador();
					programador.setNombre(nombre);
					programador.setDni(dni);
					
					programador.setSalarioBase(dSalarioBase);
					
					programador.setEdad(iEdad);
					gEmp.altaEmpleado(programador);
					break; // nextLine coje toda la frase, next coje palabra
				}
				case "2": {
					System.out.println("Introduzca Jefe de proyecto : ");
					System.out.println("Introduzca nombre del jefe de proyecto");
					String nombre = sc.nextLine();
					System.out.println("Introduzca dni del jefe de proyecto");
					String dni = sc.nextLine();
					System.out.println("Introduzca salario base del jefe de proyecto");
					String salarioBase = sc.nextLine();
					System.out.println("Introduzca edad del jefe de proyecto");
					String edad = sc.nextLine();
					System.out.println("Introduzca incentivos del jefe de proyecto");
					String incentivos = sc.nextLine();

					double dSalarioBase = Double.parseDouble(salarioBase);
					int iEdad = Integer.parseInt(edad);
					double dIncentivos = Double.parseDouble(incentivos);
					JefeProyecto jefeProyecto = new JefeProyecto();
					jefeProyecto.setNombre(nombre);
					jefeProyecto.setDni(dni);
					jefeProyecto.setEdad(iEdad);
					jefeProyecto.setSalarioBase(dSalarioBase);
					jefeProyecto.setIncentivos(dIncentivos);
					gEmp.altaEmpleado(jefeProyecto);

					break;
				}
				case "3": {
					System.out.println("Introduzca director : ");
					System.out.println("Introduzca nombre del director");
					String nombre = sc.nextLine();
					System.out.println("Introduzca dni del director");
					String dni = sc.nextLine();
					System.out.println("Introduzca salario base del director");
					String salarioBase = sc.nextLine();
					System.out.println("Introduzca edad del director");
					String edad = sc.nextLine();
					//System.out.println("Introduzca empleados a cargo del director");
//esto nos lo enseña profe en la correccion
					//ArrayList<Empleado> subEmpleados;
					double dSalarioBase = Double.parseDouble(salarioBase);
					int iEdad = Integer.parseInt(edad);
					Director director = new Director();
					director.setNombre(nombre);
					director.setEdad(iEdad);
					director.setDni(dni);
					director.setSalarioBase(dSalarioBase);
					//director.setSubEmpleados(subEmpleados);//esto nos lo enseña profe en la correccion
					
					gEmp.altaEmpleado(director);

					break;
				}
				default:
					System.out.println("marque una opción correcta");
				}
			} else if (opcion.equals("2")) {
				System.out.println("Lista de Empleados : ");
				ArrayList<Empleado> listaTrabajador = gEmp.getListaEmpleados();
				for (Empleado trabajador : listaTrabajador) {
					System.out.println(trabajador.getNombre());
				}
			} else if (opcion.equals("3")) {
				System.out.println("Salarios /Sueldos Totales calculados");
				ArrayList<Empleado> listaTrabajadores = gEmp.getListaEmpleados();

				for (Empleado trabajador : listaTrabajadores) {
					System.out.println("Nombre empleado : " + trabajador.getNombre() + "---- " + "Sueldo Total : "
							+ trabajador.sueldoTotal());
				}
			}

		} while (!opcion.equals("0"));
		System.out.println("Fin del programa");
		sc.close();

	}

}
