package org.foobarspam.pilas;

import java.util.Stack;

public class StringConversor {
	
	//***************		PROPIEDADES		***************	
	private String frase = null;  
	Stack <Character> pila = new Stack<>();
	
	//***************		CONSTRUCTOR		***************	
	public StringConversor(){
	}
	public StringConversor(String fraseIntroducida){
		this.frase = fraseIntroducida;
	}
	
	//***************		METODOS		***************	
	public void reverseString() {
		for (int i= 0 ; i < frase.length(); i++){
			pila.push(frase.charAt(i));
		}
	}
	public void printPila() {
		for (char i : pila){
			System.out.print(i);
		}
	}
	//public void printReversePila(){
		//pila.peek();
		//System.out.println(pila.peek());	
	//}
	


}
