package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//문제: JUnit 5에서 테스트 메서드의 실행 순서를 지정하려면 어떻게 해야 하나요?
class ExampleTest_1_01Test {

	@Test
	@Order(1)
	void testFirst() {
		// Test code
	}
	
	@Test
	@Order(2)
	void testSecond() 
	{
		// Test code
	}
	
	@Test
	@Order(3)
	void testThird() {
		// Test code
	}

}
