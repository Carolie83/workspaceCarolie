package curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.Operacion;
import curso.modelo.persistencia.DaoCalculadora;


@Service
public class GestorCalculadora {
	@Autowired
	private DaoCalculadora dc;
	
	
	//introducor operacion nueva
	@Transactional
	public Operacion altaOperacion (Operacion operacion) {
		//si no le pasamos el id, crea uno nuevo
		return dc.save(operacion);
	}
	
	@Transactional
	public Operacion modificar(Operacion operacion) {
		//si le pasamos el id, actualiza el registro con dicho id
		return dc.save(operacion);
	}
	
	public Operacion obtener(int id) {
		return dc.findById(id).get();
	}
	
	public List<Operacion> listar(){
		return dc.findAll();
	}
	
	@Transactional
	public void borrar(int id) {
		dc.deleteById(id);
		}
	public List<Operacion> findByTipoOperacion(String tipoOperacion){
	return dc.findByTipoOperacion(tipoOperacion);
}

	public void realizarOperacion(Operacion operacion) {
		String tipoOperacion = operacion.getTipoOperacion();	
		double resultado = 0;
	switch (tipoOperacion) {
	case "sumar":
	 resultado = operacion.getNumero1() + operacion.getNumero2();
	/*errores sin arreglar
		break;
	case "restar":
		double resultado = numero1 - numero2;
	
		break;
	case "multiplicar":
		double resultado = numero1 * numero2;
		
		break;
	case "dividir":
		double resultado = numero1 / numero2;
		
		break;
	//default:
	}
	return dc.   
	}  */
	}}}