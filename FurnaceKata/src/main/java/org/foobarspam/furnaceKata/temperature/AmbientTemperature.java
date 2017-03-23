package org.foobarspam.furnaceKata.temperature;

public class AmbientTemperature {
	private double temperature = 0.0d;
	
	public AmbientTemperature(double temperature){
		this.temperature = temperature;
	}
	
	public double getTemperature(){
		return this.temperature;
	}
	
	public void setTemperature(double temperature){
		this.temperature = temperature;
	}
	
	public void changeTemperature(double changeValor){
		setTemperature(getTemperature() + changeValor);
	}
}