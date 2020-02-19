package curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.ListaProductosSeleccionados;
import curso.modelo.entidad.Producto;
import curso.modelo.persistencia.DaoProducto;

@Service
public class GestorProducto {

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

		
		public Producto buscar(int id) {
			if(dp.findById(id).isPresent()) {
				return dp.findById(id).get();
			}else {
				return null;
			}
		}
		
		public double calcularTotal(ListaProductosSeleccionados listaProductosSeleccionados) {
		
			double costeTotal = 0;
			for(Producto p : listaProductosSeleccionados.getLista()) {
				costeTotal= costeTotal + p.getPrecio();
			}
			listaProductosSeleccionados.setCosteTotal(costeTotal);
			return costeTotal;
		}
		
}

