package org.foobarspam.cotxox.conductores;

public class Conductor {
	
	//----------	PROPIEDADES		----------

	private String nombre = null;
	private String matricula = null;
	private String modelo = null;
	private double valoracion = 0.0d;
	private boolean ocupado = false;
	
	//----------	CONSTRUCTOR		----------
	
	public Conductor(String nombre) {
		this.nombre = nombre;
	}


	//----------	GETTERS SETTERS		----------
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setValoracion(byte valoracion) {
		this.valoracion = valoracion;
	}
	public void setOcupado(boolean ocupado){
		this.ocupado = ocupado;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public double getValoracion() {
		return this.valoracion;
	}
	
	//----------	METODOS		----------

	public boolean isOcupado() {
		return this.ocupado;
	}
}
