package org.foobarspam.pilas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestString {

	@Test
	public void test() {
		StringConversor test = new StringConversor("Hola");
		test.reverseString();
		test.reverseString();
	}

}
