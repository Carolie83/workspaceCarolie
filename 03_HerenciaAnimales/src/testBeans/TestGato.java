package testBeans;

import beans.Gato;

public class TestGato {

	public static void main(String[] args) {
		Gato gato1, gato2;
		gato1 = new Gato();
		gato2 = new Gato("manchas negras y blancas", 7);
/* System.out.println(gato1 + " _ " + gato2);
gato1.saludar();                               esto no me dá las cosas que necesito, debo reescribir los metodos*/
		System.out.print(gato1);
		System.out.println("  _  " + gato2);
		gato1.saludar();
		gato1.sonido();
		gato2.saludar();
		gato2.sonido();
	}

}
