package main;

import java.util.Scanner;
import hilos.HiloRunnableCuentaPrimos;

public class LanzadoraHilosCalculoPrimos {

	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int numero4 = 0;
		int numero5 = 0;
		System.out.println("En marcha revisión de numeros primos");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");

		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		numero3 = sc.nextInt();
		numero4 = sc.nextInt();
		numero5 = sc.nextInt();
		// con runnable, primero tenemos que crear el objeto runnable
		HiloRunnableCuentaPrimos hr1 = new HiloRunnableCuentaPrimos("hr1", numero1);
		HiloRunnableCuentaPrimos hr2 = new HiloRunnableCuentaPrimos("hr2", numero2);
		HiloRunnableCuentaPrimos hr3 = new HiloRunnableCuentaPrimos("hr3", numero3);
		HiloRunnableCuentaPrimos hr4 = new HiloRunnableCuentaPrimos("hr4", numero4);
		HiloRunnableCuentaPrimos hr5 = new HiloRunnableCuentaPrimos("hr5", numero5);
		// y a continuacion crear un objeto hilo (Thread) pasandole el objeto runnable
		Thread t1 = new Thread(hr1);
		Thread t2 = new Thread(hr2);
		Thread t3 = new Thread(hr3);
		Thread t4 = new Thread(hr4);
		Thread t5 = new Thread(hr5);
		/* si pasamo el mismo objeto a ambos hilos, podemos tener problemas de
		 * concurrencia, ya que ambos hilos estan ejecutando el mismo objeto
		 * y ahora podemos arrancar el hilo de manera normal, el hilo ejecutará el
		 * metodo run del objeto pasado por parametro */
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		sc.close();
	}
}
