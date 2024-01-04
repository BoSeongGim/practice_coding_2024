package com.practice.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest_3_01 {

	@Test
	void testAddition() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,3);
		assertEquals(5, result);
	}

	public class Calculator{
		int add(int a, int b) {
			return a+b;
		}
	}
}
