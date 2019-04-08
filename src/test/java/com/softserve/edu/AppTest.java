package com.softserve.edu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void testApp1() {
		Calc calc = new Calc();
		double expected = 5;
		double actual = calc.add(2, 2);
		Assert.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testApp2() {
		Calc calc = new Calc();
		double expected = 8;
		double actual = calc.add(2, 5);
		Assert.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testApp3() {
		System.out.println("getProperty IS_JENKINS = " + System.getProperty("IS_JENKINS"));
		System.out.println("getenv IS_JENKINS = " + System.getenv("IS_JENKINS"));
	}

}
