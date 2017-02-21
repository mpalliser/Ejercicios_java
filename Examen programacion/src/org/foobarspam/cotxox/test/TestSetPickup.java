package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera.Carrera;
import org.junit.Before;
import org.junit.Test;

public class TestSetPickup {
	private String tarjetaCredito = null;
	private String origen = null;
	private String destino = null;
	private double distancia = 0.0d;
	private int tiempoEsperadoMinutos = 0;
	private Carrera carrera = null;
	@Before
	public void setUp(){
		tarjetaCredito = "4916119711304546";
		origen = "Aeroport Son Sant Joan";
		destino= "Magaluf";
		distancia = 7.75;
		tiempoEsperadoMinutos = 10;
		
		carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
	}
	@Test
	public void testSettersGetters() {
		assertEquals(carrera.getOrigen(), origen);
		assertEquals(carrera.getDestino(), destino);
		assertEquals(carrera.getDistancia(), distancia, 0);
		assertEquals(carrera.getTarjetaCredito(), tarjetaCredito);
	}

}
