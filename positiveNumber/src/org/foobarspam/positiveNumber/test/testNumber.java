package org.foobarspam.positiveNumber.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.foobarspam.positiveNumber.numero.Number;;
public class testNumber {

	@Test
	public void firstTest(){
		Number test = new Number(20);
		assertTrue(test.isPositive());
	}

}
