package curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.Producto;
import curso.modelo.persistencia.DaoProducto;


@Service
public class GestorProducto {
	//En este caso lo que necesita la capa gestora
		//para funcionar es el dao del la librer�a
		//habria que adaptar todo el codigo a este dao
		@Autowired
		private DaoProducto dp;
		public List<Producto> listarProductos(){
			return dp.findAll();
		}
		/**
		 * Dar de alta un producto
		 * @param Producto producto a dar de alta
		 * @return 0 en caso de que haya ido bien, 1,2,3... en caso de fata de algún parametro
		 */
		@Transactional
		public int altaProducto(Producto producto) {
			if(producto.getNombre().isEmpty()) {
				return 1;
			}
			
			if(producto.getPrecio()==0) {
				return 2;
			}
			if(producto.getCategoria().isEmpty()) {  
				return 3;
		
			}
			
			dp.save(producto);
			return 0;
		}
}
