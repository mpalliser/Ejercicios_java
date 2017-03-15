package org.foobarspam.pilas;

import java.util.Stack;

public class StringReversor {
	
	//***************		PROPIEDADES		***************	
	private String frase = null;  
	private Stack <Character> pila = new Stack<>();
	
	//***************		CONSTRUCTOR		***************	
	public StringReversor(){
	}
	public StringReversor(String fraseIntroducida){
		this.frase = fraseIntroducida;
	}
	
	//***************		GETTERS		***************	
	public String getFrase(){
		return this.frase;
	}
	public Stack getPila() {
		return this.pila;
	}
	
	//***************		METODOS		***************	
	public void llenarPila() {
		for (int i= 0 ; i < frase.length(); i++){
			pila.push(frase.charAt(i));
		}
	}
	public void printPila() {
		while (pila.size()> 0){
			System.out.print(pila.pop());
		}
	}


	


}
