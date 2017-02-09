package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import game.ScoreCard;

public class ScoreCardTest {
	private ScoreCard scoreCard;
	private String pins;
	private int total = 0;
	
	@Before
	public void setUp(){
		scoreCard = new ScoreCard();
	}

	@Test
	public void TotalScoreHittingPins(){
		
		// Hitting pins total = 60
		pins = "12345123451234512345";
		total = 60;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());			
	}
	
	@Test
	public void TotalScoreHittingPinsFail(){
		
		// test symbol -
		pins = "9-9-9-9-9-9-9-9-9-9-";
		total = 90;		
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();	
		assertEquals(total, scoreCard.getTotalScore());
	}
	@Test
	public void TotalScoreHittingPinsFailTwo(){
	
		// test symbol -
		pins = "9-3561368153258-7181";         
		total = 82;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();	
		assertEquals(total, scoreCard.getTotalScore());
	}


}