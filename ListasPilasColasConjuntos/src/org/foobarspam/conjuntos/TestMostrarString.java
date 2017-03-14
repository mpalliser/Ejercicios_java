package org.foobarspam.conjuntos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMostrarString {

	@Test
	public void testStandard() {
		MostrarString test = new MostrarString();
		test.borrarLetrasRepetidas();
		test.imprimirCaracteres();
		assertEquals(test.getFrase().length(), 31);
		assertEquals(test.getCaracteres().size(), 9);
	}
	@Test
	public void newTest(){
		MostrarString newTest = new MostrarString("aassddffgghhjjkkll");
		newTest.borrarLetrasRepetidas();
		newTest.imprimirCaracteres();
		assertEquals(newTest.getFrase().length(), 18);
		assertEquals(newTest.getCaracteres().size(), 9);
	}

}
