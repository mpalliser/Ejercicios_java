package org.foobarspam.yatzy.test;

import static org.junit.Assert.*;
import org.foobarspam.yatzy.tirada.Yatzy;
import org.junit.Test;

public class testYatzy {

	@Test
	public void firstTest() {
		Yatzy test = new Yatzy(5,5,5,5,5);
		assertEquals("Primer test", 25, test.chance());
	}

}
