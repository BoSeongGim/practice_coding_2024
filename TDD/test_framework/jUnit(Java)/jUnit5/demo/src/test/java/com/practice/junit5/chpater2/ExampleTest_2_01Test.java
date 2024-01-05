package com.practice.junit5.chpater2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExampleTest_2_01Test {
	@Test
	@DisplayName("String equal check")
	void myTestMethod() {
		String expected = "Hello, World!";
		String actual = "Hello, World!";
		assertEquals(expected, actual);
	}
}
