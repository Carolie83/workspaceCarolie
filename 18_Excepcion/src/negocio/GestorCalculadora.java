package negocio;

public class GestorCalculadora {
	/**
	 * Metodo calcula la division entera entre dos numeros
	 * @param numerador el numerador a dividir
	 * @param denominador el denominador q vamos a usar
	 * @return el resultado de la division
	 * @throws ArithmeticException cuando el denominador es 0
	 */
	public int dividir(int numerador,int denominador) throws ArithmeticException {
		return numerador / denominador;
		//esto puede arrojar un error, pero en esta capa yo no puedo hacer syso, puedo capturarla  con try/catch o arrojarla solo THROWS
		
		
		
	}

}
