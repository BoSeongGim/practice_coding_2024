package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//문제: JUnit5에서 각 테스트 메서드 전후에 설정 및 해체 코드를 실행하려면 어떻게 해야 하나요?
class ExampleTest_1_04 {

	@BeforeEach
	void setup() {
		//setup code
	}
	
	@AfterEach
	void teardown() {
		//Teardown code
	}

	@Test
	void test() {
		//Test code
	}
}
