package curso.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.Usuario;
import curso.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {
	@Autowired
	private DaoUsuario du;
	

	/**
	 * Dar de alta un usuario
	 * @param Usuario usuario  a dar de alta
	 * @return 0 en caso de que haya ido bien, 1 en caso
	 * de que falte nombre, 2 en caso de que falte password
	 * y 3 en caso de que nombre ya esté dado de alta
	 */
	@Transactional
	public int validar(Usuario usuario) {
		if(usuario.getNombre().isEmpty()) {
			return 1;
		}
		
		if(usuario.getPassword().isEmpty()) {
			return 2;
		}
		//si buscamos un nombre y existe, devolemos un 3
		if(du.findByNombreAndPassword(usuario.getNombre(),usuario.getPassword()) == null) {
			return 3;
		}
		
		return 0;
	}

//faltaría que no se pueda dar de alta si el usuario ya existe, carol con password12345,
	//exite y da error 500, porque pe permitió meterlo 2 veces en la base de datos
	public void alta(Usuario usuario) {
		du.save(usuario);
		
	}
	
}


