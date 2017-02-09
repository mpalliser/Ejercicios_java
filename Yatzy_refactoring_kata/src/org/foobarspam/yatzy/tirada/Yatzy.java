package org.foobarspam.yatzy.tirada;

import java.util.ArrayList;

public class Yatzy {
	
	//private ArrayList<Integer> dice = new ArrayList<Integer>(5);
	private byte [] dice = new byte[5];
	
	//Constructor
	public Yatzy(byte d1, byte d2, byte d3, byte d4, byte d5){
		this.dice = dice;
		/*
		dice.add(d1);
		dice.add(d2);
		dice.add(d3);
		dice.add(d4);
		*/
		dice[0] = d1;
		dice[1] = d2;
		dice[2] = d3;
		dice[3] = d4;
		dice[4] = d5;
	}
	
	//Metodos
    public int chance() {
        int total = 0;
        for (int i: dice) {
            total += i;
        }
        return total;
    }
}
