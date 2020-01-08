package paquete;

public abstract class Personaje {

		private String clase;
		private String nombre;
		private Arma arma;
		private int vida;

		public String getClase() {
			return clase;
		}

		public void setClase(String clase) {
			this.clase = clase;
		}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Arma getArma() {
			return arma;
		}

		public void setArma(Arma arma) {
			this.arma = arma;
		}
		
		public int getVida() {
			return vida;
		}

		public void setVida(int vida) {
			this.vida = vida;
		}

		public abstract void atacar();
		public abstract void atacarPersonaje(Personaje p);
	}


