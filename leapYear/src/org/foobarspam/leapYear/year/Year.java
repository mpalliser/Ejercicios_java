package org.foobarspam.leapYear.year;

public class Year {
	
	private int year = 0;
	
	public Year(int year){
		this.year = year;
	}
	public int getYear(){
		return this.year;
	}
	public boolean isLeap(){
		return (getYear()%4 == 0 &&(getYear()%100 != 0 || getYear()%400 == 0));
	}
}
