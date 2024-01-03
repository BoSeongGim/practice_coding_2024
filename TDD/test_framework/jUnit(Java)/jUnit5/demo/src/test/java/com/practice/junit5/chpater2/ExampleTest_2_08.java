package com.practice.junit5.chpater2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//문제: 메서드가 예상 값을 반환하는지 확인하는 테스트를 작성하세요.
class ExampleTest_2_08 {

	@Test
	void testMethodReturnsExpectedValue() {
		MyClass_2_08 myObj = new MyClass_2_08();
		int result = myObj.addNumbers(2,3);
		assertEquals(5,result);
	}
	
	class MyClass_2_08 {
		int addNumbers(int a, int b) {
			return a+b;			
		}
	}

}
