package modelo.entidad;

import java.util.List;

public class Avion {
private int id;
private String marcaAvion;
private List<Asiento> listaAsientos;
private List<Motor> listaMotores;
private List<Rueda> listaRuedas;
private int kilometros;

public Avion(int id, String marcaAvion, List<Asiento> listaAsientos, List<Motor> listaMotores, List<Rueda> listaRuedas,
		int kilometros) {
	super();
	this.id = id;
	this.marcaAvion = marcaAvion;
	this.listaAsientos = listaAsientos;
	this.listaMotores = listaMotores;
	this.listaRuedas = listaRuedas;
	this.kilometros = kilometros;
}
public Avion() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMarcaAvion() {
	return marcaAvion;
}
public void setMarcaAvion(String marcaAvion) {
	this.marcaAvion = marcaAvion;
}
public List<Asiento> getListaAsientos() {
	return listaAsientos;
}
public void setListaAsientos(List<Asiento> listaAsientos) {
	this.listaAsientos = listaAsientos;
}
public List<Motor> getListaMotores() {
	return listaMotores;
}
public void setListaMotores(List<Motor> listaMotores) {
	this.listaMotores = listaMotores;
}
public List<Rueda> getListaRuedas() {
	return listaRuedas;
}
public void setListaRuedas(List<Rueda> listaRuedas) {
	this.listaRuedas = listaRuedas;
}
public int getKilometros() {
	return kilometros;
}
public void setKilometros(int kilometros) {
	this.kilometros = kilometros;
}
@Override
public String toString() {
	return "Avion [id=" + id + ", marcaAvion=" + marcaAvion + ", listaAsientos=" + listaAsientos + ", listaMotores="
			+ listaMotores + ", listaRuedas=" + listaRuedas + ", kilometros=" + kilometros + "]";
}

}
