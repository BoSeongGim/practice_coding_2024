package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.practice.junit5.chpater1.ExampleTest_1_07Test.MyException;

//문제: 예외를 던지는 메서드를 테스트하는 테스트 클래스를 만드세요.
class ExampleTest_1_14Test {

	//MyException myException = new MyException(null);
	
	@Test
	@DisplayName("Test that excption is thrown")
	void testThrowsException() {
		assertThrows(MyException.class, ()->{
		//	myException.addSuppressed(myException);
		});
	}

}
