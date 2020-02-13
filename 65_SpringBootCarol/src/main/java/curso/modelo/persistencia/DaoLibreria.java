package curso.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.modelo.entidad.Libro;


public interface DaoLibreria extends JpaRepository<Libro, Integer>{
	
	public Libro findByIsbn(String isbn);
	public List<Libro> findByEditorial(String editorial);
}
