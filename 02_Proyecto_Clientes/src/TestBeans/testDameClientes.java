package TestBeans;

import Beans.Cliente;

public class testDameClientes {

	public static void main(String[] args) {
	/*
		Cliente cli1 =new Cliente();
	Cliente miCliente = cli1.dameCliente(); /* al no ser estatico el m�todo, necesito generar una variable Cliente 
	con la que luego no voy a trabajar, es absurdo a continuacion se muestra si es static el m�todo*/
		Cliente otroCliente = Cliente.dameCliente();
		Cliente[] mis = Cliente.dameClientes();
		for (Cliente ele: mis) /*a la izda clase, a la derecha del todo la colecci�n y en el centro 
			el nombre de una variable que queramos ele o cliente o lo q sea, porque al final es un elemento de mi clase cliente
			y busco en la coleccion mis*/
			System.out.println(ele.getNombre());
			/* la variable elemento (referencia a cada cliente segun su posici�n del array)
		es como decir: */
		for (int i = 0; i< mis.length;i++)
			System.out.println(mis[i]);
			
	}

}
