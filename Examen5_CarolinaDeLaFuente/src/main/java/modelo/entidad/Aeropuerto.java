package modelo.entidad;

import java.util.List;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private List<Avion> listaAviones;
	public Aeropuerto(String nombre, String ciudad, List<Avion> listaAviones) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.listaAviones = listaAviones;
	}
	public Aeropuerto() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public List<Avion> getListaAviones() {
		return listaAviones;
	}
	public void setListaAviones(List<Avion> listaAviones) {
		this.listaAviones = listaAviones;
	}
	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", ciudad=" + ciudad + ", listaAviones=" + listaAviones + "]";
	}
	
}
