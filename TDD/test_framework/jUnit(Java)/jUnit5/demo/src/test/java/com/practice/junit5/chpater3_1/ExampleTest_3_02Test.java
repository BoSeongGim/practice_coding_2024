package com.practice.junit5.chpater3_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.practice.junit5.ExampleTest_3_01.Calculator;

class ExampleTest_3_02Test {

	@Test
	void testAddition() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,3);
		assertNotEquals(3, result);
	}

	public class Calculator{
		int add(int a, int b) {
			return a+b;
		}
	}
	
}
