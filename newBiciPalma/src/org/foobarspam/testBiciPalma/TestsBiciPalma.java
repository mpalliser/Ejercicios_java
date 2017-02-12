package org.foobarspam.testBiciPalma;

import static org.junit.Assert.*;

import org.foobarspam.BiciPalma.Estacion;
import org.junit.Test;

public class TestsBiciPalma {

	@Test
	public void test() {
		Estacion estacion = new Estacion(1,"Manacor", 6);
		assertEquals(estacion.getID(), 1);
		assertEquals(estacion.getDireccion(), "Manacor");
		assertEquals(estacion.getNumeroAnclajes(), 6);
		System.out.print("\n**** caso Test visualizar estado de la estacion *** \n");
		estacion.consultarEstacion();
	}

}
