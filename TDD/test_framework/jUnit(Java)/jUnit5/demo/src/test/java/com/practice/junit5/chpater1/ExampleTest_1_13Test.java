package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.Math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//문제: 두 개의 숫자를 더하는 메서드를 테스트하는 테스트 클래스를 생성하세요.
class ExampleTest_1_13Test {
	
	@Test
	@DisplayName("Test adding two positive numbers")
	void testAddPositive() {
		assertEquals(4, Math.addExact(2,2), "2+2 should equal 4");
	}
	
	@Test
	@DisplayName("Test adding a positive and a negative number")
	void testAddPositiveAndNegative() {
		assertEquals(-1, Math.addExact(2,-3), "2+-3 should equal -1");
	}
	
	@Test
	@DisplayName("Test adding two negative numbers")
	void testAddNegative() {
		assertEquals(-5,Math.addExact(-2,-3), "-2+-3 should equal -5");
	}
	
}
