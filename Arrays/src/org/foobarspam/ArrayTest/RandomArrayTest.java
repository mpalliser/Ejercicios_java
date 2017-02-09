package org.foobarspam.ArrayTest;

import static org.junit.Assert.*;

import org.foobarspam.Arrays.*;
import org.junit.Before;
import org.junit.Test;

public class RandomArrayTest {
	
	@Test
	public void test() {
		final int[] llist = {25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,26};
		RandomArray testRandom = new RandomArray(llist);
		testRandom.createLlist();
		assertEquals(testRandom.getPares(), 10);
		assertEquals(testRandom.getImpares(), 15);
		assertEquals(25, testRandom.getNumeroMenor());
		assertEquals(300, testRandom.sumaComprendidosEntre1yMinimo(testRandom.getNumeroMenor()));

	}

}
