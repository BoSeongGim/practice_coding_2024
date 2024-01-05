package com.practice.junit5.chpater3_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//문제: 두 객체가 동일한지 확인하기 위한 JUnit5의 어설션 메서드는 무엇인가요?
class ExampleTest_3_06Test {

	@Test
	void testStringEquality() {
		String str1 = "Hello";
		String str2 = "Hello";
		assertEquals(str1, str2);
	}

}
