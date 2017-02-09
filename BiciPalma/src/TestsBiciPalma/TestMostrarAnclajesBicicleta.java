package TestsBiciPalma;

import static org.junit.Assert.*;

import org.junit.Test;

import BiciPalma.Bicicleta;
import BiciPalma.Estacion;

public class TestMostrarAnclajesBicicleta {

	@Test
	public void mostrarAnclajesBicicleta(){
		int[] bicicletas = {291, 292, 293, 294};
		Estacion estacion = new Estacion(1, "Manacor", 6);
		
		for ( int id : bicicletas){
			Bicicleta bicicleta = new Bicicleta(id);
			estacion.anclarBicicleta(bicicleta);
		}
		System.out.println("anclajesLibres tras generar "+ bicicletas.length + " bicis: " + estacion.anclajesLibres());
		assertEquals(2, estacion.anclajesLibres());
	}

}
