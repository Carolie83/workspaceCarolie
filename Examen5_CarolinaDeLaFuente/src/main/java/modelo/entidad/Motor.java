package modelo.entidad;

public class Motor {
	private int cv;
	private int cilindrada;
	public Motor(int cv, int cilindrada) {
		super();
		this.cv = cv;
		this.cilindrada = cilindrada;
	}
	public Motor() {
		super();
	}
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	@Override
	public String toString() {
		return "Motor [cv=" + cv + ", cilindrada=" + cilindrada + "]";
	}
	
}
