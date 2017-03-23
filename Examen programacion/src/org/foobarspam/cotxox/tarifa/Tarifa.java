package org.foobarspam.cotxox.tarifa;

public class Tarifa {
	
	
	//----------	PROPIEDADES		----------
	private final static double costeMilla = 1.35;
	private final static double costeMinuto = 0.35;
	private final static double costeMinimo = 5;

	
	
	//----------	CONSTRUCTORES	----------
	
	
	//----------	GETTERS SETTERS		----------

	
	//----------	METODOS		---------- 
	public static double costeTotalEsperado(double distancia, double tiempo) {
		double totalTarifa = getCosteDistancia(distancia) + getCosteTiempo(tiempo);
		if (totalTarifa > costeMinimo){
			return totalTarifa;
		}else {
			return costeMinimo;
		}
	}
	private static double getCosteDistancia(double distancia) {
		return distancia * costeMilla;
	}
	private static double getCosteTiempo(double tiempo) {
		return tiempo * costeMinuto;
	}
}
