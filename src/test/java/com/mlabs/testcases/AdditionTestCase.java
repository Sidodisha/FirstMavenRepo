package com.mlabs.testcases;

import org.junit.Test;

import com.mlabs.beans.Addition;

public class AdditionTestCase {
	
	@Test
	public void testAddition(){
		Addition.doAddition(20, 20);
	}
}
