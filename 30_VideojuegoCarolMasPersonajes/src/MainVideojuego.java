
public class MainVideojuego {

	public static void main(String[] args) {
		
		Personaje guerrero1 = FabricaPersonaje.crear("guerrero");
		//Guerrero g1 = new Guerrero();
		
		guerrero1.setNombre("conan");
		
		//Gracias a usar abstraciones y patrones (fabrica)
		//podemos crear objetos diferentes en tiempo de ejecucion
		Arma espada = FabricaArmas.crear("espada");
		guerrero1.setArma(espada);
		guerrero1.atacar();
		Personaje guerrero2 = FabricaPersonaje.crear("guerrero");
		//Guerrero g2 = new Guerrero();
		guerrero2.setNombre("Legolas");
		
		Arma arco = FabricaArmas.crear("arco");
		guerrero2.setArma(arco);
		guerrero2.atacar();
		
		Personaje enano1 = FabricaPersonaje.crear("enano");
		//Enano e1 = new Enano();
		enano1.setNombre("Balrow");
		
		Arma hacha = FabricaArmas.crear("hacha");
		//Arma hacha = FabricaArmas.crear(args[2]);
		enano1.setArma(hacha);
		
		enano1.atacar();
		Personaje mago1 = FabricaPersonaje.crear("mago");
		//Mago m1 = new Mago();
		mago1.setNombre("Merlin");
		
		Arma usarHechizo = FabricaArmas.crear("usarHechizo");
		mago1.setArma(usarHechizo);
		mago1.atacar();
	}

}
