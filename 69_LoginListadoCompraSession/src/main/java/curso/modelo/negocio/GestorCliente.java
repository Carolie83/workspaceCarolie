package curso.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.Cliente;

import curso.modelo.persistencia.DaoCliente;

@Service
public class GestorCliente {
	@Autowired
	private DaoCliente dc;

	
	/**
	 * Dar de alta un usuario
	 * @param Usuario usuario  a dar de alta
	 * @return 0 en caso de que haya ido bien, 1 en caso
	 * de que falte nombre, 2 en caso de que falte password
	 * y 3 en caso de que nombre ya esté dado de alta
	 */
	@Transactional
	public int validar(Cliente cliente) {
		if(cliente.getUsuario().isEmpty()) {
			return 1;
		}
		
		if(cliente.getPassword().isEmpty()) {
			return 2;
		}
		//si buscamos un nombre y existe, devolemos un 3
		if(dc.findByUsuarioAndPassword(cliente.getUsuario(),cliente.getPassword()) == null) {
			return 3;
		}
		
		return 0;
	}


	public void alta(Cliente cliente) {
		Cliente clienteAux= new Cliente();
		clienteAux.setUsuario(cliente.getUsuario());
		clienteAux.setPassword(cliente.getPassword());
		clienteAux.setEmail(cliente.getEmail());
		dc.save(clienteAux);
		
	}

	}

