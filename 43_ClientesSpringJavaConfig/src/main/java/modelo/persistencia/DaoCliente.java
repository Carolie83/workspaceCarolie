package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.springframework.stereotype.Repository;

import modelo.entidad.Cliente;

import vista.MainBBDDClienteJavaConfig;

public class DaoCliente {
	// Esto es una interfaz, el objeto que realiza la conexion
			// a la bbdd estan dentro de las librerias de MySql
			private Connection conexion;

			// Bloque estatico, este bloque se ejecutará
			// justo al cargar esta clase en la JVM, se ejecutará
			// antes que el metodo main. Esto para versiones
			// anteriores a Java 1.7
			/*
			 * static { //Le decimos a java que carge en memoria el driver //de conexión con
			 * la bbdd, para poder recuperarlo //cuando hagamos la conexión try {
			 * Class.forName("com.mysql.cj.jdbc.Driver"); } catch (ClassNotFoundException e)
			 * { // TODO Auto-generated catch block System.out.println("Driver NO cargado");
			 * e.printStackTrace(); } }
			 */

			public boolean abrirConexion() {
				// protocolo:subprotocolo//IP:PUERTO/NOMBRE_ESQUEMA
				// esta url depende de la bbddd a la que nos conectemos
				String url = "jdbc:mysql://localhost:3306/gestion_clientes?serverTimezone=" + TimeZone.getDefault().getID();
				String usuario = "root";
				String password = "root";

				// getConeccion me devuelve un objeto que lleva la conexión
				// a la bbdd, esta clase (DriverManager) es la clase
				// que lleva el control del driver
				// Estamos aplicando la Inyeccion de dependecia, es decir,
				// no creo el objeto aqui (no hago new), sino que es
				// el metodo getConnection el que me crea el objeto
				// en mi lugar
				try {
					conexion = DriverManager.getConnection(url, usuario, password);
					return true;
				} catch (SQLException e) {
			
					e.printStackTrace();
					return false;
				}
			}

