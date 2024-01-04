package com.practice.junit5;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.practice.junit5.ExampleTest_3_03.Calculator;

class ExampleTest_3_04 {

	@Test
	void testDivideByZero() {
		Calculator calculator = new Calculator();
		assertThrows(ArithmeticException.class, ()-> calculator.devide(2, 0));
	}
	
	public class Calculator{
		long devide(int a, int b) {
			return a/b;
		}
		
	}
}
