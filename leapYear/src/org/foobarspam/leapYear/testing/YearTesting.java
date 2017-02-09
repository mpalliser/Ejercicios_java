package org.foobarspam.leapYear.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import org.foobarspam.leapYear.year.*;

public class YearTesting {

	@Test
	public void testLeapYearO() {
		Year year = new Year(2000);
		assertTrue(year.isLeap());
	}
	@Test
	public void testLeapYearHndred() {
		Year year = new Year(2100);
		assertFalse(year.isLeap());
	}
	@Test
	public void testLeapYearTwoHundred() {
		Year year = new Year(2200);
		assertFalse(year.isLeap());
	}
	@Test
	public void testLeapYearThreeHundred() {
		Year year = new Year(2300);
		assertFalse(year.isLeap());
	}
	@Test
	public void testLeapYearFour() {
		Year year = new Year(2400);
		assertTrue(year.isLeap());
	}
}
