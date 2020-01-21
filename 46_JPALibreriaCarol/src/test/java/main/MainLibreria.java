package main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidad.Libro;

import modelo.negocio.GestorLibreria;
import modelo.persistencia.DaoLibreria;


public class MainLibreria {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
		//Primera parte
		//creacion de los objetos necesarios para el programa
		//y la inyeccion de sus dependencias
		Scanner sc = new Scanner(System.in);
		
		//En este caso lo que tenemos que pasarle es un objeto daoLibreria
		GestorLibreria gl = context.getBean("gestorLibreria",GestorLibreria.class);
		Libro l = context.getBean("libro",Libro.class);
		
		String opcion = "0";
		do {
			System.out.println("1- Alta de libro");
			System.out.println("2- lista de libros");
			System.out.println("3- Buscar libro por isbn");
			System.out.println("4- Buscar libros por editorial");
			System.out.println("5- Buscar libros por id");
			System.out.println("6- Modificar libro por id");
			System.out.println("7- Eliminar por id");
			System.out.println("0- Salir");
			opcion = sc.nextLine();
			if(opcion.equals("1")) {
				System.out.println("Introduzca el titulo:");
				//nextLine coje toda la frase, next coje palabra
				String titulo = sc.nextLine();
				System.out.println("Introduzca el editorial:");
				String editorial = sc.nextLine();
				System.out.println("Introduzca el isbn");
				String isbn = sc.nextLine();
				System.out.println("Introduzca el año de publicacion");
				String anioPublicacion = sc.nextLine();
				
				int iAnioPublicacion = Integer.parseInt(anioPublicacion);
				l.setTitulo(titulo);
				l.setEditorial(editorial);
				l.setAnioPublicacion(iAnioPublicacion);
				l.setIsbn(isbn);
				
				//basandonos en la explicacion de la documentacion
				//del metodo alta, podemos darle información a nuestro
				//usuario
				
				System.out.println("El libro añadido es :" + gl.alta(l));
		/*		if(alta == 0) {
					System.out.println("Libro introducido correctamente");
				}else if(alta == 1) {
					System.out.println("El libro tiene que tener isbn");
				}else if(alta == 2) {
					System.out.println("El libro tiene que tener un titulo");
				}else if(alta == 3) {
					System.out.println("Ya existe ese isbn");
				}  */
			}else if(opcion.equals("2")) {
				List<Libro> listaLibros = gl.listar();
				System.out.println("La lista de libros es: ");
				for(Libro libroListado : listaLibros) {
					System.out.println(libroListado);
				}
				
				
			}	
			else if(opcion.equals("3")) {
				System.out.println("Introduzca el ISBN a buscar");
				String isbn = sc.nextLine();
				List<Libro> listaIsbn = gl.findByIsbn(isbn);
				System.out.println("El libro con ISBN"+ isbn + " es :  " );
				for(Libro libroIsbn : listaIsbn) {
					System.out.println(libroIsbn);
				}
			}
	/*		else if(opcion.equals("3")) {
				System.out.println("Introduzca el ISBN a buscar");
				String isbn = sc.nextLine();
				Libro l = gl.buscarPorIsbn(isbn);
				if(l == null) {
					System.out.println("El libro no se ha encontrado");
				}else {
					System.out.println(l);
				}
			}else if(opcion.equals("4")) {
				System.out.println("Introduzca el editorial a buscar");
				String editorial = sc.nextLine();
				//como la parte de la logica de negocio
				//la lleva el gestor, usamos el gestor creado
				//para buscar por genero
				List<Libro> lista = gl.buscarPorEditorial(editorial);
				if(lista.size() != 0) {
					System.out.println("La lista de libros por editorial es:");
					for(Libro l : lista) {
						System.out.println(l);
					}
				}else {
					System.out.println("No hay conincidencias por editorial");
				}   
			}     */
			else if(opcion.equals("4")) {
				System.out.println("Introduzca el editorial a buscar");
				String editorial = sc.nextLine();
				List<Libro> listaEditorial = gl.findByEditorial(editorial);
				System.out.println("Los libros con la editorial " + editorial + "son :" );
				for(Libro libro : listaEditorial) {
					System.out.println(libro);
				}
			
			}
		else if(opcion.equals("5")) {
			System.out.println("Introduzca el id del libro a buscar");
			String id = sc.nextLine();
			int iId = Integer.parseInt(id);
			System.out.println("El libro con"+ iId + " es :  " + gl.obtener(iId));
			
		}else if(opcion.equals("6")) {
			System.out.println("Introduzca el id del libro a modificar");
			String id = sc.nextLine();
			int iId = Integer.parseInt(id);
			System.out.println("Introduzca el nuevo titulo modificar");
			String titulo = sc.nextLine();
			System.out.println("Introduzca la nueva editorial:");
			String editorial = sc.nextLine();
			System.out.println("Introduzca el nuevo isbn");
			String isbn = sc.nextLine();
			System.out.println("Introduzca el nuevo año de publicacion");
			String anioPublicacion = sc.nextLine();
			int iAnioPublicacion = Integer.parseInt(anioPublicacion);
			
			l.setId(iId);
			l.setTitulo(titulo);
			l.setEditorial(editorial);
			l.setAnioPublicacion(iAnioPublicacion);
			l.setIsbn(isbn);
			gl.modificar(l);
			
			System.out.println("Libro modificado" + gl.modificar (l) );
		}else if(opcion.equals("7")) {
			System.out.println("Introduzca el id del libro a borrar");
			String id = sc.nextLine();
			int iId = Integer.parseInt(id);
			l.setId(iId);
			gl.borrar(iId);
			System.out.println("El libro con dicho id será borrado");
		}
			}while(!opcion.equals("0"));
		System.out.println("Fin del programa");
		
	}

}
