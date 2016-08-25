package com.mlabs.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mlabs.beans.Multiplication;

public class MultiplicationTest {
	
	private Multiplication multiplication;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		multiplication = new Multiplication();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDoMultiply() {
		int res = multiplication.doMultiply(2, 2);
		assertEquals(4, res);
	}

}
