package com.practice.junit5.chpater2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//문제: 숫자를 0으로 나누려고 할 때 예외가 발생하는지 확인하는 테스트를 작성하세요.
class ExampleTest_2_06 {

	@Test
	void testDivideByZero() {
		assertThrows(ArithmeticException.class, ()-> {
			int result = 5/0;
		});
	}

}
