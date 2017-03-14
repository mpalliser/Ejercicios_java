package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Drawable;
import figuras.Drawables;
import figuras.Elipse;
import figuras.Rectangulo;

public class TestDrawable {
	
	private static ArrayList<Drawable> figuras;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		Circulo circulo = new Circulo("circulo");
		Cuadrado cuadrado = new Cuadrado("cuadrado");
		Elipse elipse = new Elipse("elipse");
		Rectangulo rectangulo = new Rectangulo("rectangulo");
		figuras = new ArrayList<>();
		figuras.add(circulo);
		figuras.add(cuadrado);
		figuras.add(elipse);
		figuras.add(rectangulo);

	}
	@Test
	public void test() {
		assertEquals(figuras.size(), 4);
	}
	
	@Test
	public void testDibujarDrawables() {
		
		// Dibujemos las figuras
		
		Drawables.dibujarDrawables(figuras);
		
		// Las interfaces son un tipo de dato
		// figura es drawable pero no todo drawable es una figura
	}
	@Test
	public void testPolimorfismo(){
		
		Drawable circulito = new Circulo("círculito", 5);
		
		assertTrue(circulito instanceof Drawable);
		assertTrue(circulito instanceof Circulo);
		
		// vista Drawable de circulito => acceso al metodo draw de la interfaz e implementado!
		
		circulito.draw();
		
		// vista Drawable de circulito => acceso al metodo applyTheme de la interfaz e implementado!
		
		circulito.applyTheme();
	
	}
	
	@Test
	public void testAplicarTema(){
		Drawables.aplicarTema(figuras);
	}
}
