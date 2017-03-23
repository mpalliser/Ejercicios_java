package org.foobarspam.TarjetaPrepago;


import java.util.Arrays;

public class Hora {
	
	//---------- PROPIEDADES ----------
	private int hora;
	private int minutos;
	private int segundos;
	
	//---------- CONSTRUCTORES ----------
	public Hora(){
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	public Hora(int hora, int minutos, int segundos){
		validarHora(hora, minutos, segundos);
	}
	//---------- GETTERS ----------
	public int getHora() {
		return this.hora;
	}
	public int getMinutos() {
		return this.minutos;
	}
	public int getSegundos() {
		return this.segundos;
	}
	//---------- SETTERS ----------
	public void setHora(int hora, int minutos, int segundos){
		validarHora(hora, minutos, segundos);
	}
	//---------- METODOS ----------
	public void validarHora(int hora, int minutos, int segundos){
		if(hora >= 0 && hora <=24){
			this.hora = hora;
		}else {
			this.hora = 0;
		}
		if(minutos >= 0 && minutos <=60){
			this.minutos = minutos;
		}else {
			this.minutos = 0;
		}
		if(segundos >= 0 && segundos <=60){
			this.segundos = segundos;
		}else {
			this.segundos = 0;
		}
	}
	public void imprimirHora(){
		System.out.println("Horas: " + getHora() + " minutos: " + getMinutos() + " segundos: " + getSegundos());
	}
	public void getHoras() {
		int[] tiempo = new int[3];
		tiempo[0] = this.hora;
		tiempo[1] = this.minutos;
		tiempo[2] = this.segundos;
		System.out.println(Arrays.toString(tiempo));
	}
}