			public boolean cerrarConexion() {
				try {
					conexion.close();
					return true;
				} catch (SQLException e) {
					e.printStackTrace();
					return false;
				}
			}
	// METODO PARA LISTAR CLIENTES		
		public List<Cliente> listarClientes() {
			if (!abrirConexion()) {
				return null;
			}

			String query = "select id,dni,nombre,edad from clientes";

			try {
				// le decimos a la conexion que nos haga una consulta
				// parametrizada a partir de la query anterior
				PreparedStatement ps = conexion.prepareStatement(query);
				// esta funcion me devuelve el numero de filas
				// afectadas
				ResultSet rs = ps.executeQuery();
				// ResultSet es un objeto que tiene toda la lista
				// de registros que ha devuelto la consulta

				Cliente cliente = null;
				List<Cliente> listaClientes = new ArrayList<Cliente>();
				// asi pues, podemos recorrernos la lista
				while (rs.next()) {// preguntamos si hay un registro mas
					cliente = MainBBDDClienteJavaConfig.context.getBean("cliente",Cliente.class);
					//Cliente = (Cliente)MainLibreria.context.getBean("Cliente");
					cliente.setId(rs.getInt(1));// el id esta en la primera posicion
					cliente.setDni(rs.getString(2));
					cliente.setNombre(rs.getString(3));
					cliente.setEdad(rs.getInt(4));

					listaClientes.add(cliente);
				}
				return listaClientes;
			} catch (SQLException e) {
				System.out.println("Error al listar clientes");
				e.printStackTrace();
				return null;
			} finally {
				// el bloque finally se va a ejecutar SIEMPRE no importa si ha pasado por el bloque try o por el bloque catch
				cerrarConexion();
			}
		}
//METODO PARA DAR DE ALTA CLIENTES
		public int alta(Cliente Cliente) {
			if (!abrirConexion()) {
				return 4;
			}

			// así no se debe hacer, porque no es optimo ni seguro
			// para el motor de la base de datos
			/*
			 * String query = "insert into coches (matricula,marca,modelo) " + " value("+
			 * coche.getMatricula()+ "," + coche.getMarca() + ","+ coche.getModelo() + ")";
			 */
			// como hay que hacer es con consultas preparadas, parametrizadas
			String query = "insert into clientes (dni,nombre,edad) values(?,?,?)";

			try {
				// le decimos a la conexion que nos haga una consulta parametrizada a partir de la query anterior
				PreparedStatement ps = conexion.prepareStatement(query);
				// sustimos la primera interrogante por la matricula del coche
				ps.setString(1, Cliente.getDni());
				ps.setString(2, Cliente.getNombre());
				ps.setInt(3, Cliente.getEdad());

				// esta funcion me devuelve el numero de filas afectadas
				int numeroFilas = ps.executeUpdate();
				if (numeroFilas == 0) {
					return 4;
				} else {
					return 0;
				}
			} catch (SQLException e) {
				System.out.println("Error al dar de alta");
				e.printStackTrace();
				return 4;
			} finally {
				cerrarConexion();
			}
		}
//METODO PARA BUSCAR POR ID
		public Cliente buscarPorId(int id) {
			if (!abrirConexion()) {
				return null;
			}

			String query = "select id,dni,nombre,edad from clientes where id=?";

			try {
				
				PreparedStatement ps = conexion.prepareStatement(query);
				
				ps.setInt(1, id);

				// esta funcion me devuelve el numero de filas afectadas
				ResultSet rs = ps.executeQuery();
				// ResultSet es un objeto que tiene toda la lista
				// de registros que ha devuelto la consulta

				Cliente cliente = null;

				// asi pues, podemos recorrernos la lista
				while (rs.next()) {// preguntamos si hay un registro mas
					cliente = MainBBDDClienteJavaConfig.context.getBean("cliente",Cliente.class);
					cliente.setId(rs.getInt(1));// el id esta en la primera posicion
					cliente.setDni(rs.getString(2));
					cliente.setNombre(rs.getString(3));
					cliente.setEdad(rs.getInt(4));
				}
				return cliente;
			} catch (SQLException e) {
				System.out.println("Error al buscar por id");
				e.printStackTrace();
				return null;
			} finally {
				cerrarConexion();
			}
		}
//metodo buscar por nombre
		public List<Cliente> buscarPorNombre(String nombre) {
			if (!abrirConexion()) {
				return null;
			}

			String query = "select id,dni,nombre,edad from clientes where nombre=?";

			try {
				PreparedStatement ps = conexion.prepareStatement(query);
			
				ps.setString(1, nombre);

				// esta funcion me devuelve el numero de filas afectadas
				ResultSet rs = ps.executeQuery();
				// ResultSet es un objeto que tiene toda la lista de registros que ha devuelto la consulta

				Cliente cliente = null;
				//tambien podriamos hacerlo aqui si damos de alta el Cliente
				List<Cliente> listaClientesNombre = new ArrayList<Cliente>();
				// asi pues, podemos recorrernos la lista
				while (rs.next()) {// preguntamos si hay un registro mas
					cliente = MainBBDDClienteJavaConfig.context.getBean("cliente",Cliente.class);
					cliente.setId(rs.getInt(1));// el id esta en la primera posicion
					cliente.setDni(rs.getString(2));
					cliente.setNombre(rs.getString(3));
					cliente.setEdad(rs.getInt(4));
					
					listaClientesNombre.add(cliente);
				}
				return listaClientesNombre;
			} catch (SQLException e) {
				System.out.println("Error al buscar por nombre");
				e.printStackTrace();
				return null;
			} finally {
				// el bloque finally se va a ejecutar SIEMPRE no importa si ha pasado por el bloque try o por el bloque catch
				cerrarConexion();
			}
		}
//METODO PARA BORRAR POR ID
		public boolean borrar(int id) {
			if (!abrirConexion()) {
				return false;
			}

			String query = "delete from clientes where id=?";

			try {
				
				PreparedStatement ps = conexion.prepareStatement(query);
				
				ps.setInt(1, id);

				// esta funcion me devuelve el numero de filas
				// afectadas
				int numeroFilas = ps.executeUpdate();
				if (numeroFilas == 0) {
					return false;
				} else {
					return true;
				}
			} catch (SQLException e) {
				System.out.println("Error al borrar cliente");
				e.printStackTrace();
				return false;
			} finally {
			cerrarConexion();
			}
		}
		//metodo buscar por dni para vaidar
		public Cliente buscarPorDni(String dni) {
			if (!abrirConexion()) {
				return null;
			}

			String query = "select id,dni,nombre,edad from clientes where dni=?";

			try {
				
				PreparedStatement ps = conexion.prepareStatement(query);
				
				ps.setString(1, dni);

				// esta funcion me devuelve el numero de filas afectadas
				ResultSet rs = ps.executeQuery();
				// ResultSet es un objeto que tiene toda la lista
				// de registros que ha devuelto la consulta

				Cliente cliente = null;

				// asi pues, podemos recorrernos la lista
				while (rs.next()) {// preguntamos si hay un registro mas
					cliente = MainBBDDClienteJavaConfig.context.getBean("cliente",Cliente.class);
					cliente.setId(rs.getInt(1));// el id esta en la primera posicion
					cliente.setDni(rs.getString(2));
					cliente.setNombre(rs.getString(3));
					cliente.setEdad(rs.getInt(4));
				}
				return cliente;
			} catch (SQLException e) {
				System.out.println("Error al buscar por dni");
				e.printStackTrace();
				return null;
			} finally {
				cerrarConexion();
			}
		}
}
