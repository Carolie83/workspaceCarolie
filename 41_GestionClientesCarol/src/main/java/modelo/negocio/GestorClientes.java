package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Cliente;
import modelo.persistencia.DaoClientes;

@Service
public class GestorClientes {
	//En este caso lo que necesita la capa gestora para funcionar es el dao del la librería
		//habria que adaptar todo el codigo a este dao
		@Autowired
		//no hacen falta ni getter ni setter ni constructores
		private DaoClientes daoClientes;
		
		public GestorClientes(DaoClientes daoClientes) {
			super();

			this.daoClientes = daoClientes;
		}
		
		
		public GestorClientes() {
			super();
		}

		/**
		 * Dar de alta un libro
		 * @param libro libro a dar de alta
		 * @return 0 en caso de que haya ido bien, 1 en caso
		 * de que falte el isbn, 2 en caso de que falte el titulo
		 * y 3 en caso de que el isbn este duplicado
		 */
		public int alta(Cliente cliente) {
			//1- el dni debe tener 9 caracteres sino error 1
			if( cliente.getDni().length() != 9) {
				 return 1;
			}
			
			//2- (optativo) el dni debe de acabar con letra sino error 2
			//(existe una validacion mas adecuada que avisa si la letra es correcta segun numeros metidos
		
			if(Character.isDigit(cliente.getDni().charAt(cliente.getDni().length() -1))) {
				return 2;
			}
		
		//en caso de que el dni ya exista da error 3
			if(buscarPorDni(cliente.getDni()) != null) {
		return 3;
			}
			return daoClientes.alta(cliente);
		}
		
		public Cliente buscarPorDni(String dni) {
			return daoClientes.buscarPorDni(dni);
		}
		public Cliente buscarPorId(int id) {
			return daoClientes.buscarPorId(id);
		}
		
		public List<Cliente> buscarPorNombre(String nombre){
			return daoClientes.buscarPorNombre(nombre);
		}
			public boolean borrar(int id) {
			return daoClientes.borrar(id);
		}
			public List<Cliente> listarClientes() {
				return daoClientes.listarClientes();
			}
	}

