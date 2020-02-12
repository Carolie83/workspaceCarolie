package curso.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Pelicula;

import curso.modelo.negocio.GestorPelicula;

@Controller
public class ControladorPelicula {
	@Autowired
	private GestorPelicula gp;

	// 1º mostrar listado de películas
	@RequestMapping("mostrarListadoPeliculas")
	public ModelAndView mostrarListadoPeliculas(ModelAndView mav) {

		System.out.println("Vamos a mostrar el listado de películas");
		List<Pelicula> listaPeliculas = gp.listar();

		mav.setViewName("listadoPeliculas");// como ya lo tenemos mapeado, esto hace q me mande a inicio otra
														// vez
		// esto se usa solo cuando necesitamos pasar el objeto a l vista para q lo
		// pinte, pero no necesitamos que nos lo pinte
		mav.addObject("listaPeliculas", listaPeliculas);
		return mav;

	}
//Mostrar detalles extendidos	
	@RequestMapping("mostrarDetallesExtendidos")
	public ModelAndView mostrarDetallesExtendidos(ModelAndView mav, @RequestParam("id") int id) {
		System.out.println("Vamos a mostrar detalles extendidos de la película");
		Pelicula pelicula = gp.obtener(id);

		mav.setViewName("detallesExtendidos");// como ya lo tenemos mapeado, esto hace q me mande a inicio otra
														// vez
		// esto se usa solo cuando necesitamos pasar el objeto a l vista para q lo
		// pinte, pero no necesitamos que nos lo pinte
		mav.addObject("pelicula", pelicula);
		return mav;
	}
	//  mostrar pagina de alta de pelicula
	@RequestMapping("mostrarAltaPelicula")
	public String mostrarAltaPelicula() {
		System.out.println("Introduzca los datos de la película");
		return "registroPelicula";
	}

	// esto nos lleva al registro q rellenamos
	@RequestMapping("procesoAltaPelicula")
	public ModelAndView procesoAltaPelicula(ModelAndView mav, @RequestParam("titulo") String titulo,
			@RequestParam("director") String director, @RequestParam("genero") String genero,
			@RequestParam("year") int year) {
		System.out.println("los datos introducidos son : ");
		System.out.println("El titulo es : " + titulo);
		System.out.println("El director es : " + director);
		System.out.println("El genero es : " + genero);
		System.out.println("El año es : " + year);
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo(titulo);
		pelicula.setDirector(director);
		pelicula.setGenero(genero);
		pelicula.setYear(year);

		gp.alta(pelicula);
		System.out.println("La nueva película se ha dado de  alta correctamente");
		mav.setViewName("redirect:mostrarAltaPelicula");// como ya lo tenemos mapeado, esto hace q me mande a inicio
														// otra vez
		// esto se usa solo cuando necesitamos pasar el objeto a l vista para q lo
		// pinte,
		// pero no necesitamos que nos lo pinte
		// mav.addObject("usuario", usuario);
		return mav;
	}

	// mostrar menu de alta y listado otra vez
	@RequestMapping("mostrarMenuInicio")
	public String mostrarMenuInicio() {

		System.out.println("Volver al menú de opciones: Listar y dar de alta");
		return "inicio";
	}
}