package cfg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import modelo.entidad.Cliente;
import modelo.negocio.GestorCliente;
import modelo.persistencia.DaoCliente;
//Esta clase ahora llevará la configuracion de Spring en vez del xml
//Tambien podemos mezclar esto con anotaciones Mediante la antoacion
//@ComponentScan podemos decir que vaya a buscar anotaciones alla donde queramos
//@ComponentScan(basePackages = "modelo")
public class ConfigSpring {
	//los beans los vamos a dar de alta mediante metodos anotados con la anotacion @Bean
	//el id con que se va a dar de alta sera el nombre del metodo y la class sera del tipo que devuelvas
	@Bean (name = "cliente")
	//podemos seguir usando el scope para el alcance
	@Scope("prototype")
	public Cliente presentarCliente() {
		Cliente c = new Cliente();
		/*c.setDni("");
		c.setNombre("");//equivalente a property
		c.setEdad(0);;*/
		return c;
	}
	//lo de arriba seria equivalente a :
	/*<bean id="director" class="modelo.entidad.Director"> <property name="nombre"
	 * value="Steven Spielberg"> </bean>*/
	@Bean (name = "daoCliente")//dar de alta Dao
	@Scope("singleton")
		public DaoCliente presentarDao() {
		DaoCliente daoCliente= new DaoCliente();
		return daoCliente;
	}
	@Bean (name = "gestorCliente")//dar de alta gestor, le paso el DaoClientes por argumento.
	@Scope("singleton")
		public GestorCliente presentarGestor(DaoCliente daoCliente) {
		GestorCliente gc= new GestorCliente();
		//ahora debo pasar con set el dao a gc. necesito getter y setter, sino da error y me dice si quiero hacer el metodo en el gestor
		gc.setDaoCliente(daoCliente);
		return gc;
		}
	}

