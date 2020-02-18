package curso.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.modelo.entidad.Operacion;


public interface DaoCalculadora extends JpaRepository<Operacion, Integer>{
	public List<Operacion> findByTipoOperacion(String tipoOperacion);
}
