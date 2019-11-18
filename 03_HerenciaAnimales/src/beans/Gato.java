package beans;
public class Gato extends Animal{
	private int vidas;
//consturctor mio y super (atributo que heredo de mi padre)
	public Gato(String color, int vidas) {
		super(color);
		this.vidas = vidas;}
	//constructor con nada y super de que heredo con nada tambien.
	public Gato() {
		super();}
	public int getVidas() {
		return vidas;}
	public void setVidas(int vidas) {
		this.vidas = vidas;}
	public void mostrarDatos() {
		System.out.println("que vidas" + vidas);
/*System.out.println("que color" + color); color no lo puedo ver a menos que en animal cambie private color a protected color.
 System.out.println("que color" + this.getColor()); */
		System.out.println("que color" + color); }
	public void trepar () {
		System.out.println("Trepo que lo flipas");}
	//metodos reescritos de mi padre:
	@Override
	public String toString() {
		return "Gato [color=" + color + ", vidas=" + vidas + "]";}
	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		//super.saludar();se genera automaticamente, lo quitamos para que no coja lo del padre
		System.out.println("Soy un gato y tengo : " + vidas + " vidas");}
	@Override
	public void sonido() {
		// TODO Auto-generated method stub
		//super.sonido();se genera automaticamente, lo quitamos para que no coja lo del padre
		System.out.println("Soy : " + color + "y digo MIAUUUU");}
	}
