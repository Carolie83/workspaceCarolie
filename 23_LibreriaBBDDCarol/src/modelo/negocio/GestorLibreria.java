package modelo.negocio;
//Esta parte del modelo se encargaría de realizar
	//la logica de negocio de nuestra aplicacion, es decir
	//de realizar las tareas que tiene que hacer. En este
	//caso se encarga de dar de alta las peliculas, de devolver
	//la lista de las peliculas y de buscar las peliculas
	import java.util.ArrayList;

	import modelo.entidad.Libro;
import modelo.persistencia.DaoLibro;
import modelo.persistencia.DaoPelicula;

	public class GestorLibreria {
		private DaoLibro daoLibro;

		public DaoLibro getDaoLibro() {
			return daoLibro;
		}

		public void setDaoLibro(DaoLibro daoLibro) {
			this.daoLibro = daoLibro;
		}
	
		private ArrayList<Libro> listaLibros = null;

		public ArrayList<Libro> getListaLibros() {
			return listaLibros;
		}

		public void setListaLibros(ArrayList<Libro> listaLibros) {
			this.listaLibros = listaLibros;
		}
		
		/**
		 * Metodo que da de alta un libro
		 */
		public boolean alta(Libro libro) {
			//si tenemos algun requisito funcinales o validacion
			//deben de ir al menos en la parte de negocio.
			//se puede meter en la vista pero de manera opcional
			//Incluimos requisitos antes de añadir libro
			if(libro.getIsbn().isEmpty()) {//si ISBN esta vacio devuelve false
				return false;
			}
			
			if(libro.getTitulo().isEmpty()) {//si titulo esta vacio devuelve false
				return false;
			}
			
			for(Libro l : listaLibros) {
				if( l.getIsbn().equals(libro.getIsbn())) {
					return false;//necesito recorrer el array de libros 
					//si l que voy a meter, el isbn q obtengo es igual a 
					//algún libro de mi lista, fuerzo que sea false
					//no debe haber dos libros con igual isbn
				}
			}
			
			listaLibros.add(libro);//add un libro a la vista
			return true;
		}
		/**
		 * Metodo que busca por titulo una pelicula
		 * @param titulo el titulo de la pelicula a busdcar
		 * @return pelicula en caso de que se encuetre, null
		 * en caso de que no se encuentre
		 */
		public Libro buscarPorIsbn(String isbn) {
			for(Libro l : listaLibros) {
				if(l.getIsbn().equals(isbn)){
					return l;
				}
			}
			return null;
		}
		
		/**
		 * Metodo que devuelve un array de peliculas que se encuentren
		 * a partir de un genero de la pelicula
		 * @param genero el genero a buscar en la lista
		 * @return un array con las peliculas que tengan el mismo
		 * genero que el pasado por el parametro de entrada. Si
		 * no hay coincidencias el array estaría vacio
		 */
		public ArrayList<Libro> buscarPorEditorial(String editorial) {
			ArrayList<Libro> listaLibrosEditorial = new ArrayList<Libro>();
			for(Libro l : listaLibros) {
				if(l.getEditorial().equals(editorial)){
					listaLibrosEditorial.add(l);
				}
			}
			return listaLibrosEditorial;
		}
	}


