package figuras;

public class Rectangulo extends FiguraGeometrica implements Drawable {
	
	//Propiedades privadas
	private double altura;
	private double anchura;
	
	//Constructor
	public Rectangulo (String nombre){
		super(nombre);
	}
	public Rectangulo(String nombre,double altura,double anchura){
		super(nombre);
		this.altura = altura;
		this.anchura = anchura;
	}
	
	//geters, seters de altura y anchura
	public double getAltura(){
		return this.altura;
	}
	public double anchura(){
		return this.anchura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	public void setAnchura(double anchura){
		this.anchura = anchura;
	}
	
	//OCP
	@Override
	public double area(){
		return anchura * altura;
	}

	public void applyTheme(){
		System.out.println("Tema aplicado en " + this.getNombre());
	}
}
