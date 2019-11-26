package testbean;

import bean.Alumno;
import bean.Curso;
import bean.Profesor;

public class mainPrueba {

	public static void main(String[] args) {
		//Creamos alumno  e introducimos datos
		
		Alumno alum1 = new Alumno("44555333R", "pepita perez", "mujer", 35, null);
		Alumno alum2 = new Alumno();
		alum2.setNombreCompleto("Vanesa Tuturu");
		alum2.setDni("444444i");
		alum2.setSexo("mujer");
		alum2.setEdad(22);
		alum2.setCurso(null);
	
//Creamos profesor  e introducimos datos
		Profesor profesor1;
profesor1 = new Profesor();
profesor1.setDni("222222q");
profesor1.setNombre("Fernando Feliz");
profesor1.setEdad(34);
profesor1.setSalario(35000);
profesor1.setSexo("hombre");
//Creamos Curso e introducimos datos

	Curso curso1 = new Curso(10, "ingles", 9.5, 200,null);
	Curso curso2 = new Curso();
	curso2.setIdCurso(20);
	curso2.setNombreCurso("aleman");
	curso2.setHoras(10);
	curso2.setPrecio(80);
	Curso curso3 = new Curso(30, "frances", 30, 450, profesor1);
	
	alum1.setCurso(curso3);
	curso1.setProfesor(profesor1);
	alum2.setCurso(curso2);
	profesor1.salarioMensual(12);//anteriormente habiamos creado el metodo para sacar salario mensual
	System.out.println("el salario del profesor es : " + profesor1.getSalario());//pedimos que imprima el salaro del profesor
	System.out.println("el salario mensual del profesor es : " + profesor1.salarioMensual(12));
	System.out.println("Los datos del curso 3 son : " + curso3);//imprime todos los datos del curso3
	System.out.println("los datos del alumno 1 son : " + alum1);// nos da los datos del alumno 1
	System.out.println("el nombre del alumno en mayuscula es : " + alum1.getNombreCompleto().toUpperCase());//nos muestra el nombre del alumno 1 en mayuscudas
	System.out.println( "el precio del curso 2 es : " + (int)curso2.getPrecio() + "€");/*el precio es valor double pero hago casting para que lo presente como entero, 
	pero habrá que tener cuidado no nos comamos parte del valor....*/
	
	}
}

