package main;
import java.util.ArrayList;
import bean.Casa;
import bean.Direccion;
import bean.Habitacion;
import bean.Persona;
public class MainCasa {
	public static void main(String[] args) {
		Habitacion cocina = new Habitacion();
		Habitacion baño = new Habitacion();
		Habitacion dormitorio = new Habitacion();
		Habitacion salon = new Habitacion();
		cocina.setM2(13);
		cocina.setTipo("cocina");
		baño.setM2(9);
		baño.setTipo("baño");
		dormitorio.setM2(15);
		dormitorio.setTipo("dormitorio");
		salon.setM2(25);
		salon.setTipo("salon");
		
		ArrayList<Habitacion> listaHabitacion = new ArrayList<Habitacion>();
		
		listaHabitacion.add(cocina);
		listaHabitacion.add(baño);
		listaHabitacion.add(dormitorio);
		listaHabitacion.add(salon);
		
		Persona propietario = new Persona("carolina", 35, 60);
		Direccion dirPropietario = new Direccion("Calle", "Alfredo Nobel", "Alcorcón", "28921");
		propietario.setDireccion(dirPropietario);
		Direccion dirCasa = new Direccion("Calle", "Hermanamiento", "Madrid", "28922");
		Casa casa1 = new Casa(250000, listaHabitacion, propietario, dirCasa);
		casa1.setDireccion(dirCasa);
		
		System.out.println(casa1);
		System.out.println(propietario);
		System.out.println(casa1.getListaHabitacion());	
	}
}
