package com.practice.junit5.chpater2;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//문제: 두 정수를 받아 나눗셈을 반환하는 divide() 메서드를 테스트하는 JUnit5테스트 메서드를 작성하십시오.
//     이 메서드는 2번째 인수가 0이면 ArithmeticException을 던집니다.
class ExampleTest_2_03Test {

	@Test
	public void testDivideMethodWithException(){
		MyClass_2_03 myClass_2_03 = new MyClass_2_03();
		assertThrows(ArthmeticException.class, ()-> {
			myClass_2_03.divide(10,0);
		});
	}
	
	class MyClass_2_03{
		public long divide(int a, int b) {
			return a/b;
		}
	}
	
	class ArthmeticException extends Exception{
		public ArthmeticException(String message) {
			super(message);
		}
	}
	
}
