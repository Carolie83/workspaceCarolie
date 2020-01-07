package servidor.modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;

import servidor.modelo.entidad.ServidorPelicula;

/** 
 * @author Tony Crespo
 * @see Pelicula
 * @since 05-12-2019
 * @version 1.0
 * 
 */
public class DaoServidorPelicula {

	//Esto es una interfaz, el objeto que realiza la conexion
	//a la bbdd estan dentro de las librerias de MySql
	private Connection conexion;

	public boolean abrirConexion() {
		//protocolo:subprotocolo//IP:PUERTO/NOMBRE_ESQUEMA
		//esta url depende de la bbddd a la que nos conectemos
		String url = "jdbc:mysql://localhost:3306/examen3?serverTimezone=" + TimeZone.getDefault().getID();
		String usuario = "root";
		String password = "root";

		//getConeccion me devuelve un objeto que lleva la conexión
		//a la bbdd, esta clase (DriverManager) es la clase
		//que lleva el control del driver
		//Estamos aplicando la Inyeccion de dependecia, es decir,
		//no creo el objeto aqui (no hago new), sino que es
		//el metodo getConnection el que me crea el objeto
		//en mi lugar
		try {
			conexion = DriverManager.getConnection(url, usuario, password);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean cerrarConexion() {
		try {
			conexion.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean alta(ServidorPelicula pelicula) {
		if(!abrirConexion()) {
			return false;
		}

		String query = "insert into pelicula (id, titulo, director) values(?,?,?)";

		try {
			//le decimos a la conexion que nos haga una consulta
			//parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			//sustimos la primera interrogante por la matricula
			//del coche
			ps.setInt(1, pelicula.getId());
			ps.setString(2, pelicula.getTitulo());
			ps.setString(3, pelicula.getDirector());

			//esta funcion me devuelve el numero de filas
			//afectadas
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al insertar Película");
			e.printStackTrace();
			return false;
		} finally {
			//el bloque finally se va a ejecutar SIEMPRE
			//no importa si ha pasado por el bloque try o
			//por el bloque catch
			cerrarConexion();
		}
	}


	public boolean borrar(ServidorPelicula pelicula) {
		if(!abrirConexion()) {
			return false;
		}		

		String query = "delete from pelicula where id=?";

		try {
			//le decimos a la conexion que nos haga una consulta
			//parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			//sustimos la primera interrogante por la matricula
			//del coche
			ps.setInt(1, pelicula.getId());

			//esta funcion me devuelve el numero de filas
			//afectadas
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al borrar Película");
			//e.printStackTrace();
			return false;
		} finally {
			//el bloque finally se va a ejecutar SIEMPRE
			//no importa si ha pasado por el bloque try o
			//por el bloque catch
			cerrarConexion();
		}
	}

	public ServidorPelicula obtener(int id){
		if(!abrirConexion()) {
			return null;
		}		

		String query = "select id, titulo, director from pelicula where id=?";

		try {
			//le decimos a la conexion que nos haga una consulta
			//parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			//sustimos la primera interrogante por la matricula
			//del coche
			ps.setInt(1, id);

			//esta funcion me devuelve el numero de filas
			//afectadas
			ResultSet rs = ps.executeQuery();
			//ResultSet es un objeto que tiene toda la lista
			//de registros que ha devuelto la consulta

			ServidorPelicula pelicula = null;

			//asi pues, podemos recorrernos la lista
			while(rs.next()) {//preguntamos si hay un registro mas
				pelicula = new ServidorPelicula();
				pelicula.setId(rs.getInt(1));//el id esta en la primera posicion
				pelicula.setTitulo(rs.getString(2));
				pelicula.setDirector(rs.getString(3));
			}
			return pelicula;
		} catch (SQLException e) {
			System.out.println("Error al buscar Película ");
			//e.printStackTrace();
			return null;
		} finally {
			//el bloque finally se va a ejecutar SIEMPRE
			//no importa si ha pasado por el bloque try o
			//por el bloque catch
			cerrarConexion();
		}

	}

}
