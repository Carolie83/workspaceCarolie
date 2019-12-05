package query;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

public class PruebaModificar {

	public static void main(String[] args) {
		DaoCoche daoCoche = new DaoCoche();
		Coche coche = new Coche();
		//test del método modificar
		coche.setMarca("Mazda");
		coche.setMatricula("1111aaa");
		coche.setModelo("MX5");
	

	}

}
