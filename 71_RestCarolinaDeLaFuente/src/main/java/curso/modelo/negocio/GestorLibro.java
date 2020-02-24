package curso.modelo.negocio;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.Libro;

import curso.modelo.persistencia.DaoLibro;
/**Esta anotación es para que encuentre y use esta clase como gestor**/
@Service
public class GestorLibro {
	/**En este caso lo que necesita la capa gestora para funcionar es el DaoLibro y se lo inyectamos con @Autowired**/
	@Autowired
	private DaoLibro daoLibro;
/**este métodos nos va a listar todos los libros**/
	public List<Libro> listarLibros(){
		return daoLibro.findAll();
	}
	
	/**
	 * Dar de alta un libro
	 * @param Libro libro a dar de alta
	 * @return 0 en caso de que haya ido bien, 1 en caso de que falte el isbn, 2 en caso de que falte el titulo  y 3 en caso
	 *  de que el isbn este duplicado **/
	@Transactional
	public int alta(Libro libro) {
		 
		if(libro.getIsbn().isEmpty()) {
			return -1;
		}
		
		if(libro.getTitulo().isEmpty()) {
			return -2;
		}
		if(libro.getEditorial().isEmpty()) {
			return -3;
		}
		if(libro.getAnioPublicacion()==0) {
			return -4;
		} 
		
		daoLibro.save(libro);
		return libro.getId();
	}
		
	/**devuelve un optional hay que hacer una comprobacion de si llega o no**/
	
	 public Optional<Libro> buscarPorId(int id) {
		 return daoLibro.findById(id);
	 }
	//buscar por ISBN
	 public Optional<Libro> buscarPorIsbn(String isbn) {
			
			return daoLibro.findByIsbn(isbn);
		
		}
	 /**Modificar por Isbn**/
	 @Transactional
	 public int modificarPorIsbn(String isbn, Libro libro) {
		 Optional<Libro> opt = daoLibro.findByIsbn(isbn);
		 if(opt.isPresent()) {
				daoLibro.save(libro);
				return libro.getId();
			}else {
				return -1;
			}
	
}
	@Transactional
	 /**Borrar por id**/
	 public Optional<Libro> borrarPorId(int id) {
		 Optional<Libro> opt = daoLibro.findById(id);
		 if(opt.isPresent()) {
				daoLibro.deleteById(id);
				return opt;
				}else {
					return opt;
				}
}	
}
