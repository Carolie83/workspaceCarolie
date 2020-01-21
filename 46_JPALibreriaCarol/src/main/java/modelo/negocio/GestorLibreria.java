package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import modelo.entidad.Libro;
import modelo.persistencia.DaoLibreria;
@Service
public class GestorLibreria {
	//En este caso lo que necesita la capa gestora para funcionar es el dao del la librer�a habria que adaptar todo el codigo a este dao
	@Autowired	
	private DaoLibreria daoLibreria;

	//Como no quiero que se me olvide poner la libreria y ademas este gestor no funciona sin la libraria creo UNICAMENTE
	//el constructor con la libreria y quito set

	@Transactional //al hacer alta se modifica BBDD
	//alta de libro
	public Libro alta(Libro l) {
		//si no le pasamos el id, crea uno nuevo
		
	/*
	 * if(libro.getIsbn().isEmpty()) {
			return 1;
		}
		
		if(libro.getTitulo().isEmpty()) {
			return 2;
		}
		//si buscamos un libro por isbn y existe
		//podemos concluir que este isbn va a estar 
		//duplicado, por lo que devolemos un 3
		if(buscarPorIsbn(libro.getIsbn()) != null) {
			return 3;
		}
		*/
		return daoLibreria.save(l);
	}
	//buscar por id
		public Libro obtener(int id) {
		return daoLibreria.findById(id).get();
		}
	
		//buscar por ISBN
//public List<Libro> findByIsbn(String isbn);, hay que hacerlo en gestor As� se escribir�a en dao, en dao debe estar nobrado as�
	//pero main debe comunicarse con gestor
		
		
	public List<Libro> findByIsbn(String isbn){
	return daoLibreria.findByIsbn(isbn);
	}
	//Buscar por Editorial
	
	public List<Libro> findByEditorial(String editorial){
		//public List<Libro> findByIsbn(String isbn);, hay que hacerlo en gestor As� se escribir�a en dao, en dao debe estar nobrado as�
		//pero main debe comunicarse con gestor	
		return daoLibreria.findByEditorial(editorial);
	}
	
	@Transactional //al hacer modificaciones se modifica BBDD
	//Modificar libro
	public Libro modificar(Libro l) {
		//si le pasamos el id, actualiza el registro
		//con dicho id
		return daoLibreria.save(l);
	}
	
	//Listar Libros
	public List<Libro> listar(){
		return daoLibreria.findAll();
	}
	
	@Transactional ////al borrar se modifica BBDD
	//borrar libro por id
	public void borrar(int id) {
		daoLibreria.deleteById(id);
	}
}
