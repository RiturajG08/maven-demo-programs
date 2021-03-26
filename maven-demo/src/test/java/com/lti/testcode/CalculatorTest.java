package com.lti.testcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.code.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculator c= new Calculator();
		int actualAddResult = c.add(10, 20);
		//we don't use sysout because we want automation
		int expectedAddResult= 30;
		//to achieve automation we use assertEqual which will
		//automatically check the obtained value and expected value
		assertEquals(expectedAddResult, actualAddResult);
	}
	
	@Test
	public void testSub() {
		Calculator c= new Calculator();
		int actualSubResult= c.sub(10, 20);
		int expectedSubResult= -10;
		assertEquals(expectedSubResult, actualSubResult);
	}

}
