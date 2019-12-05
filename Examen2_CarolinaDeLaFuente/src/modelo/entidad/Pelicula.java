package modelo.entidad;

public class Pelicula {
	private int id;
	private String titulo;
	private String director;
	private String genero;
	private int anioDePublicacion;
	public Pelicula(int id, String titulo, String director, String genero, int anioDePublicacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.anioDePublicacion = anioDePublicacion;
	}
	public Pelicula(String titulo, String director, String genero, int anioDePublicacion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.anioDePublicacion = anioDePublicacion;
	}
	public Pelicula() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAnioDePublicacion() {
		return anioDePublicacion;
	}
	public void setAnioDePublicacion(int anioDePublicacion) {
		this.anioDePublicacion = anioDePublicacion;
	}
	@Override
	public String toString() {
		return "pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero
				+ ", anioDePublicacion=" + anioDePublicacion + "]";
	}
	
}
