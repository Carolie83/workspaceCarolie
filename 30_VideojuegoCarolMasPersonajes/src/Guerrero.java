
public class Guerrero extends Personaje{
	//no podia acceder a nombre y arma a menos q pusiera public, 
		//pero si lo pongo private si puedo acceder a getNombre() y getArma()
public void atacar() {
		System.out.println("Soy el guerrero " + getNombre() + ".. ARGGGGGGG!!!!");
		getArma().usar();
	}



	}


