package org.foobarspam.TestDni;

import static org.junit.Assert.*;

import org.foobarspam.Dni.TablaAsignacion;
import org.junit.Test;

public class TestTablaAsignacion {

	@Test
	public void testLetrasValidas() {
		TablaAsignacion tablaPrueba = new TablaAsignacion();
		assertEquals(tablaPrueba.getLetra(0),'T');
		assertEquals(tablaPrueba.getLetra(1),'R');
		assertEquals(tablaPrueba.getLetra(2),'W');
		assertEquals(tablaPrueba.getLetra(3),'A');
		assertEquals(tablaPrueba.getModulo(),23);
	}
	@Test
	public void testLetraValida(){
		TablaAsignacion tablaPrueba = new TablaAsignacion();
		assertEquals(tablaPrueba.letraValida('E'), true);
		assertEquals(tablaPrueba.letraValida('K'), true);
		assertEquals(tablaPrueba.letraValida('C'), true);
		assertEquals(tablaPrueba.letraValida('I'), false);
		assertEquals(tablaPrueba.letraValida('Ñ'), false);
		assertEquals(tablaPrueba.letraValida('O'), false);
}
	@Test
	public void testCalcularLetra(){
		TablaAsignacion tablaPrueba = new TablaAsignacion();
		assertEquals(tablaPrueba.calcularLetra("72376173"), 'A');
		assertEquals(tablaPrueba.calcularLetra("78484464"), 'T');
		assertEquals(tablaPrueba.calcularLetra("26861694"), 'V');
		assertEquals(tablaPrueba.calcularLetra("34168723"), 'S');

		
	}

}
