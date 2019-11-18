package TestBeans;

import Beans.Cliente;
import Beans.Pedido;

public class testPedido {

	public static void main(String[] args) {
		Pedido ped1 = new Pedido(1, "tornillo 4-30", 1, true, Cliente.dameCliente());
		/*el ultimo campo que hay es cliente, ahí puedo meter una variable cliente, 
		un new cliente o un métodode cliente que me dá un cliente*/
		System.out.print("Pedido : " + ped1.getIdPedido());
		System.out.print("\tdescripción : " + ped1.getDescripcion() );
		System.out.println("\tCliente : "+ ped1.getCliente().getNombre().toUpperCase());
	}

}
