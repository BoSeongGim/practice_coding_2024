package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//문제: JUnit5에서 파라미터화된 테스트를 작성하려면 어떻게 해야 하나요?
class ExampleTest_1_03Test {

	@ParameterizedTest
	@ValueSource(ints= {1,2,3})
	void test(int value) {
		//test code with parameter
	}

}
