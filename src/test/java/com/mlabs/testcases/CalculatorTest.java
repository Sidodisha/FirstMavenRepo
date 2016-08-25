package com.mlabs.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mlabs.beans.Calculator;

public class CalculatorTest {

	private Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDoMultiply() {
		int res = calc.doMultiply(2, 2);
		assertEquals(4, res);
	}
	
	@Test
	public void testDoDivision() {
		int res = calc.doDivision(10, 2);
		assertEquals(5, res);
	}
}
