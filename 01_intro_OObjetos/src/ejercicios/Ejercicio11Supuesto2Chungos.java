package ejercicios;


public class Ejercicio11Supuesto2Chungos {
	static double comision , salario, aumento, subida;
	public static void main(String[] args) {
/*2.	En recursos humanos van a aplicar una política de aumento de sueldo, con arreglo a la siguiente regla. 
	 * Solicitamos por consola el sueldo y la comisión(ambos numéricos) y:
	a.	Si la comisión es cero, nos fijamos en el sueldo y 	
		Sueldo  menor de 15000, aplicamos un 10% de subida
		Sueldo entre 15001 y 30000 aplicamos un 8% subida
		Sueldo entre 30001 y 45000 aplicamos un 4% subida
		Por encima de 45000, no hay subida
	b.	Si la comisión es > 0, nos fijamos en la comisión y
		Si es menor de 2000 aumentamos el sueldo un 12%
		Si está comprendido entre 2001 y 10000 aumentamos el sueldo un 6%
		Si es mayor no le aumentamos nada.
	c.	Informamos al final de
		Cuanto ganaba al principio,
		qué % de subida le corresponde
		cuanto supone el aumento (cero si no es nada)
		En cuanto se le queda el sueldo.     */
		//Declarar variables
		salario = 50000;
		comision = 2500;
		aumento = 0;
		//Leer datos procesar y presentar
		
		if (comision == 0)
		{verSalario();}
		else
		{verComision();}
		System.out.print("el salario era : " + salario);
		System.out.print(" \t La subida es : " + subida +"%");
		System.out.print(" \t El aumento es : " + aumento );
		System.out.println("\tt Te queda el salario : " + (salario + aumento));
	}
		
	
	private static void verSalario() {
		if (salario < 15000) 	
		{subida = 10;
		aumento = salario * subida/100;
		//System.out.println("Aumento del 10%");
		
	}else {if (salario >= 15000 && salario < 30000)
			
		  	{subida = 8;
			aumento = salario * subida/100;
			//System.out.println("Aumento del 8%");
		  	}else {if (salario >= 30000 && salario < 45000)
						{subida = 4;
						aumento = salario * subida/100;
						//System.out.println("Aumento del 4%");
							}else 
								{subida = 0;
								aumento = 0;
								//System.out.println("No hay aumento");
				}  }  }}
	private static void verComision() {
		if (comision < 2000) 
		{subida = 12;
		aumento = salario * subida/100;
		//System.out.println("Aumento de sueldo por comision del 12%");
			}	else {if (comision >= 2000 && comision < 10000)
					{subida = 6;
					aumento = salario * subida/100;
							//System.out.println("Aumento de sueldo por comision del 6%");
						}else 
							{subida = 0;
							aumento = 0;
							//System.out.println("No hay aumento de sueldo por comision");
							}
							}}
		{System.out.println(" Terminado");	}

}