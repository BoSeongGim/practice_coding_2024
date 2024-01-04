package com.practice.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest_3_03 {

	@Test
	void testIsEven() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.isEven(4));
		assertFalse(calculator.isEven(3));
	}
	
	public class Calculator{
		boolean isEven(int checkValue) {
			if(checkValue%2 == 0) {
				return true;
			}
			return false;
		}
		
	}
}
