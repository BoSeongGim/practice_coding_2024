package com.practice.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//문제: JUnit5에서 부울 표현식이 참인지 확인하기 위한 어설션 메서드는 무엇인가요?
class ExampleTest_3_07 {

	@Test
	void testBooleanExpression() {
		int num =10;
		assertTrue(num > 5);
	}

}
