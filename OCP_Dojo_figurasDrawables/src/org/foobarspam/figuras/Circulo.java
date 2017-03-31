package org.foobarspam.figuras;

public class Circulo extends FiguraGeometrica{
	//Propiedades privadas
	private double radio;
	private final double PI = 3.14;
	
	//Constructores
	public Circulo (String nombre){
		super(nombre);
	}
	public Circulo(double radio){
		super();
		this.radio = radio;
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
	
}
