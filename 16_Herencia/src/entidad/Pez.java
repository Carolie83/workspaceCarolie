package entidad;
// para heredar una clase de otra se utiliza la palabra reservada EXTENDS
public abstract class Pez extends Animal {
	
private int numeroAletas;
	

	@Override
	public void comer(Object comida) {
		/*INSTANCEOF preguntamos la clase del objeto al que apunta, suele ser util antes de hacer casting
		 *  para q no de error en tiempo de ejecución( si el objeto q estoy apuntado es de tipo placton...)*/
		if (comida instanceof Placton) {
			/* cambiamos el mando a distancia de Oject a tipo placton, para que?, para mas adelante poder utilizar el metodo getCalorias()*/
			Placton p = (Placton) comida;//casting para que comida apunte a placton
			System.out.println("Soy un pez que me llamo " + nombre + " y me voy a comer un placton con " + p.getCalorias());
			double nuevoPeso = p.getCalorias()/1000.0;//la división entre dos enteros siempre devuelve entero, por lo q alguno debe ser double para q dé decimales
			this.setPeso(this.getPeso() + nuevoPeso);
		}
		else {
			System.out.println("Puajjjjj no me gusta eso!!!!!!!");
		}	
	}

	public int getNumeroAletas() {
		return numeroAletas;
	}


	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}
/* Tenemos que coger los getter heredados de animal ya que los atributos son privados y no podemos acceder desde esta clase,
 * otra opción hubiera sido haberlos hecho protected*/
	@Override
	public String toString() {
		return "Pez [numeroAletas=" + numeroAletas + ", getNombre()=" + getNombre() + ", getPeso()=" + getPeso()
				+ ", getEdad()=" + getEdad() + "]";
	}
	
	
	}


