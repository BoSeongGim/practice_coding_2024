package com.practice.junit5.chpater2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//문제: 문자열이 비어 있는지 여부를 확인하는 테스트를 작성하세요.
class ExampleTest_2_05Test {

	@Test
	void testIsEmptyString(){
		String strTrue = ""; 	//""는 empty 조건에 부합한다(true)
		String strFalse = null;//null은 empty 조건에 부합하지 않는다(false)
		assertTrue(strTrue.isEmpty());
		assertTrue(strFalse.isEmpty());
	}

}
