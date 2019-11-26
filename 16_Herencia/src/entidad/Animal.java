package entidad;

public abstract class Animal {
protected String nombre;
private double peso;
private int edad;

public abstract void comer(Object comida);/*estamos definiendo no implementando, 
queremos algo muy generico por eso referenciamos desde object, sabemos que queremos hacer pero no como.
 Lo hacemos abstracto metodo y por tanto clase*/

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

@Override
public String toString() {
	return "Animal [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + "]";
}


}
