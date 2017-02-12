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

	public int anclajesLibres() {
		int anclajesLibres = 0;
		for (Bicicleta anclaje : anclajes){
			if (anclaje == null){
				anclajesLibres ++;
			}
		}
		return anclajesLibres;
	}

	public void anclarBicicleta(Bicicleta bicicleta) {
		for (int anclaje = 0 ; anclaje < anclajes.length; anclaje++){
			if (anclajes[anclaje] == null){
				anclajes[anclaje] = bicicleta;
				break;
			}
		}
	}

	public int consultarAnclajes() {
		int anclajesLibres = 0;
		for (int anclaje = 0 ; anclaje < anclajes.length; anclaje++){
			if (anclajes[anclaje] == null){
				anclajesLibres ++;
				System.out.println("Anclaje " + (anclaje+1) + " libre");
			}else {
				System.out.println("Anclaje " + (anclaje+1) +" " + anclajes[anclaje].getID());
			}
		}
		return anclajesLibres;
	}

	public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {
		System.out.println("Bicicleta: " + bicicleta.getID() + " anclada en el anclaje: " + (numeroAnclaje+1));
	}

	

}
