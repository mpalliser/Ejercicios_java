package figuras;

public class Cuadrado extends FiguraGeometrica {
	
	//Propiedades privadas
	private double lado;
	public Cuadrado (String nombre){
		super(nombre);
	}
	public Cuadrado(String nombre, double lado){
		super(nombre);
		this.lado = lado;
	}
	
	//seters, geters
	public void setLado(double lado){
		this.lado = lado;
	}
	public double getLado(){
		return this.lado;
	}
	
	//OCP
	@Override
	public double area(){
		return Math.pow(this.lado, 2);
	}
	public void applyTheme(){
		System.out.println("Tema aplicado en " + this.getNombre());
	}

}
