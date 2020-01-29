package modelo.negocio;

import modelo.entidad.Usuario;

public class GestorUsuario {
	public boolean validar(Usuario u) {
		if(u.getNombre().isEmpty() || u.getApellido().isEmpty() || u.getEmail().isEmpty()) {
			return false;
		}else {
			return true;
		}
	}
}
