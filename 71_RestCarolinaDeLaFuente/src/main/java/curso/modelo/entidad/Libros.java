package curso.modelo.entidad;

import java.util.List;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Libros {
	/**Esta anotación es para que el XML salga bien escrito y ordenado**/
	/**@XmlElement(name = "libro")**/
	private List<Libro> listaLibros;
/**generamos getter y setter del atributo**/
	public List<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

}
