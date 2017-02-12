package org.foobarspam.testBiciPalma;

import static org.junit.Assert.*;

import org.foobarspam.BiciPalma.Bicicleta;
import org.foobarspam.BiciPalma.Estacion;
import org.junit.Test;

public class TestsBiciPalma {

	@Test
	public void testVisualizarEstado() {
		Estacion estacion = new Estacion(1,"Manacor", 6);
		assertEquals(estacion.getID(), 1);
		assertEquals(estacion.getDireccion(), "Manacor");
		assertEquals(estacion.getNumeroAnclajes(), 6);
		System.out.print("\n**** caso Test visualizar estado de la estacion *** \n");
		estacion.consultarEstacion();
	}
	@Test
	public void testVisualizarAnclajesLibres(){
		Estacion estacion = new Estacion(1,"Manacor", 6);
		System.out.println("\n **** caso TEST visualizar anclajes libres **** \n");
		assertEquals(estacion.anclajesLibres(), 6);
		System.out.print("anclajesLibres: " + estacion.anclajesLibres() + "\n");
	}
	@Test
	public void testAnclarBicicleta(){
		Estacion estacion = new Estacion(1,"Manacor", 6);
		System.out.print("\n**** caso TEST anclar bicicleta(s) ****\n\n");
		int[] bicicletas = {291, 292, 293, 294};
		for (int id = 0; id < bicicletas.length; id ++){
			Bicicleta bicicleta = new Bicicleta(bicicletas[id]);
			estacion.anclarBicicleta(bicicleta);
			estacion.mostrarAnclaje(bicicleta, id);
		}
		assertEquals(estacion.anclajesLibres(), estacion.getNumeroAnclajes() - bicicletas.length);
		System.out.println("anclajesLibres tras generar " + bicicletas.length + " bicis: " + estacion.anclajesLibres());
	}
	@Test
	public void testConsultarBicicletasAncladas(){
		Estacion estacion = new Estacion(1,"Manacor", 6);
		System.out.println("\n **** caso TEST consultar bicicletas ancladas **** \n");
		int[] bicicletas = {291, 292, 293, 294};
		for (int id: bicicletas){
			Bicicleta bicicleta = new Bicicleta(id);
			estacion.anclarBicicleta(bicicleta);
		}
		int anclajesLibres = 2;
		assertEquals(estacion.consultarAnclajes(), anclajesLibres);
	}
	@Test
	public void testRetirarBicicleta(){
		Estacion estacion = new Estacion(1,"Manacor", 6);
		System.out.println("\n **** caso TEST retirar bicicleta **** \n");
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
		
	}


}
