package org.foobarspam.BowlingGame.test;

import static org.junit.Assert.*;
import org.foobarspam.BowlingGame.gameScores.*;
import org.junit.Test;
import org.junit.Before;

public class GameTest {
	
	private Game testPlayer;
	
	@Before
	public void setUp(){
		testPlayer = new Game();
	}
	@Test
	public void test() {
		testPlayer.move("1");
		testPlayer.move("1");
		
		testPlayer.move("1");
		testPlayer.move("1");
		assertEquals(4,testPlayer.getScore());
	}
	@Test
	public void testTwo() {
		testPlayer.move("1");
		testPlayer.move("/");
		
		testPlayer.move("1");
		testPlayer.move("1");
		assertEquals(13,testPlayer.getScore());
	}
	@Test
	public void testThree() {
		testPlayer.move("X");
		
		testPlayer.move("1");
		testPlayer.move("1");
		assertEquals(14,testPlayer.getScore());
	}
	@Test
	public void testFour() {
		testPlayer.move("X");
		
		testPlayer.move("1");
		testPlayer.move("1");
		testPlayer.move("1");
		testPlayer.move("1");
		assertEquals(16,testPlayer.getScore());
	}
}
