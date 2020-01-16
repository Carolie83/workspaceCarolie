package modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pelicula {
	private String titulo;
	private String genero;
	@Autowired 
	//autowired por defecto es por tipo y por name
	@Qualifier("director")
	// esto se puede omitir porque solo hay uno, pero hay que tener cuidado si puede haber mas
	//va en conjunto con @Autowired, y luego le decimos el id del objeto que queremos que le inyecte
	// con qualifier inyectamos el que queremos especificamente si hay mas directores.
	private Director Director;
	private int anioEstreno;
	
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
		return Director;
	}
	public void setDirector(Director director) {
		Director = director;
	}
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", Director=" + Director + ", anioEstreno="
				+ anioEstreno + "]";
	}
}
