package com.nbs.calculator;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
	@Test
	public void addTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void subtractTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(4,2);
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void multiplyTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(4,2);
		Assert.assertEquals(8, result);
	}

}
