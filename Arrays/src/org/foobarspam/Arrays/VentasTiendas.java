package org.foobarspam.Arrays;

import java.util.Arrays;


public class VentasTiendas {
	/*
	 * Crea una Array, donde guardaras las ventas de cinco
	 * tiendas diferentes, deberas mostrar por pantalla
	 * la tienda que mas ha vendido, la que menos y
	 * las ventas de todas las tiendas.
	 */
	private int[] ventasAnuales = {300,200,100,400,500};
	
	//Constructor
	public VentasTiendas(){
		setVentasAnuales(ventasAnuales);
	}
	//getters setters
	public void setVentasAnuales(int[] ventasAnuales){
		this.ventasAnuales = ventasAnuales;
	}
	public int[] getVentasAnuales(){
		return this.ventasAnuales;
	}
	//metodos
	public int mayorVentas(){
		Arrays.sort(ventasAnuales);
		return ventasAnuales[4];
	}
	public int menorVentas(){
		Arrays.sort(ventasAnuales);
		return ventasAnuales[0];
	}
	public int totalVentas(){
		int total = 0;
		for(int tienda : ventasAnuales){
			total += tienda;	
		}
		return total;
	}
	
}
