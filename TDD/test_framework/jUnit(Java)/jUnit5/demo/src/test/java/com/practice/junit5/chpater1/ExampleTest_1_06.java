package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//문제: 주어진 문자열이 비어 있는지, 또는 널인지 확인하는 테스트 메서드를 작성하세요.
class ExampleTest_1_06 {

	@Test
	public void testEmptyOrNullString(){
		String str1 = "";
		String str2 = null;
		String str3 = "hello";
		
		assertTrue(str1.isEmpty());
		assertTrue(str2 == null);
		assertFalse(str3.isEmpty());
	}

}
