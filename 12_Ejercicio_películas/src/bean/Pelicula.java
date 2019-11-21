package bean;

public class Pelicula {
private String titulo;
private String genero;
private Director director;
private int añoDeEstreno;
public Pelicula(String titulo, String genero, Director director, int añoDeEstreno) {
	super();
	this.titulo = titulo;
	this.genero = genero;
	this.director = director;
	this.añoDeEstreno = añoDeEstreno;
}
public Pelicula() {
	super();
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public Director getDirector() {
	return director;
}
public void setDirector(Director director) {
	this.director = director;
}
public int getAñoDeEstreno() {
	return añoDeEstreno;
}
public void setAñoDeEstreno(int añoDeEstreno) {
	this.añoDeEstreno = añoDeEstreno;
}
@Override
public String toString() {
	return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", añoDeEstreno="
			+ añoDeEstreno + ", getTitulo()=" + getTitulo() + ", getGenero()=" + getGenero() + ", getDirector()="
			+ getDirector() + ", getAñoDeEstreno()=" + getAñoDeEstreno() + "]";
}

}




