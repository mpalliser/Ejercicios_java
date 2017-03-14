package figuras;

public class Circulo extends FiguraGeometrica {
	
	//Propiedades privadas
	private double radio;
	private final double PI = 3.14;
	
	public Circulo (String nombre){
		super(nombre);
	}
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
	}
	
	//seters, geters del radio
	public void setRadio(double radio){
		this.radio = radio;
	}
	public double getRadio(){
		return this.radio;
	}
	
	//OCP
	@Override
	public double area(){
		return Math.pow(this.radio, 2) * PI; 
	}
	public void applyTheme(){
		System.out.println("Tema aplicado en " + this.getNombre());
	}

}
