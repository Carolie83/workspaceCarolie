package query;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

public class QueryBBDDPruebaAlta {

	public static void main(String[] args) {
		DaoCoche daoCoche = new DaoCoche();
		Coche coche1 = new Coche( "1234esw", "Nisan", "Juke");
		
		//test sobre funci�n alta, la conexi�n ya est� en cuenta dentro de la funci�n alta
		daoCoche.alta(coche1);
	
		System.out.println("prueba acabada");
	}
}
