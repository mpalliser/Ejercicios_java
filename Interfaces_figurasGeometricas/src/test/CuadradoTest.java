package test;

import static org.junit.Assert.*;

import org.junit.Test;

import figuras.Cuadrado;

public class CuadradoTest {

	@Test
	public void testConstructurCuadrado() {
		Cuadrado cuadradoConstructor = new Cuadrado("cuadradoConstructor",5);
		assertEquals("Caso test area cuadrado", 25, cuadradoConstructor.area(),0.5);
	}

}
