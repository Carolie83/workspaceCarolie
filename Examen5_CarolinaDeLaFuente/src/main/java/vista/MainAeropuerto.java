package vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Aeropuerto;



public class MainAeropuerto {
	public static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beansAeropuerto.xml");
		Aeropuerto aeropuerto = (Aeropuerto) context.getBean("aeropuerto");
		imprimirAeropuerto(aeropuerto);
	}
		private static void imprimirAeropuerto(Aeropuerto aeropuerto) {
				System.out.println(aeropuerto.toString());

	}

}
