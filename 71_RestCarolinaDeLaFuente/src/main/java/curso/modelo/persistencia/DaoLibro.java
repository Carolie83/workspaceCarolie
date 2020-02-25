package curso.modelo.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.modelo.entidad.Libro;


public interface DaoLibro extends JpaRepository<Libro, Integer>{
	/**Escribimos métodos que no existen como tal, y escribimos de forma similar a los que escribimos en gestor porque ya están interiorizados,
	pero con el parametro que necesitamos**/
	public Optional<Libro> findByIsbn(String isbn);
	public List<Libro> findByEditorial(String editorial);
	
}
