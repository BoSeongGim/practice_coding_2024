package com.practice.junit5.chpater3_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest_3_14Test {

	@Test
	void testDivideByZeroThrowsException() {
		int numerator = 6;
		int denominator = 0;
		
		assertThrows(ArithmeticException.class, ()-> {
			int result = numerator / denominator;
		});
		
	}

	class ArithmeticException extends Exception{
		public ArithmeticException(String message) {
			super(message);
		}
	}

	
}