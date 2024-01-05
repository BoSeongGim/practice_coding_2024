package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

//문제: 두 정수의 합을 확인하는 동적테스트를 작성하세요.
class ExampleTest_1_08Test {
	/*
	@TestFactory
	Stream<DynamicNode> dynamicTest {
		return Stream.of(
			DynamicTest.dynamicTest("Sum of 1 and 2", ()->{
				int num1 = 1;
				int num2 = 2;
				int expected = 3;
				int actual = num1 + num2;
				assertEquals(expected,actual);
			}),
			DynamicTest.dynamicTest("Sum of 0 and -5", ()->{
				int num1=0;
				int num2=-5;
				int expected = -5;
				int actual = num1+num2;
				assertEquals(expected,actual);
			})
		);
	}
	*/
}
