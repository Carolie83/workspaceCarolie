package curso.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import curso.modelo.entidad.Libro;
import curso.modelo.entidad.Libros;
import curso.modelo.negocio.GestorLibro;


/**Aqui no anotamos la clase con @Controller
ya que con esa anotacion lo que se esperan los metodos que devuelvas son vistas. Aqui en rest devolvemos directamente datos**/

@RestController
public class ControladorLibro {

	@Autowired
	private GestorLibro gl;
	
	/**Esta anotación mapea con get "libros" para obtener toda la lista de libros, no tiene consumes porque no me mandan datos,
	 *  solo los produzco tipo XML y JSON **/

	@GetMapping(path = "libros", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Libros> listar(){
		List<Libro> listaLibros = gl.listarLibros();
		Libros libros = new Libros();
		libros.setListaLibros(listaLibros);
		return new ResponseEntity<Libros>(libros,HttpStatus.OK);
	}

	/**Para hacer pruebas con postman, mandaríamos el body de esta forma
	 *  con post: BODY {"isbn":"123abc","titulo":"el duende a rayas","editorial":"anaya","anioPublicacion":1980}
	 *  con post: BODY {"isbn":"111aaa","titulo":"el perro azul","editorial":"edelvives","anioPublicacion":1983}
	 *  Con este método nos daría de alta el cliente los parametros , consumimos JSON y produces JSON,
	 *   enviando info del libro con id y mensaje que se dió de alta HttpStatus.CREATED **/

	@PostMapping(path = "libros", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Libro> alta(@RequestBody Libro libro){
		
		int codigo = gl.alta(libro);/**actualiza el id**/
		switch(codigo) {
		case -1:
		 new ResponseEntity<Libro>(HttpStatus.BAD_REQUEST);
			break;
		case -2:
			new ResponseEntity<Libro>(HttpStatus.BAD_REQUEST);
			break;
		case -3:
		new ResponseEntity<Libro>(HttpStatus.BAD_REQUEST);
			break;
		case -4:	
			new ResponseEntity<Libro>(HttpStatus.BAD_REQUEST);
			break;
		default: 
		break;
		}
		return new ResponseEntity<Libro>(libro,HttpStatus.CREATED);
	}
		

	/**como el id que buscamos va como parametro de path o rutas debemos de ponerlo entre llaves
	la manera de recogerlo sera con la anotacion @PathVariable **/
	
	@GetMapping(path ="libros/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Libro> obtener(@PathVariable("id") Integer id){
		Optional<Libro> opt = gl.buscarPorId(id);
		if(opt.isPresent()) {
			return new ResponseEntity<Libro>(opt.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<Libro>(HttpStatus.NOT_FOUND);
		}
	}
	//este es el único que no funciona adecuadamente, despues de los cambios sigue sin funcionar, ver ejercicio profe, 
	//no se puede modificaar por otros parametros, solo con claves primarias(id)
	//el id es el unico que puede ir en url porque es clave primaria, para poner isbn, tengo que poner url peliculas y request param el id
	@PutMapping(path="libros", consumes =  MediaType.APPLICATION_JSON_VALUE,
			produces =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Libro> modificar(@RequestParam (name ="isbn",required = false) String isbn,@RequestBody Libro libro){
		int respuesta = gl.modificarPorIsbn(isbn,libro);
		if(respuesta != -1) {
			libro.setIsbn(isbn);
			gl.alta(libro);
			return new ResponseEntity<Libro>(libro,HttpStatus.OK);
		}else {
			return new ResponseEntity<Libro>(HttpStatus.NOT_FOUND);
		}	
		
	}
	
	@DeleteMapping(path="libros/{id}")
	public ResponseEntity<Libro> borrarporId(@PathVariable Integer id){
		Optional<Libro> opt = gl.buscarPorId(id);
		
		if(opt.isPresent()) {
			gl.borrarPorId(id);
			return new ResponseEntity<Libro>(opt.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<Libro>(HttpStatus.NOT_FOUND);
		}	
	}
}
