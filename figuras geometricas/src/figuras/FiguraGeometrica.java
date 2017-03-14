package figuras;

public abstract class FiguraGeometrica implements Drawable {
	
	//Propiedades privadas
	private String nombre ;
	
	//Constructor
	public FiguraGeometrica(String nombre){
		this.nombre = nombre;
	}	
	
	//seters y getters
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	//OCP(Open Closed Principle)
	public abstract double area();
	
	public void draw(){
		System.out.println(this.getNombre() + ": es drawable");
	}
}
