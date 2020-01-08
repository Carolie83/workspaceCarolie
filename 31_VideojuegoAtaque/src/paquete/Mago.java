package paquete;

public class Mago extends Personaje{
//no podia acceder a nombre y arma a menos q pusiera public, 
	//pero si lo pongo private si puedo acceder a getNombre() y getArma()
public void atacar() {
	System.out.println("Soy el mago " + getNombre() + ".. y todos me temen!!!!");
	getArma().usar();
}

@Override
public void atacarPersonaje(Personaje p) {
	System.out.println("soy el mago " + getNombre() + " y voy a hechizar a " + p.getNombre());
	int danio = getArma().getDanio();
	int vidaPersonaje = p.getVida();
	int nuevaVida = vidaPersonaje - danio;
	p.setVida(nuevaVida);
}
}