package Beans;
public class Cliente {
		private String	usuario, pwd, nombre, apellidos, direcci�n;
		
		public Cliente() {
			super();
		}
		public Cliente(String usuario, String pwd, String nombre, String apellidos, String direcci�n) {
			super();
			this.usuario = usuario;
			this.pwd = pwd;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.direcci�n = direcci�n;
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
		public String getDirecci�n() {
			return direcci�n;
		}
		public void setDirecci�n(String direcci�n) {
			this.direcci�n = direcci�n;
		}
		@Override
		public String toString() {
			return "Cliente [usuario=" + usuario + ", pwd=" + pwd + ", nombre=" + nombre + ", apellidos=" + apellidos
					+ ", direcci�n=" + direcci�n + "]";
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

