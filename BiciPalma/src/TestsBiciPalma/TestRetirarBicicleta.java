package TestsBiciPalma;

import static org.junit.Assert.*;

import org.junit.Test;

import BiciPalma.Bicicleta;
import BiciPalma.Estacion;
import BiciPalma.TarjetaUsuario;

public class TestRetirarBicicleta {

	@Test
	public void test() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
		int[] bicicletas = {291, 292, 293, 294};		
		for ( int id : bicicletas){
			Bicicleta bicicleta = new Bicicleta(id);
			estacion.anclarBicicleta(bicicleta);
		}
		estacion.retirarBicicleta(tarjetaUsuario);
		estacion.consultarAnclajes();
		estacion.anclajesLibres();
		System.out.println("anclajes libres: " + estacion.anclajesLibres());
		assertEquals(3 ,estacion.anclajesLibres());
	}
}
