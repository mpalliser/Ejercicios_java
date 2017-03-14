package org.foobarspam.conjuntos;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TestNumerosAleatorios {
	NumerosAleatorios test;
	@Before
	public void setUp(){
		test = new NumerosAleatorios();
	}
	@Test
	public void testSize() {
		test.mostrarAlmacen();
		assertEquals(test.getAlmacen().size(), 8);
	}
}
