package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//문제 : 두 정수의 합이 세 번쩨 정수와 같은지 확인하는 테스트 메서드를 작성하세요.
class ExampleTest_1_05Test {

	@Test
	public void testAddtion(){
		int a=5;
		int b=10;
		int c=15;
		
		assertEquals(c,a+b);
	}

}
