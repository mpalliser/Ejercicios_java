package org.foobarspam.furnaceKata.devices;

import org.foobarspam.furnaceKata.regulatorDisplayCodes.RegulatorDisplayCodes;
import org.foobarspam.furnaceKata.temperature.AmbientTemperature;
import org.foobarspam.furnaceKata.interfaces.Heater;
import org.foobarspam.furnaceKata.interfaces.Thermometer;

public class Regulator {
	public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, AmbientTemperature temperature) {
		RegulatorDisplayCodes code;

		while (t.read(temperature) < maxTemp) {
			code = RegulatorDisplayCodes.HEATING;
			h.engage(temperature);
			message(code, temperature);
		}
		
		while (t.read(temperature) > minTemp) {
			code = RegulatorDisplayCodes.WAITING;
			h.disengage(temperature);
			message(code, temperature);
		}
	}

	private void message(RegulatorDisplayCodes code, AmbientTemperature temperature) {
		switch(code){
			case HEATING:
				System.out.println("Calentando => Temperatura + 1: " + temperature.getTemperature());
				break;
			case WAITING:
				System.out.println("Apagado => Temperatura -1: " + temperature.getTemperature());
				break;
			default:
				System.out.println("Algo pasa...");
				break;
		}
			
				
	}
}