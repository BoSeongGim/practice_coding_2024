package com.practice.junit5.chpater2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//문제: 두 개의 정수를 받아 합계를 반환하는 sum() 메서드를 테스트하는 JUnit5 테스트 메서드를 작성하세요.
class ExampleTest_2_02Test {

	@Test
	void test() {
		MyClass_2_02 myClass_2_02 = new MyClass_2_02();
		assertEquals(5, myClass_2_02.sum(2,3));
	}
	
	class MyClass_2_02{
		public int sum(int a, int b){
			return a+b;
		}
	}
}
