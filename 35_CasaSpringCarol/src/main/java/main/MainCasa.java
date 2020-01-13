package main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Casa;

public class MainCasa {
	public static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beansCasa.xml");
		Casa c1 = (Casa) context.getBean("casa1");
		imprimirCasa(c1);
	}
		private static void imprimirCasa(Casa casa) {
				System.out.println(casa.toString());

		}
			}
				
	
