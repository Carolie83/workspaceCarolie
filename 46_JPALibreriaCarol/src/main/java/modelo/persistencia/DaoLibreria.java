package modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelo.entidad.Libro;

//Para crear ahora el dao con JPAData debemos
	//de crear una intefaz y extenderla de JpaRepository
	//y tiene dos valores parametrizados, uno es el tipo de 
	//entidad con el que queremos trabajar (Pelicula) y el otro seria
	//el tipo de dato que es el id, en nuestro caso es Integer
	@Repository
	public interface DaoLibreria extends JpaRepository<Libro, Integer>{
		
//para hacer consultas especificas, podemos hacerlas dentro de esta interfaz, y sigue una metodologia
//que se suele llamar, convención frente a configuracion que tambien sera uno de los principios de springboot
		
//por ejemplo, si el metodo empieza por findBy hara una busqueda. Si luego pongo la propiedad que quiero hara la busqueda por esa propiedad
		
//dejar nombrado aquí y hacerlo en gestor
		
		public List<Libro> findByIsbn(String isbn);

		public List<Libro> findByEditorial(String editorial);
	
			}
		

	

