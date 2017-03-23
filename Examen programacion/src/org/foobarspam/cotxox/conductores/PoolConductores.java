package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PoolConductores {
	
	//----------	PROPIEDADES		----------

	private ArrayList<Conductor> poolConductores = null;
	
	//----------	CONSTRUCTOR		----------

	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
	}
	
	//----------	SETTERS GETTERS		----------

	
	//----------	METODOS		----------

	public Conductor asignarConductor(){
		Conductor conductorAsignado = null;
		boolean ocupado = false;
		int posicionConsultada = ThreadLocalRandom.current().nextInt(poolConductores.size());
		if (conductoresDisponibles() == false){
			System.out.println("En este momento no hay conductores disponibles, lo lamentamos");
			return conductorAsignado;
		}
		while (ocupado == false){
			if (conductorOcupado(posicionConsultada) == false){
				conductorAsignado = poolConductores.get(posicionConsultada);
				ocupado = true;
				conductorAsignado.setOcupado(true);
			}
			posicionConsultada = ThreadLocalRandom.current().nextInt(poolConductores.size());

		}
		return conductorAsignado;
	}
	public boolean conductorOcupado(int conductor){
		return poolConductores.get(conductor).isOcupado();
	}
	public boolean conductoresDisponibles(){
		for (Conductor conductor : poolConductores){
			if (conductor.isOcupado() == false){
				return true;
			}
		}
		return false;
	}

}
