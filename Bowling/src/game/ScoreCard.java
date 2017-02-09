package game;

public class ScoreCard {
	
	//propiedades
	private String scoreCard = "";
	private int totalScore = 0;
	private String symbols = "-123456789X/";
	private int firstRollPins = 0;
	private boolean firstRoll = true;
	private boolean spare = false;
	private boolean strike = false;
	private int strikeCounter = 0;
	
	
	//constructores
	public ScoreCard(){
		//Por defecto
	}
	public ScoreCard(String pins){
		this.scoreCard = pins;
	}
	
	//setters y getters
	public void setScoreCard(String pins){
		this.scoreCard = pins;
	}
	public String getScoreCard(){
		return this.scoreCard;
	}
	public int getTotalScore(){
		return totalScore;
	}
	private String getSymbols(){
		return this.symbols;
	}
	private void setTotalScore(int totalScore){
		this.totalScore = totalScore;
	}
	private void setFirstRollPins(int pins){
		this.firstRollPins = pins;
	}
	private int getFirstRollPins(){
		return this.firstRollPins;
	}
	private void setFirstRoll(boolean value){
		this.firstRoll = value;
	}
	private boolean isFirstRoll(){
		return this.firstRoll;
	}
	private boolean isSpare(){
		return this.spare;
	}
	private void setSpare(boolean value){
		this.spare = value;
	}
	private void setStrike(boolean value){
		this.strike = value;
	}
	private boolean isStrike(){
		return this.strike;
	}

	
	//metodos
	//coge el primer numero de scoreCard y inicia el juego.
	public void calculateScore(){
		for(int i=0; i < getScoreCard().length(); i++){
			char pin = getScoreCard().charAt(i);
			roll(pin);
		}		
	}
	public void roll(char pins){
		if (isFirstRoll()){
			setFirstRoll(false);
			setFirstRollPins(getSimbolValue(pins));
			if (isSpare()){
				setTotalScore(getTotalScore() + getFirstRollPins());
				setSpare(false);
			}
		}else if (pins == '/'){
			setTotalScore(getTotalScore()+10);
			setSpare(true);
			setFirstRoll(true);
		}else {
		setTotalScore(getTotalScore() + getFirstRollPins() + getSimbolValue(pins));
		setFirstRoll(true);
		}
	}
	//convierte la tirada de string a int utilizando su posicion en symbols
	public int getSimbolValue(char value){ 
		return getSymbols().indexOf(value);
	}
}
