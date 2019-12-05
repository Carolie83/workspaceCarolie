package interfaces;
/**
 * Interfaz que proporciona movimiento a los objetos
 * @author aula2m
 *
 */
public interface Movible {
//todos los m�todos de una interfaz son p�blicos y abstractos
	void moverseLento(); //ya es public y abstracto, no hace falta ponerlo
	public abstract void moverse (int metros);
}
