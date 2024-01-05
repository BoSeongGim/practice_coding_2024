package com.practice.junit5.chpater3_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//부울 어선셜
class ExampleTest_3_10Test {

	@Test
	void testBoolean() {
		boolean condition1 = true;
		boolean condition2 = false;
		
		assertTrue(condition1);
		assertFalse(condition2);
		
	}

}
