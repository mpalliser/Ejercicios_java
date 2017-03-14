package figuras;

public class Elipse extends FiguraGeometrica {

	//Propiedades privadas
	private double semiejeMenor;
	private double semiejeMayor;
	private final double PI = 3.14;
	
	//Constructor
	public Elipse (String nombre){
		super(nombre);
	}
	public Elipse(String nombre, double semiejeMenor, double semiejeMayor) {
		super(nombre);
		this.semiejeMenor = semiejeMenor;
		this.semiejeMayor = semiejeMayor;
	}
	
	//Seters y getters semiejeMenor y semiejeMayor
	public double getSemiejeMenor(double semiejeMenor){
		return this.semiejeMenor;
	}
	public double getSemiejeMayor(double semiejeMayor){
		return this.semiejeMayor;
	}
	
	public void setSemiejeMenor(double semiejeMenor){
		this.semiejeMenor = semiejeMenor;
	}
	public void setSemiejeMayor(double semiejeMayor){
		this.semiejeMayor = semiejeMayor;
	}
	
	//OCP
	@Override
	public double area(){
		return PI * semiejeMenor * semiejeMayor;
	}
	public void applyTheme() {throw new ArithmeticException();}

}
