package org.foobarspam.conjuntos;

import java.util.TreeSet;

public class MostrarString {
	//***************		PROPIEDADES		***************	
	private String frase = "dabale arroz a la zorra el abad";  
	private TreeSet <Character> caracteres = new TreeSet <Character>();
	
	//***************		CONSTRUCTOR		***************	
	public MostrarString(){
	}
	public MostrarString(String frase){
		this.frase = frase;
	}
	//***************		GETTERS		***************	
	public String getFrase(){
		return this.frase;
	}
	public TreeSet getCaracteres(){
		return this.caracteres;
	}
	//***************		METODOS		***************	
	public void borrarLetrasRepetidas() {
		for(int i = 0; i < frase.length(); i++) {
		   caracteres.add(frase.charAt(i)); 
		}  
	}
	public void imprimirCaracteres(){
		for(Character letra : caracteres){
			   System.out.print(letra + "  ");
			}
	}
}
