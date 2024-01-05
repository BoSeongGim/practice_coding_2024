package com.practice.junit5.chpater2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//문제: 두 객체가 동일한지 확인하는 테스트를 작성하세요.
class ExampleTest_2_09Test {

	@Test
	void testObjectsAreEqual(){
		MyClass_2_09 obj1 = new MyClass_2_09(1,"foo");
		MyClass_2_09 obj2 = new MyClass_2_09(1,"foo");
		assertEquals(obj1,obj2);
	}
	
	public class MyClass_2_09 {
		public MyClass_2_09(int i, String string) {
		}
	}

}
