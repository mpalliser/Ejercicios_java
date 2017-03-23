package org.foobarspam.furnaceKata.devices;

import org.foobarspam.furnaceKata.temperature.AmbientTemperature;
import org.foobarspam.furnaceKata.interfaces.Thermometer;

public class RemoteComandSensor implements Thermometer {

	public double read(AmbientTemperature temperature) {
		return temperature.getTemperature();
	}

}