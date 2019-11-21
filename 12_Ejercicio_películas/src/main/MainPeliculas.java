package main;

import java.util.ArrayList;
import java.util.Scanner;
import bean.Director;
import bean.Pelicula;

public class MainPeliculas {

	public static void main(String[] args) {
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		
	do {System.out.println("Elige una opción entre : "+
				"1- Alta pelicula\r\n" + 
				"2- Listar peliculas\r\n" + 
				"3- Buscar pelicula por titulo\r\n" + 
				"0- Salir del programa\r\n" );	
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				
				System.out.println("Procedemos a realizar Alta pelicula");
				Pelicula p1 = new Pelicula();
				System.out.println("Introduzca titulo");
				String titulo = sc.next();
				p1.setTitulo(titulo);
				System.out.println("Introduzca genero");
				String genero = sc.next();
				p1.setGenero(genero);
				
				System.out.println("Introduzca nombre director");
				String nombreDirector = sc.next();
				System.out.println("Introduzca edad director");
				int edadDirector = sc.nextInt();
				
				Director director = new Director();
				director.setNombre(nombreDirector);
				director.setEdad(edadDirector);
				
				p1.setDirector(director);
				System.out.println("Introduzca añoDeEstreno");
				int añoDeEstreno = sc.nextInt();
				p1.setAñoDeEstreno(añoDeEstreno);
				listaPeliculas.add(p1);
				System.out.println("*******Fin de alta*****");
				break;
			case 2: 
				System.out.println("Listar peliculas : ");
				for (Pelicula peliculas : listaPeliculas)
					System.out.println(peliculas);
				
				break;
			case 3: 
				System.out.println("Buscar pelicula por titulo : ");
				String tituloBusqueda = sc.next();
				
				for (Pelicula pelicula: listaPeliculas) {
					if(pelicula.getTitulo().equals(tituloBusqueda)) {
						System.out.println(pelicula.getTitulo());
						System.out.println(pelicula.getGenero());
						System.out.println(pelicula.getDirector());
						System.out.println(pelicula.getAñoDeEstreno());
					}
				}
			
			break;	
			case 0:
				System.out.println("Gracias por usar nuestro programa");
				break;

			default:
				System.out.println("La opcion no se reconoce");
				break;
			}
			
		}while (opcion != 0);
		
		sc.close();	
		}
	}


