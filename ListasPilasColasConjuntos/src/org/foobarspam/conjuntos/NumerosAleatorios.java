package org.foobarspam.conjuntos;

import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class NumerosAleatorios {
	//***************		PROPIEDADES		***************	
	private int numero = 0;
	private TreeSet <Integer> almacen = new TreeSet<>();
	
	//***************		CONSTRUCTOR		***************	
	public NumerosAleatorios(){
		generarNumeros();
	}
	//***************		GETTERS		***************	
	public TreeSet getAlmacen(){
		return this.almacen;
	}
	//***************		METODOS		***************	
	public void generarNumeros(){
		while (almacen.size()<8){
			numeroAleatorio();
			almacen.add(numero);
		}
	}
	public void numeroAleatorio(){
		numero = ThreadLocalRandom.current().nextInt(1, 11);
	}
	public void mostrarAlmacen(){
		for(int i : almacen){
			System.out.println(i);
		}
	}
}
