package org.foobarspam.cuentacorriente.test;

import static org.junit.Assert.*;

import org.foobarspam.cuentaCorriente.logica.CuentaCorriente;
import org.junit.Test;

public class testCuentaCorriente {

	@Test
	public void testConstructor() {
		CuentaCorriente cuentaCorriente = new CuentaCorriente("Mariano", "Palliser Muñoz","43164425J", "C/Infanta Elisabet", "662221000", 500);
		assertEquals(cuentaCorriente.getNombre(),"Mariano");
		assertEquals(cuentaCorriente.getApellidos(), "Palliser Muñoz");
		assertEquals(cuentaCorriente.getDireccion(),"C/Infanta Elisabet");
		assertEquals(cuentaCorriente.getTelefono(), "662221000");
		assertEquals(cuentaCorriente.getSaldo(), 500, 0);

	}
	@Test
	public void testRetirarDinero(){
		CuentaCorriente cuentaCorriente = new CuentaCorriente("Mariano", "Palliser Muñoz", "43164425J", "C/Infanta Elisabet", "662221000", 500);
		cuentaCorriente.retirarDinero(300);
		assertEquals(cuentaCorriente.getSaldo(), 200, 0);
		
	}
	@Test
	public void testIngresarDinero(){
		CuentaCorriente cuentaCorriente = new CuentaCorriente("Mariano", "Palliser Muñoz", "43164425J", "C/Infanta Elisabet", "662221000", 500);
		cuentaCorriente.ingresarDinero(300);
		cuentaCorriente.consultarCuenta();
		assertEquals(cuentaCorriente.getSaldo(), 800, 0);
	}
	@Test
	public void testSaldoNegativo(){
		CuentaCorriente cuentaCorriente = new CuentaCorriente("Mariano", "Palliser Muñoz", "43164425J", "C/Infanta Elisabet", "662221000", 500);
		assertEquals(cuentaCorriente.saldoNegativo(), false);
		cuentaCorriente.retirarDinero(600);
		assertEquals(cuentaCorriente.saldoNegativo(), true);

	}

}
