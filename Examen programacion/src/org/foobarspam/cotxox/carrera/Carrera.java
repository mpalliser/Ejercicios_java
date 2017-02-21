package org.foobarspam.cotxox.carrera;

public class Carrera {
	private String tarjetaCredito = null;
	private String destino = null;
	private String origen = null;
	private double distancia = 0.0d;
	private int tiempoEsperado = 0;

	//----------	PROPIEDADES		----------
	//----------	CONSTRUCTORES	----------
	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	//----------	GETTERS SETTERS		----------
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public void setTiempoEsperado(int tiempoEsperadoMinutos) {
		this.tiempoEsperado = tiempoEsperadoMinutos;
	}
	//----------	METODOS		----------
	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}
	public String getOrigen() {
		return this.origen;
	}
	public String getDestino() {
		return this.destino;
	}
	public double getDistancia() {
		return this.distancia;
	}


	

}
