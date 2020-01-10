package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import modelo.entidad.Coche;

public class MainSpringCoche {

//esta referencia llevara el objeto de contexto de springeste objeto llevara 
//el ciclo de vida de todos los objetos que hayamos creado en el xml
	public static ApplicationContext context;

	public static void main(String[] args) {
//damos de alta el contexto de spring, a partir de un fichero xml. Este contexto llevara el ciclo
//de vida de todos los "beans" que hay en dicho fichero
		context = new ClassPathXmlApplicationContext("beans.xml");
//a partir de este momento, a traves del contexto de spring podemos acceder a cualquier bean
//mediante su id getBean devuelve una referencia de tipo Object con lo cual debemos de decirle a java que nos
//convierta la refencia de tipo Object a otra de tipo Persona
		Coche c1 = (Coche) context.getBean("coche1");
		Coche c2 = (Coche) context.getBean("coche2");
		Coche c3 = (Coche) context.getBean("coche3");
		Coche c4 = (Coche) context.getBean("coche4");
		Coche c5 = (Coche) context.getBean("coche5");
		imprimirCoche(c1);
		imprimirCoche(c2);
		imprimirCoche(c3);
		imprimirCoche(c4);
		imprimirCoche(c5);
		
		imprimirMarcaCocheSpring();
		System.out.println("-------con ref---------");
		imprimirMotorCoche1();
		System.out.println("--------con constructor--------");
		imprimirMotorCoche4();
		System.out.println("----------con bean interno------");
		imprimirMotorCoche5();
	}
	private static void imprimirMarcaCocheSpring() {
		Coche c1 = (Coche)context.getBean("coche1");
		System.out.println(c1.getMarca());
	}
	private static void imprimirCoche(Coche coche) {

		System.out.println(coche.toString());
	}
		private static void imprimirMotorCoche1() {
			Coche c1 = (Coche)context.getBean("coche1");
			System.out.println(c1.getMotor());
		}
			private static void imprimirMotorCoche4() {
				Coche c4 = (Coche)context.getBean("coche4");
				System.out.println(c4.getMotor());
			}
				private static void imprimirMotorCoche5() {
					Coche c5 = (Coche)context.getBean("coche5");
					System.out.println(c5.getMotor());
		}	
	}


