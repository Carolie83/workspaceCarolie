package paquete;

public class MainAtaque {

	public static void main(String[] args) {
		
		Personaje guerrero = FabricaPersonaje.crear("guerrero");
		
		guerrero.setNombre("Legolas");
		guerrero.setVida(100);
		Arma arco = FabricaArmas.crear("arco");
		arco.setDanio(25);
		guerrero.setArma(arco);
		guerrero.atacar();
		
		Personaje enano = FabricaPersonaje.crear("enano");
		
		enano.setNombre("Balrow");
		enano.setVida(100);
		Arma hacha = FabricaArmas.crear("hacha");
		hacha.setDanio(35);
		enano.setArma(hacha);
		enano.atacar();
		int vida = 0;
		int daño = 0;
		//seria 0 o menos lo que hace parasr la pelea y mejor con do while VER PARTIDA 30_VIDEDEOJUEGO PELEA PROFE
		while(vida!=0 ) {
			
			enano.atacar();
			vida = vida - arco.getDanio();
			enano.setVida(vida);
			System.out.println(vida);
			guerrero.atacar();
			vida = vida - hacha.getDanio();
			System.out.println(vida);
		}
	}

}
