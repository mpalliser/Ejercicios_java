package TestsBiciPalma;

import static org.junit.Assert.*;

import org.junit.Test;

import BiciPalma.Bicicleta;
import BiciPalma.Estacion;

public class TestAnclajesOcupados {

	@Test
	public void testAnclajesOcupaos() {
		int[] bicicletas = {291, 292, 293, 294};
		Estacion estacion = new Estacion(1, "Manacor", 6);
		
		for ( int id: bicicletas ){
			Bicicleta bicicleta = new Bicicleta(id);
			estacion.anclarBicicleta(bicicleta);
		}
		assertEquals(2, estacion.anclajesLibres());
		estacion.consultarEstacion();
		estacion.consultarAnclajes();
		System.out.println("anclajesLibres tras generar "+ bicicletas.length + " bicis: " + estacion.anclajesLibres());
	}

}
