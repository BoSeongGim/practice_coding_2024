package com.practice.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//문제: 주어진 값이 null인지 확인하기 위한 JUnit5의 어설션 메서드는 무엇인가요?
class ExampleTest_3_08 {

	@Test
	void testNullValue() {
		String str = null;
		assertNull(str);
	}

}
