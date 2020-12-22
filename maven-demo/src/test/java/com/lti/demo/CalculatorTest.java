package com.lti.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		int actualResult = c.add(10, 20);
		//this is wrong, we should never write sysouts in test cases
		//System.out.println(result)
		//instead we use assertion in our test cases
		int expectedResult = 30;
		assertEquals(expectedResult, actualResult);
		actualResult = c.add(10, -20);
		int expectedResult1 = -10;
		assertEquals(expectedResult1, actualResult);
	}
	
	@Test
	public void testSub() {
		Calculator c = new Calculator();
		int actualResult = c.sub(10, 20);
		int expectedResult = -10;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testmul() {
		Calculator c = new Calculator();
		int actualResult = c.mul(10, 20);
		int expectedResult = 200;
		assertEquals(expectedResult, actualResult);
	}
}
