package basico;

/*La ventaja de implementar es que se podra extender de otra clase*/
public class HiloRunnable implements Runnable {

	// necesitamos variable y constructor
	private String nombreHilo;

	public HiloRunnable(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}
	// El hilo arranca en este método y morirá cuando acabe este método
	@Override
	public void run() {
		System.out.println("Hola Mundo");
		for (int i = 0; i <= 100; i++) {
			System.out.println("Hilo " + nombreHilo + " Contador" + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // dormimos el hilo 200 milisegundos
		}
	}
}
