package basico;

public class LanzadoraHilos {

	public static void main(String[] args) {
		HiloThread ht1 = new HiloThread ("Hilo1");
		HiloThread ht2 = new HiloThread ("hilo2");
		//Una vez creados los objetos hilos, les decimos que arranquen
		//ht1.start();
		//ht2.start();
	/*Si ejecutamos el método run(),directamente no arrancamos hilo, sería el hilo main
	 *  el que ejecutaría el método run(), 1º el run de ht1 y luego el run() de ht2 */
		//ht1.run();
		//ht2.run();
		// Con runnable, primero tenenmos que crear el objeto runnable
		HiloRunnable hr1 = new HiloRunnable("hr1");
		HiloRunnable hr2 = new HiloRunnable("hr2");
		 /*a continuación crear un objeto hilo (thread) pasándole el objeto runnable*/
		Thread t1 = new Thread (hr1);
		Thread t2 = new Thread (hr2);
	/*si pasamos el mismo objeto a ambos hilos, podemos tener problemas de concurrencia,
		ya que ambos hilos están ejecutando el mismo objeto.
	y ahora, podemos arrancar el hilo de manera normal, el hilo ejecutará el método run del objeto pasado por parametro*/
		t1.start();
		t2.start();
	}

}
