package com.mlabs.beans;

public class Calculator {

	public int doMultiply(int a, int b) {
		int result = a * b;
		System.out.println("The Result is:" + result);
		return result;
	}

	public int doDivision(int a, int b) {
		int result = a / b;
		System.out.println("The Result is:" + result);
		return result;
	}
}
