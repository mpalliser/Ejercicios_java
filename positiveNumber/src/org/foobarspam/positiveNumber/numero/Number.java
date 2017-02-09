package org.foobarspam.positiveNumber.numero;

public class Number {
	private int numero = 0;
	
	public Number(int numero){
		this.numero = numero;
	}
	public int getNumber(){
		return this.numero;
	}
	public boolean isPositive(){
		return getNumber() >= 0;
	}
}

