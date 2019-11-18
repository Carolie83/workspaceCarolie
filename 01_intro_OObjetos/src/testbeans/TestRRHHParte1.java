package testbeans;
import beans.Departamento;
import beans.Empleado;
public class TestRRHHParte1 {

	public static void main(String[] args) {
		//LoDeArriba();
		Departamento dep1 = null;
		dep1 = findById(30);
		System.out.println(dep1);
	}
public static Departamento findById(int id) {
	if (id != 30)
		return null;
		Departamento dep30 = new Departamento(30, "ventas", null);
		Empleado emp114, emp115, emp116, emp300;
		
		emp114 = new Empleado(114, "diego", "martinez", "H", 45, 35_000, 2000, dep30);
		emp115 = new Empleado(115, "sara", "perez", "M", 35, 20_000, 1000, dep30);
		emp116 = new Empleado(116, "carlos", "sanchez", "H", 20, 18_000, 0, dep30);
		emp300 = new Empleado(300, "natalia", "vazquez", "m", 27, 60_000, 5500, dep30); 
		dep30.setJefe(emp114);
		return dep30;
	}
	public static void LoDeArriba(){
			Departamento dep30 = new Departamento(30, "ventas", null);
			Empleado emp114, emp115, emp116, emp300;
			
			emp114 = new Empleado(114, "diego", "martinez", "H", 45, 35_000, 2000, dep30);
			emp115 = new Empleado(115, "sara", "perez", "M", 35, 20_000, 1000, dep30);
			emp116 = new Empleado(116, "carlos", "sanchez", "H", 20, 18_000, 0, dep30);
			emp300 = new Empleado(300, "natalia", "vazquez", "m", 27, 60_000, 5500, dep30); 
			dep30.setJefe(emp114);
	/* creamos el departamento, introducimos los empleados  y finalmente, hacemos jefe a uno con set. 
	 * 20_000 el guion bajo indica miles desde última versión . 
	 * Recordar inportar beans departamento y empleado ya que nos seran necesarios, 
	 * public static void siempre hay que generarlo para hacer pruebas test.            */
			//asignación de jefe que pertenece a otro departamento a jefe de un departamento nuevo
			Departamento dep120 = new Departamento(120, "formacion", 
					new Empleado(225, "carmen", "gonzalez", "m", 43, 70_000, 10_000, dep30));
			
		dep120.getJefe().setDepartamento(dep120); /*del departamento 120 tengo acceso con get jefe al que hemos dicho que es jefe 
	que es el 225, con set departamento incluyo en este jefe (225)  la nueva direccion al nuevo departamento 120 
	del que ahora es jefe*/
			
	/*en jefe se puede crear la variable empleado o introducir un empleado nuevo. */
			Departamento dep130 = new Departamento(130, "logistica", emp300); 
			emp300.setDepartamento(dep130);
			
			System.out.println("dep120: " + dep120.getJefe().getDepartamento().getNombre());
			System.out.println("dep130: " + dep130.getJefe().getDepartamento().getNombre());
			//como se llama el nombre del departamento del jefe del 120 de derecha a izda
			
		}


}
