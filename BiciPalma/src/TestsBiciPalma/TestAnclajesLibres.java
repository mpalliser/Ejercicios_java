package TestsBiciPalma;

import static org.junit.Assert.*;

import org.junit.Test;

import BiciPalma.Estacion;

public class TestAnclajesLibres {


	@Test
	public void testAnclajesLibres() {
		
		Estacion estacion = new Estacion(1, "Manacor", 6);
		assertEquals(6, estacion.anclajesLibres());
	}

}
