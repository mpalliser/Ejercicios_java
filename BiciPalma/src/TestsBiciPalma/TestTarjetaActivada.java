package TestsBiciPalma;

import static org.junit.Assert.*;

import org.junit.Test;

import BiciPalma.Bicicleta;
import BiciPalma.Estacion;
import BiciPalma.TarjetaUsuario;

public class TestTarjetaActivada {

	@Test
	public void tarjetaActivada(){
		Estacion estacion = new Estacion(1, "Manacor", 6);
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
		estacion.leerTarjetaUsuario(tarjetaUsuario);
		assertEquals(true, tarjetaUsuario.getActivada());
	}

}
