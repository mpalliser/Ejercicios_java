package org.foobarspam.listas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLoteria {
	Loteria boletos;
	@Before
	public void setUp(){
		boletos = new Loteria();

	}
	@Test
	public void testNumeros() {
		boletos.obtenerBoleto();
		assertEquals(boletos.getNumeros().size(), 49);
	}
	@Test
	public void testReintegro(){
		assertEquals(boletos.getReintegro().size(), 10);
	}

}
