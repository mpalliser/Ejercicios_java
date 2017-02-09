package BiciPalma;

import java.util.concurrent.ThreadLocalRandom;

public class Estacion {
	
	//---------------PROPIEDADES---------------
	private int id = 0;
	private String direccion = "";
	private int numeroAnclajes;
	//private int[] anclajes;
	private Bicicleta[] anclajes = null;
	
	//---------------CONSTRUCTORES---------------
	public Estacion(){
	}
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
	}
	
	
	//---------------SETTERS AND GETTERS---------------
	public void setID(int id){
		this.id = id;
	}
	public int getID(){
		return this.id;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	public String getDireccion(){
		return this.direccion;
	}
	public void setNumroAnclajes(int numeroAnclajes){
		this.numeroAnclajes = numeroAnclajes;
	}
	public int getNumeroAnclajes(){
		return this.numeroAnclajes;
	}
	public Bicicleta[] getAnclajes(){
		return this.anclajes;
	}
	public void setAnclaje(Bicicleta bicicleta, int anclaje){
		this.anclajes[anclaje] = bicicleta;
	}
	
	
	//---------------METODOS---------------
	public void consultarEstacion(){
		System.out.println("La estacion de " + getDireccion() + " con numero de id "+ getID() + " dispone de " + getNumeroAnclajes() + " anclajes libres");
	}
	public int anclajesLibres(){
		int anclajesLibres = 0;
		for (Bicicleta anclaje : getAnclajes()){
			if ( anclaje == null){
				anclajesLibres ++;
			}
		}
		return anclajesLibres;
	}
	public void anclarBicicleta(Bicicleta bicicleta){
		for (int anclaje = 0; anclaje< getAnclajes().length; anclaje++){
			if (this.anclajes[anclaje] == null){
				setAnclaje(bicicleta,anclaje);
				break;
			}
		}
	}
	public void consultarAnclajes(){
		for (Bicicleta anclaje : getAnclajes()){
			if (anclaje == null){
				System.out.println("Anclaje libre");
			}else {
			System.out.println("Bicicleta con ID: "+ anclaje.getID() + " anclada");
			}
		}
	}
	public void mostrarAnclajeBicicleta(Bicicleta bicicleta, int numeroAnclaje){
		System.out.println("La bicicleta con ID " + bicicleta.getID() + " esta en el anclaje nº " + numeroAnclaje);
	}
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
		return tarjetaUsuario.getActivada();
	}
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
		if (tarjetaUsuario.getActivada() == true){
			int anclajeAleatorio = generarAnclaje();
			if (this.anclajes[anclajeAleatorio] != null){
				mostrarBicicleta(this.anclajes[anclajeAleatorio], anclajeAleatorio);
				this.anclajes[anclajeAleatorio] = null;
			} 
		}
	}
	public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje){
		System.out.println("Se ha retirado la bicicleta con ID: " + bicicleta.getID() + " que se encontraba en el anclaje nº " + numeroAnclaje );
	}
	public int generarAnclaje(){
		int anclajeAleatorio = 0;
		boolean anclajeValido = false;
		while (anclajeValido == false){
			anclajeAleatorio = ThreadLocalRandom.current().nextInt(0, getNumeroAnclajes() +0);
			if (this.anclajes[anclajeAleatorio] != null){
				anclajeValido = true;
			}
		}
		return anclajeAleatorio;
	}
}
