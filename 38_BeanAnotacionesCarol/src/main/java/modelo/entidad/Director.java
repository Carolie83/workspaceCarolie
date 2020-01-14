package modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; //esto se importa con @Component

/**
 * @author felix de pablo
 */

/*Podemos dar de alta los beans tambien por anotaciones.
 * Tenemos 4 tipos de anotaciones básicas:
 * @Component
 * @Service
 * @Repository
 * @Controller
 * 
 * La anotación @Component da de alta la clase como bean en el contexto spring
 * las otras anotaciones hacen lo MISMO, son anotaciones semánticas.
 * @Service se usa para dar de alta un objeto de tipo gestor
 * @Repository es para dar de alta un objeto de tipo DAO
 * @Controller es para dar de alta un objeto de tipo controlador
 * */
//@Component
//Equivalente a <bean id="director" class="modelo.entidad.Director"
//por defecto, el id del bean sera el nombre de la clase en lowerCammelCase
//@Component (value= "directorPropio), de esta manera le cambiamos el id
@Component
@Scope("prototype")
//de esta manera damos de alta el bean con alcance prototipado
public class Director {
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Director [nombre=" + nombre + ", edad=" + edad + "]";
	}	
}
