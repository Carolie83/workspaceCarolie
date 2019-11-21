package modelo.entidad;

import java.util.ArrayList;

public class Libreria {
private String nombreLibreria;
private ArrayList<Libro> listaLibros;
public Libreria(String nombreLibreria, ArrayList<Libro> listaLibros) {
	super();
	this.nombreLibreria = nombreLibreria;
	this.listaLibros = listaLibros;
}
public Libreria() {
	super();
}
public String getNombreLibreria() {
	return nombreLibreria;
}
public void setNombreLibreria(String nombreLibreria) {
	this.nombreLibreria = nombreLibreria;
}
public ArrayList<Libro> getListaLibros() {
	return listaLibros;
}
public void setListaLibros(ArrayList<Libro> listaLibros) {
	this.listaLibros = listaLibros;
}
@Override
public String toString() {
	return "Libreria [nombreLibreria=" + nombreLibreria + ", listaLibros=" + listaLibros + "]";
}

}
