package org.foobarspam.pilas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestString {

	@Test
	public void test() {
		StringConversor test = new StringConversor("aloH");
		test.llenarPila();
		//al llenar la pila esta contiene cuatro Strings
		assertEquals(test.getPila().size(), 4);
		test.printPila();
		//Al mostrar la pila lo hacemos con el metodo .pop por lo cual se vacia.
		assertEquals(test.getPila().size(), 0);
	}

}
