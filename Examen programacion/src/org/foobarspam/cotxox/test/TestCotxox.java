package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.cotxox.carrera.Carrera;
import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.junit.Before;
import org.junit.Test;

public class TestCotxox {

	Carrera  main, minima;
	@Before
	public void setUp(){

		main = new Carrera("1111111111111111");
		main.setOrigen("Aeropuerto Son Sant Joan");
		main.setDestino("Magaluf");
		main.setDistancia(7.75);
		main.setTiempoEsperado(10);
		
		minima = new Carrera("2222222222222222");
		minima.setDistancia(1);
		minima.setTiempoEsperado(2);
	}
	@Test
	public void testPickUp(){
		assertEquals(main.getOrigen(), "Aeropuerto Son Sant Joan");
		assertEquals(main.getDestino(), "Magaluf");
		assertEquals(main.getDistancia(), 7.75, 0);

	}
	@Test
	public void testSettersGetters() {
		double costeEsperado = 13.9625;
		assertEquals(main.getCosteEsperado(), costeEsperado, 0.0);
		costeEsperado = 5.00;
		assertEquals(minima.getCosteEsperado(), costeEsperado, 0.0);
	}
	@Test
	public void testGetaDriver(){
		ArrayList<Conductor> poolConductores = new ArrayList<>();
		Conductor conductor = null;		
		String[] nombres = {"Samantha", "Fox", "Mola"};
		for(String nombre: nombres){
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}
		
		String[] matricula = {"4ABC123", "5DHJ444", "7JKK555"};
		String[] modelos = {"Chevy Malibu", "Toyota Prius", "Mercedes A"};
		
		int index = 0;
		// conductora.getClass().getFields();
		for(Conductor conductora: poolConductores){			
			conductora.setMatricula(matricula[index]);
			conductora.setModelo(modelos[index]);
			conductora.setValoracion((byte) 4);
			index++;
		}		
		PoolConductores conductores = new PoolConductores(poolConductores);
		main.asignarConductor(conductores);

	}
}
