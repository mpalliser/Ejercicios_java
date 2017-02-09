package TestsBiciPalma;

import static org.junit.Assert.*;

import org.junit.Test;

import BiciPalma.Bicicleta;
import BiciPalma.Estacion;

public class TestMostrarEstadoAnclajes {

	@Test 
	public void mostrarEstadoAnclajes(){
		int[] bicicletas = {291, 292, 293, 294};
		Estacion estacion = new Estacion(1, "Manacor", 6);
		for ( int id= 0; id < bicicletas.length; id++){
			Bicicleta bicicleta = new Bicicleta(bicicletas[id]);
			estacion.anclarBicicleta(bicicleta);
			estacion.mostrarAnclajeBicicleta(bicicleta, id);

		}
		assertEquals(2, estacion.anclajesLibres());
	}

}
