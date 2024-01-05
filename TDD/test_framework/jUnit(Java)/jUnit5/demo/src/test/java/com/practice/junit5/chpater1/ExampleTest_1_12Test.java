package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//문제:간단한 JUnit5테스트 클래스를 생성하세요
class ExampleTest_1_12Test {

	/*/
	 * 참(true)를 어설트하는 단일 메서드가 있는 테스트 클래스를 생성한다.
	 */
	@Test
	@DisplayName("Test should always pass")	//@DisplayName 어노테이션:테스트에 보다 설명적인 이름을 부여하는데 사용된다.
	void test() {
		assertTrue(true); 
	}

}
