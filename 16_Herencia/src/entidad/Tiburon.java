package entidad;

public class Tiburon extends Pez {

	@Override //para sobreescribir el método del padre
	public void comer(Object comida) {
		/*super.comer(comida);si dejamos el super, se ejecutaria primero
		 *  el comer del padre y luego podríamos añadir lineas*/
		//Pez no lo podemos instanciar porque es abstracto
		if (comida instanceof Pez) {
			Pez pez= (Pez)comida;
		System.out.println("Soy el tiburon" + getNombre() +" y me voy a comer al pez de tipo" + pez.getClass().getSimpleName() + "que se llama" + pez.getNombre());
		
	}
		else { 
			System.out.println("Soy un tiburon asesino y solo como peces");
		}
	}
}
