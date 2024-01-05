package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//문제 : 문자열이 팔린드롬인지 확인하는 파라미터화된 테스트를 작성하세요.
class ExampleTest_1_09Test {

	@ParameterizedTest
	@ValueSource(strings = {"racecar", "deified", "civic"})
	void testPalindromeString(String input) {
		assertTrue(isPalindrome(input));
	}
	
	private boolean isPalindrome(String str){
		StringBuilder sb = new StringBuilder(str);
		return str.equals(sb.reverse().toString());
	}
}
