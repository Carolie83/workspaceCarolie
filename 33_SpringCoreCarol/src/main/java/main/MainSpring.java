package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class MainSpring {
	//Esta referencia, llevará el objeto de contexto de spring
	//este objeto llevará el ciclo de vida de todos los objetos que hayamos creado en el xml
		public static ApplicationContext context;//es una interface y no se puede instanciar
	
		public static void main(String[] args) {
	//damos de alta el contexto de Spring, a partir de un fichero xml. Este contexto llevará el ciclo
		//	de vida de todos los "beans" que hay en dicho fichero
		context = new ClassPathXmlApplicationContext("beans.xml");
  //	A partir de este momento, a traves del contexto de Spring podemos acceder a cualquier bean mediante su id
	//getBean devuelve una referencia de tipo Object, con lo cual debemos decir a java que nos convierta 
		//la referencia de tipo Object a otra de tipo Persona con un casting
		//contexto Spring, que es el contenedor dento de JVM (almacen),mantiene el ciclo de vida de persona p1 y tiene un id
		Persona p1 = (Persona)context.getBean("persona1");
		
	//	persona p2 = new Persona();// de este modo está fuera de contexto spring en JVM y necesita referencia para vivir
		//Diferencia entre uno y otro
		//aqui no pierdo el objeto porque logestiona Spring
		p1 = null;
		//aquí pierdo el objeto porque lo gestiono yo
	//	p2 = null;
		//forma de recuperar datos del objeto de spring
		p1 = (Persona)context.getBean("persona1");
		//ver del profesor  hay mas cosas en Main Spring y la carpeta con dibujo
	}

}
