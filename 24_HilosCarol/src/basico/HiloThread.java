package basico;
/*Para crear un hilo en java, tenemos que extender de la clase Thread o implementar la interfaz Runnable*/
public class HiloThread extends Thread{
	//necesitamos variable y constructor
	private String nombreHilo;
	
 public HiloThread(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

//El hilo arranca en este método y morirá cuando acabe este método
	@Override
	public void run() {
		System.out.println("Hola Mundo");
		for (int i=0;i<=100;i++) {System.out.println("Hilo " + nombreHilo + " Contador" + i);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//dormimos el hilo 200 milisegundos
		}
	}

}
