package TestBeans;

import Beans.Cliente;
import Beans.Pedido;

public class testPedido {

	public static void main(String[] args) {
		Pedido ped1 = new Pedido(1, "tornillo 4-30", 1, true, Cliente.dameCliente());
		/*el ultimo campo que hay es cliente, ah� puedo meter una variable cliente, 
		un new cliente o un m�todode cliente que me d� un cliente*/
		System.out.print("Pedido : " + ped1.getIdPedido());
		System.out.print("\tdescripci�n : " + ped1.getDescripcion() );
		System.out.println("\tCliente : "+ ped1.getCliente().getNombre().toUpperCase());
	}

}
