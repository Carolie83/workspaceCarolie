package bean;

import java.util.ArrayList;

public class Casa {
		private double precio;
		private ArrayList<Habitacion> listaHabitacion;
		private Persona propietario;
		private Direccion direccion;
		public Casa(double precio, ArrayList<Habitacion> listaHabitacion, Persona propietario, Direccion direccion) {
			super();
			this.precio = precio;
			this.listaHabitacion = listaHabitacion;
			this.propietario = propietario;
			this.direccion = direccion;
		}
		public Casa() {
			super();
		}
		
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public ArrayList<Habitacion> getListaHabitacion() {
			return listaHabitacion;
		}
		public void setListaHabitacion(ArrayList<Habitacion> listaHabitacion) {
			this.listaHabitacion = listaHabitacion;
		}
		public Persona getPropietario() {
			return propietario;
		}
		public void setPropietario(Persona propietario) {
			this.propietario = propietario;
		}
		public Direccion getDireccion() {
			return direccion;
		}
		public void setDireccion(Direccion direccion) {
			this.direccion = direccion;
		}
		@Override
		public String toString() {
			return "Casa [precio=" + precio + ", listaHabitacion=" + listaHabitacion + ", propietario=" + propietario
					+ ", direccion=" + direccion + "]";
		}
		
}

