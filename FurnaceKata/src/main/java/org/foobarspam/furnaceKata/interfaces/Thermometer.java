package org.foobarspam.furnaceKata.interfaces;

import org.foobarspam.furnaceKata.temperature.AmbientTemperature;

public interface Thermometer {
	
	public double read(AmbientTemperature temperature);
}