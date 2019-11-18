package Beans;
public class Cliente {
		private String	usuario, pwd, nombre, apellidos, dirección;
		
		public Cliente() {
			super();
		}
		public Cliente(String usuario, String pwd, String nombre, String apellidos, String dirección) {
			super();
			this.usuario = usuario;
			this.pwd = pwd;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.dirección = dirección;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getDirección() {
			return dirección;
		}
		public void setDirección(String dirección) {
			this.dirección = dirección;
		}
		@Override
		public String toString() {
			return "Cliente [usuario=" + usuario + ", pwd=" + pwd + ", nombre=" + nombre + ", apellidos=" + apellidos
					+ ", dirección=" + dirección + "]";
		}
		
		public static Cliente dameCliente() {
		return new Cliente("tomasin", "tescu", "tomas", "escudero", "calle pez, 3, madrid"); }
		
		public static Cliente[] dameClientes() {
		Cliente [] clientes = { new Cliente("tomasin", "tescu", "tomas", "escudero", "calle pez, 3, madrid"),
								new Cliente("sarita", "sarap", "sara", "perez", "calle nuez, 32, sevilla"),
								new Cliente("evita", "evar", "eva", "ruiz", "calle mayor, 5, segovia"),
								new Cliente("casca", "casacaras", "pedro", "castillo", "calle carballo, 23, toledo")};
		return clientes;
		}
		}

