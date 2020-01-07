package cliente.modelo.entidad;

public class ClientePelicula {
	private int id;
	private String titulo;
	private String director;
	
	public ClientePelicula(int id, String titulo, String director) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.director = director;
	}

	public ClientePelicula() {
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

	@Override
	public String toString() {
		return "ServidorPelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + "]";
	}
	
}
