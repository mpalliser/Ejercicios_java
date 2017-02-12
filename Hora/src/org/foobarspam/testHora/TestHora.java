package org.foobarspam.testHora;

import static org.junit.Assert.*;

import org.foobarspam.hora.Hora;
import org.junit.Test;

public class TestHora {

	@Test
	public void testConstructorVacio() {
		Hora hora = new Hora();
		assertEquals(hora.getHora(), 0 );
		assertEquals(hora.getMinutos(), 0);
		assertEquals(hora.getSegundos(), 0);
	}
	@Test
	public void testConstructorConParametros() {
		Hora hora = new Hora(12, 40, 50);
		assertEquals(hora.getHora(), 12 );
		assertEquals(hora.getMinutos(), 40);
		assertEquals(hora.getSegundos(), 50);
	}
	@Test
	public void testgetHoras() {
		Hora hora = new Hora(12, 40, 50);
		hora.getHoras();
		assertEquals(hora.getHora(), 12 );
	}
	@Test
	public void testImprimirHora() {
		Hora hora = new Hora(12, 40, 50);
		hora.imprimirHora();
		assertEquals(hora.getSegundos(), 50);
	}
}
