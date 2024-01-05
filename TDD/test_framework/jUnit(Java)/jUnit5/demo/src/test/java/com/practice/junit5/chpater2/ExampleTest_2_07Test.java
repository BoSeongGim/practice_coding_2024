package com.practice.junit5.chpater2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
//문제: 주어진 리스트에 특정 값이 포함되어 있는지 확인하는 테스트를 작성하세요.
class ExampleTest_2_07Test {

	@Test
	void testListContainsValue() {
		List<String>list = Arrays.asList("apple", "banana", "orange");
		assertTrue(list.contains("banana"));
	}

}
