package bean;

public class Pelicula {
private String titulo;
private String genero;
private Director director;
private int aņoDeEstreno;
public Pelicula(String titulo, String genero, Director director, int aņoDeEstreno) {
	super();
	this.titulo = titulo;
	this.genero = genero;
	this.director = director;
	this.aņoDeEstreno = aņoDeEstreno;
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
public int getAņoDeEstreno() {
	return aņoDeEstreno;
}
public void setAņoDeEstreno(int aņoDeEstreno) {
	this.aņoDeEstreno = aņoDeEstreno;
}
@Override
public String toString() {
	return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", aņoDeEstreno="
			+ aņoDeEstreno + ", getTitulo()=" + getTitulo() + ", getGenero()=" + getGenero() + ", getDirector()="
			+ getDirector() + ", getAņoDeEstreno()=" + getAņoDeEstreno() + "]";
}

}




