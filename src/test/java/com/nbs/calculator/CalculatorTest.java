package com.nbs.calculator;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
//hello
	@Test
	public void addTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4, result);
	}

}
