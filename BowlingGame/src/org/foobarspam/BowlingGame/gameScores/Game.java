package org.foobarspam.BowlingGame.gameScores;

public class Game {
	private int score = 0;
	private int pinsDownInt = 0;
	private int lastMove = 0;
	private boolean spare = false;
	private boolean strike = false;
	private int counter = 0;
	
	//constructor
	public Game(){
		setScore(0);
	}
	//Seters Geters
	private void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return this.score;
	}
	
	//genera la tabla de puntuacion
	public void move(String pinsDown){
		conversor(pinsDown);
		if (spare == true){
			isSpare();
		}else if(strike == true){
			isStrike();
		}
		score += pinsDownInt;
		
		/* activa spare/strike para sumar doble la
		proxima tirada */
		if (pinsDown == "/"){
			spare = true;
		}else if ( pinsDown == "X"){
			strike = true;
			counter = 0;
		}
		lastMove = pinsDownInt;
	}

	private void isStrike(){
		if (counter < 2){
			score += pinsDownInt;
		}else {
			strike = false;
		}
		counter ++;
	}
	private void isSpare(){
		score += pinsDownInt;
		spare = false;
	}
	
	//convierte los strings recibidos a integer
	private void conversor(String pinsDown){
		if (pinsDown == "X"){
			pinsDownInt = 10;
		}else if (pinsDown == "/"){
			pinsDownInt = 10 - lastMove;
		}else {
			pinsDownInt = Integer.parseInt(pinsDown);
		}
	}
}

