package org.foobarspam.listas;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Loteria {
	//***************		PROPIEDADES		***************	

	private ArrayList<Integer> numerosLoteria = new ArrayList<Integer>();
	private ArrayList<Integer> numerosReintegro = new ArrayList<Integer>();
	
	//***************		CONSTRUCTOR		***************	
	public Loteria(){
		rellenarNumeros();
	}
	//***************		GETTERS		***************	
	public ArrayList<Integer> getNumeros(){
		return this.numerosLoteria;
	}
	public ArrayList<Integer> getReintegro(){
		return this.numerosReintegro;
	}
	
	//***************		METODOS		***************	
	private void rellenarNumeros(){
		for (int i = 1; i<50; i ++){
			numerosLoteria.add(i);
		}
		for(int i = 0; i<10; i++){
			numerosReintegro.add(i);
		}
	}
	public void obtenerBoleto(){
		for (int i = 0; i<5; i++){
			Collections.shuffle(numerosLoteria);
			Collections.shuffle(numerosReintegro);
			System.out.print("Combinación" + (i+1) + ": ");

			for (int j = 0; j<5; j++){
				System.out.print(numerosLoteria.get(j) + ", ");
			}
			System.out.print(numerosLoteria.get(5));
			System.out.print("\tComplementario: " + numerosLoteria.get(6));
			System.out.print("\tReintegro: " + numerosReintegro.get(0)+ "\n");
		}
	}
}
