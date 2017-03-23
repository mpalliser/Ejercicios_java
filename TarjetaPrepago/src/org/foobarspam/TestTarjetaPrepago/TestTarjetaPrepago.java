package org.foobarspam.TestTarjetaPrepago;

import static org.junit.Assert.*;

import org.foobarspam.TarjetaPrepago.TarjetaPrepago;
import org.junit.Test;

public class TestTarjetaPrepago {

	@Test
	public void testIngresarDinero() {
		TarjetaPrepago tarjeta = new TarjetaPrepago("662221000", "43164435J", 200.50);
	}

}
