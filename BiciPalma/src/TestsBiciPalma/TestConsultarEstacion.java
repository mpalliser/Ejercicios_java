package TestsBiciPalma;

import static org.junit.Assert.*;

import org.junit.Test;

import BiciPalma.Estacion;

public class TestConsultarEstacion {

	@Test
	public void testConsultarEstacion() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		assertEquals(1, estacion.getID());
		assertEquals(6, estacion.getNumeroAnclajes());
		assertEquals("Manacor", estacion.getDireccion());
	}
}
