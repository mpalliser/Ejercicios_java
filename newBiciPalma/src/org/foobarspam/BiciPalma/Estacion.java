package org.foobarspam.BiciPalma;

public class Estacion {
	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes = null;
	
	//----------	CONSTRUCTOR		---------
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
	}
	
	//----------	GETTERS		---------
	public int getID() {
		return this.id;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}
	//----------	METODOS		---------

	public void consultarEstacion() {
		System.out.println("\nid: " + getID() + "\ndireccion: " + getDireccion() + "\nnumeroAnclajes: " + getNumeroAnclajes());
	}
	

}
