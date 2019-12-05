package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import modelo.entidad.Pelicula;

/**
 * Esta clase se encarga de la persistencia con la clase
 * coche. Esta clase hará un CRUD (Create, Read, Update, Delete)
 * sobre la entidad pelicula. 
 * 
 * Un DAO es el acronimo de DataAccessObject
 * y es un objeto que suele encargase de interactuar los objetos
 * pelicula con la BBDD.
 * 
 * 
 * 
 * @author Carol
 * @see Pelicula
 * 
 */
public class DaoPelicula {

	//Esto es una interfaz, el objeto que realiza la conexion
	//a la bbdd estan dentro de las librerias de MySql
	private Connection conexion;
	public boolean abrirConexion() {
		//protocolo:subprotocolo//IP:PUERTO/NOMBRE_ESQUEMA
		//esta url depende de la bbddd a la que nos conectemos. 
		String url = "jdbc:mysql://localhost:3306/videoclub?serverTimezone=" + TimeZone.getDefault().getID();
		String usuario = "root";
		String password = "root";
		
		//getConeccion me devuelve un objeto que lleva la conexión
		//a la bbdd, esta clase (DriverManager) es la clase
		//que lleva el control del driver
		
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
	//para dar de alta una pelicula
	public boolean alta(Pelicula pelicula) {
		if(!abrirConexion()) {
			return false;
		}
		
		String query = "insert into peliculas (titulo, director,genero,anio_de_publicacion) values(?,?,?,?)";
		
		try {
			/*le decimos a la conexion que nos haga una consulta parametrizada a partir de la query anterior*/
			PreparedStatement ps = conexion.prepareStatement(query);
			//sustimos la primera interrogante por la título de pelicula y así sucesivamente
			ps.setString(1, pelicula.getTitulo());
			ps.setString(2, pelicula.getDirector());
			ps.setString(3, pelicula.getGenero());
			ps.setInt(4, pelicula.getAnioDePublicacion());
			
			//esta funcion me devuelve el numero de filas afectadas
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al dar de alta");
			e.printStackTrace();
			return false;
		} finally {
		/*el bloque finally se va a ejecutar SIEMPRE no importa si ha pasado por el bloque try o por el bloque catch, 
			siempre deben cerrarse conexiones y lo haremos aquí*/
			cerrarConexion();
		}
	}
	//para modificar una pelicula por id
	public boolean modificar(Pelicula pelicula) {
		if(!abrirConexion()) {
			return false;
		}		
	
		String query = "update peliculas set titulo=?, director=?, genero=?, anio_de_publicacion=? where id=?";
		
		try {
	
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, pelicula.getTitulo());
			ps.setString(2, pelicula.getDirector());
			ps.setString(3, pelicula.getGenero());
			ps.setInt(4, pelicula.getAnioDePublicacion());
			ps.setInt(5, pelicula.getId());
			
			//esta funcion me devuelve el numero de filas afectadas
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al modificar");
			e.printStackTrace();
			return false;
		} finally {

			cerrarConexion();
		}
	}
	//recurrimos a este método para dar de baja una película
	public boolean baja(Pelicula pelicula) {
		if(!abrirConexion()) {
			return false;
		}		
		
		String query = "delete from peliculas where id=?";
		
		try {
	
			PreparedStatement ps = conexion.prepareStatement(query);
		
			ps.setInt(1, pelicula.getId());
			
			//esta funcion me devuelve el numero de filas afectadas
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al dar de baja");
			e.printStackTrace();
			return false;
		} finally {

			cerrarConexion();
		}
	}
	//recurrimos aqí para buscar pelicula por id
	public Pelicula buscar(int id) {
		if(!abrirConexion()) {
			return null;
		}		
		
		String query = "select id,titulo,director,genero, anio_de_publicacion from peliculas where id=?";
		
		try {

			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			//ResultSet es un objeto que tiene toda la lista de registros que ha devuelto la consulta
			
			Pelicula pelicula = null;
			
			//para recorrer la lista
			while(rs.next()) {//preguntamos si hay un registro mas
				pelicula = new Pelicula();
				pelicula.setId(rs.getInt(1));//el id esta en la primera posicion
				pelicula.setTitulo(rs.getString(2));
				pelicula.setDirector(rs.getString(3));
				pelicula.setGenero(rs.getString(4));
				pelicula.setAnioDePublicacion(rs.getInt(5));
			}
			return pelicula;
		} catch (SQLException e) {
			System.out.println("Error en la busqueda");
			e.printStackTrace();
			return null;
		} finally {

			cerrarConexion();
		}
		
	}
	
	public List<Pelicula> listar() {
		if(!abrirConexion()) {
			return null;
		}		
		
		String query = "select id,titulo,director,genero, anio_de_publicacion from peliculas";
		
		try {
	
			PreparedStatement ps = conexion.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			//ResultSet es un objeto que tiene toda la lista de registros que ha devuelto la consulta
			
			Pelicula pelicula = null;
			List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
			//asi pues, podemos recorrernos la lista
			while(rs.next()) {//preguntamos si hay un registro mas
				pelicula = new Pelicula();
				pelicula.setId(rs.getInt(1));//el id esta en la primera posicion
				pelicula.setTitulo(rs.getString(2));
				pelicula.setDirector(rs.getString(3));
				pelicula.setGenero(rs.getString(4));
				pelicula.setAnioDePublicacion(rs.getInt(5));
				listaPeliculas.add(pelicula);
			}
			return listaPeliculas;
		} catch (SQLException e) {
			System.out.println("Error al listar");
			e.printStackTrace();
			return null;
		} finally {

			cerrarConexion();
		}
		
	}
}




