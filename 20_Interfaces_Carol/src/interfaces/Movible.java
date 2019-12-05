package interfaces;
/**
 * Interfaz que proporciona movimiento a los objetos
 * @author aula2m
 *
 */
public interface Movible {
//todos los métodos de una interfaz son públicos y abstractos
	void moverseLento(); //ya es public y abstracto, no hace falta ponerlo
	public abstract void moverse (int metros);
}
