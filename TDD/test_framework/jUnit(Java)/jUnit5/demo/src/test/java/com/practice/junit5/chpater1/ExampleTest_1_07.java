package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//문제 : 잘못된 인수를 사용하여 호출된 메서드에서 사용자 지정 예외가 발생하는지 확인하는 테스트 메서드를 만드세요.
class ExampleTest_1_07 {

	@Test
	public void testCustomException(){
		MyClass myObject = new MyClass();
		
		//assertThrows메서드를 활용하여 예외처리
		assertThrows(MyException.class,()->{
			myObject.myMethod(-1);
		});
	}
	
	class MyClass{
		public void myMethod(int arg) throws MyException{
			if(arg < 0) {
				throw new MyException("Argument cannot be negative");
			}
		}
	}
	
	class MyException extends Exception{
		public MyException(String message) {
			super(message);
		}
	}

}
