package BiciPalma;

public class TarjetaUsuario {
	//----------ATRIBUTOS----------
	private String id = "";
	private boolean activada = false;
	//----------CONSTRUNCTORES----------
	public TarjetaUsuario(){
	}
	public TarjetaUsuario(String id, boolean activada){
		this.id = id;
		this.activada = activada;
	}
	//----------SETTERS AND GETTERS----------
	public void setID(String id){
		this.id = id;
	}
	public String getID(){
		return this.id;
	}
	public boolean getActivada(){
		return this.activada;
	}
	//----------METODOS----------

}
