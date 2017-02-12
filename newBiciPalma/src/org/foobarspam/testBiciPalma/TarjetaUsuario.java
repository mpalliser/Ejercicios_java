package org.foobarspam.testBiciPalma;

public class TarjetaUsuario {
	private String id = null;
	private boolean activada = false;
	
	public TarjetaUsuario(String id, boolean activada){
		this.id = id;
		this.activada = activada;
	}
	public String getID(){
		return this.id;
	}
	public boolean getActivada(){
		return this.activada;
	}

}
