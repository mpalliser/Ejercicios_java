package org.foobarspam.Arrays;

import java.util.Random;

public class RandomArray {
	/*
	 * Declara una array de 25 datos enteros, entre el 25 y el 50,
	 * de numeros aleatorios.
	 * Declara un vector auxiliar de 4 datos tipo real. Que contendra:
	 * Pos 0 numeros pares de la lista.
	 * Pos 1 numeros impares de la lista.
	 * Pos 2 media de numeros impares de lista.
	 * Pos 3 suma de los numeros enteros comprendidos entre 1 y el
	 * valor mas pequeño de la lista.
	 */
	private int[] lista = new int[25];
	private int[] auxiliar = new int[4];
	private int pares = 0;
	private int impares = 0;

	//constructor
	public RandomArray(int...lista){
		this.lista = lista;
	}
	//setters getters

	public int[] getAuxiliar(){
		return this.auxiliar;
	}
	public int[] getLista(){
		return this.lista;
	}
	public int getPares(){
		return this.auxiliar[0];
	}
	public void setPares(int pares){
		this.auxiliar[0] = pares;
	}
	public void setImpares(int impares){
		this.auxiliar[1] = impares;
	}
	public int getImpares(){
		return this.auxiliar[1];
	}
	public int getNumeroMenor(){
		return this.auxiliar[2];
	}
	private void setNumeroMenor(int numeroMenor) {
		this.auxiliar[2] = numeroMenor;
	}
	public int getTotalComprendido(){
		return this.auxiliar[3];
	}
	public void setPositionAuxiliar(int position, int number){
		this.auxiliar[position] = number;
	}
	private void setTotalComprendido(int totalComprendido) {
		this.auxiliar[3] = totalComprendido;
	}
	//metodos
	public void createLlist(){
		//declaramos el numero menor que como mucho sera 50, en caso de que sea menor se en carca esMenor()
		setNumeroMenor(50);
		//Random randomize = new Random();
		for (int number : getLista()){
			//modificar 3 siguientes linear para caso test.
			//int randomNumber = randomize.nextInt(50 - 25 +1) + 25;
			//list[number] = randomNumber;
			parImpar(number);
			esMenor(number);
		}
		setPares(pares);
		setImpares(impares);
	}
	public void parImpar(int number){
		if (number %2==0){
			pares ++;
		}else {
			impares ++;
		}
	}
	public void esMenor(int number){
		if(number < getNumeroMenor()){
			setNumeroMenor(number);
		}
	}
	public int sumaComprendidosEntre1yMinimo(int numeroMenor){
		for (int i = 0; i < numeroMenor; i++){
			setTotalComprendido(getTotalComprendido() + i);
		}
		return getTotalComprendido();
	}
}
