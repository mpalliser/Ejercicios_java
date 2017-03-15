package org.foobarspam.pilas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestString {
	StringReversor test;
	
	@Before
	public void setUp(){
		test = new StringReversor("yoh agoy ogah oy");
	}
	
	@Test
	public void testFrase() {
		assertEquals(test.getFrase().length(), 16);
		assertEquals(test.getPila().size(), 0);
	}
	
	@Test
	public void testPila(){
		test.llenarPila();
		//al llenar la pila esta contiene cuatro Strings
		assertEquals(test.getPila().size(), 16);
	}
	@Test
	public void testPrint(){
		test.llenarPila();
		test.printPila();
		//Al mostrar la pila lo hacemos con el metodo .pop por lo cual se vacia.
		assertEquals(test.getPila().size(), 0);
	}

}
