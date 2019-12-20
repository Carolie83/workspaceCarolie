package hilos;
import java.util.Scanner;
public class HiloRunnableCuentaPrimos implements Runnable {
	private String nombreHilo;
	int numero;
	public HiloRunnableCuentaPrimos(String nombreHilo, int numero) {
		this.nombreHilo = nombreHilo;
		this.numero = numero;
	}//un numero es primo solo si es divisible por si mismo y por uno
	// El hilo arrancara en este metodo y morira cuando acabe este metodo
	@Override
	public void run() {
		int contador, i;
		contador = 0;
		for (i = 1; i <= numero; i++) {
			if ((numero % i) == 0) {
				contador++;
			}
		}
		if (contador <= 2) {
			System.out.println("Hilo/ " + nombreHilo + " El numero " + numero + "es primo");
		} else {
			System.out.println("Hilo/ " + nombreHilo + " El numero" + numero + "no es primo");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // dormimos el hilo 100 milisegundos
	}
}
