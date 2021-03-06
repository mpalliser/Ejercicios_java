package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {
	
	//----------	PROPIEDADES		----------
	private String tarjetaCredito = null;
	private String destino = null;
	private String origen = null;
	private double distancia = 0.0d;
	private double tiempoEsperado = 0.0d;
	private Conductor conductor = null;


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
	public Conductor getConductor() {
		return this.conductor;
	}
	private void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	//----------	METODOS		----------
	public double getCosteEsperado() {
		return Tarifa.costeTotalEsperado(this.distancia, this.tiempoEsperado);
	}

	public void asignarConductor(PoolConductores conductores) {
		Conductor seleccionado = conductores.asignarConductor();
		setConductor(seleccionado);
	}



}
