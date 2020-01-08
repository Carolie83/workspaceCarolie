
public class Mago extends Personaje{
//no podia acceder a nombre y arma a menos q pusiera public, 
	//pero si lo pongo private si puedo acceder a getNombre() y getArma()
public void atacar() {
	System.out.println("Soy el mago " + getNombre() + ".. y todos me temen!!!!");
	getArma().usar();
}



}
