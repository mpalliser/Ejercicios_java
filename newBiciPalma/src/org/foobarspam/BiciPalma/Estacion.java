package org.foobarspam.BiciPalma;

import java.util.concurrent.ThreadLocalRandom;

import org.foobarspam.testBiciPalma.TarjetaUsuario;

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
	public Bicicleta[] getAnclajes(){
		return this.anclajes;
	}
	//----------	METODOS		---------

	public void consultarEstacion() {
		System.out.println("\nid: " + getID() + "\ndireccion: " + getDireccion() + "\nnumeroAnclajes: " + getNumeroAnclajes());
	}

	public int anclajesLibres() {
		int anclajesLibres = 0;
		for (Bicicleta anclaje : getAnclajes()){
			if (anclaje == null){
				anclajesLibres ++;
			}
		}
		return anclajesLibres;
	}

	public void anclarBicicleta(Bicicleta bicicleta) {
		for (int anclaje = 0 ; anclaje < getAnclajes().length; anclaje++){
			if (this.anclajes[anclaje] == null){
				this.anclajes[anclaje] = bicicleta;
				break;
			}
		}
	}

	public int consultarAnclajes() {
		int anclajesLibres = 0;
		for (int anclaje = 0 ; anclaje < getAnclajes().length; anclaje++){
			if (this.anclajes[anclaje] == null){
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

	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		return tarjetaUsuario.getActivada();
	}

	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
		if (tarjetaUsuario.getActivada() == true){
			int anclajeAleatorio = generarAnclaje();
			mostrarBicicleta(anclajeAleatorio);
			this.anclajes[anclajeAleatorio] = null;
		}
	}

	private void mostrarBicicleta(int numeroAnclaje) {
		System.out.println("bicicleta retirada: " + this.anclajes[numeroAnclaje].getID() + " del anclaje: " + (numeroAnclaje+1));
	}

	private int generarAnclaje() {
		boolean anclajeOcupado = false;
		int anclajeAleatorio = 0;
		while (!anclajeOcupado){
			anclajeAleatorio = ThreadLocalRandom.current().nextInt(0, getNumeroAnclajes() +0);
			if (this.anclajes[anclajeAleatorio] != null){
				anclajeOcupado = true;
			}
			
		}
		return anclajeAleatorio;
	}

	

}
