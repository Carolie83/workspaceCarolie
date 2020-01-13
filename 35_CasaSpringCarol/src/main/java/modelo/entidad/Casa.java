package modelo.entidad;


import java.util.List;

public class Casa {
		private double precio;
		private List<Habitacion> listaHabitacion;
		private Persona propietario;
		private Direccion direccion;
		
		
		
		public Casa() {
			super();
		}
		public Casa(double precio, List<Habitacion> listaHabitacion, Persona propietario, Direccion direccion) {
			super();
			this.precio = precio;
			this.listaHabitacion = listaHabitacion;
			this.propietario = propietario;
			this.direccion = direccion;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public List<Habitacion> getListaHabitacion() {
			return listaHabitacion;
		}
		public void setListaHabitacion(List<Habitacion> listaHabitacion) {
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

