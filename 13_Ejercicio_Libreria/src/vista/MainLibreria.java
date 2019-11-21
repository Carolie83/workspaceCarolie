package vista;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.entidad.Libreria;
import modelo.entidad.Libro;
import modelo.negocio.GestorLibreria;

public class MainLibreria {
	//Esta clase hace labores de vista, cuya funcion basicamente
	//es la de comunciarse con el cliente (entrada y salida de 
	//información. Así como interacturar con la capa de modelo.negocio
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion = "0";
		//creamos el gestor libreria que es el que va
				//a llevar la logica de la aplicacion
				GestorLibreria gl = new GestorLibreria();
				//el gestor libreria necesita de un array para funcionar
				//lo creamos y se lo pasamos
				ArrayList<Libro> listaLibros = new ArrayList<Libro>();
				gl.setListaLibros(listaLibros);

				do {
					System.out.println("1- Alta de libro");
					System.out.println("2- lista de libros");
					System.out.println("3- Buscar libro por ISBN");
					System.out.println("4- Buscar libro por editorial");
					opcion = sc.nextLine();
					if(opcion.equals("1")) {
						System.out.println("Introduzca el titulo : ");
						//nextLine coje toda la frase, next coje palabra
						String titulo = sc.nextLine();
						System.out.println("Introduzca el ISBN : ");
						String isbn = sc.nextLine();
						System.out.println("Introduzca editorial: ");
						String editorial = sc.nextLine();
						System.out.println("Introduzca año publicación : ");
						String anioPublicacion = sc.nextLine();
						System.out.println("Introduzca nombreLibreria : ");
						String nombreLibreria = sc.nextLine();
						
						int iAnioPublicacion = Integer.parseInt(anioPublicacion);//me cambia la anioPublicacion de string a un entero
						
						Libreria libreria1 = new Libreria();
						libreria1.setNombreLibreria(nombreLibreria);
						libreria1.setListaLibros(listaLibros);
						
						Libro l = new Libro();
						l.setTitulo(titulo);
						l.setIsbn(isbn);
						l.setEditorial(editorial);
						l.setAnioPublicacion(iAnioPublicacion);
						
						//basandonos en la explicacion de la documentacion
						//del metodo alta, podemos darle información a nuestro
						//usuario
						boolean alta = gl.alta(l);
						if(alta) {
							System.out.println("Libro introducido correctamente");
						}else {
							System.out.println("Libro introducido incompatible con parametros");
						}
					}else if(opcion.equals("2")) {
						ArrayList<Libro> libros = gl.getListaLibros();
						for(Libro l : libros) {
							System.out.println(l);
						}
					}else if(opcion.equals("3")) {
						System.out.println("Introduzca ISBN que desea buscar");
						String isbn = sc.nextLine();
						Libro l = gl.buscarPorIsbn(isbn);//seria viable hasmap
						if(l == null) {
							System.out.println("La pelicula no se ha encontrado");
						}else {
							System.out.println(l);
						}
					}else if(opcion.equals("4")) {
						System.out.println("Introduzca editorial que desea buscar");
						String editorial = sc.nextLine();
						//la parte de la logica de negocio la lleva el gestor
						//usamos el gestor creado, para buscar por genero
						ArrayList<Libro> lista = gl.buscarPorEditorial(editorial);
						if(lista.size() != 0) {
							System.out.println("La lista de libros por editorial es : ");
							for(Libro l : lista) {
								System.out.println(l);
							}
						}else {
							System.out.println("No hay conincidencias por genero");
						}
					}
				}while(!opcion.equals("0"));
				System.out.println("Fin del programa");	
				sc.close();
			}

}


