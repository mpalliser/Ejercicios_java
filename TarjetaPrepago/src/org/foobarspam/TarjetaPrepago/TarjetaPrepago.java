package org.foobarspam.TarjetaPrepago;

public class TarjetaPrepago {
	private String numeroTelefono = null;
	private String nif = null;
	private double saldo = 0.0d;
	private Hora consumo = new Hora();
	
	public TarjetaPrepago(){
	}
	public TarjetaPrepago(String numeroTelefono, String nif, double saldo){
		this.numeroTelefono = numeroTelefono;
		this.nif = nif;
		this.saldo = saldo;
	}
	
}
