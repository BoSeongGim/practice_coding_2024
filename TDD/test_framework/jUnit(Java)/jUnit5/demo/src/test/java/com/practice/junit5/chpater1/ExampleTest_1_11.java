package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//문제: 숫자가 소수인지 확인하는 테스트 인터페이스와 기본 테스트 메서드를 작성하세요

public interface ExampleTest_1_11 { //ExampleTest_11인터페이스:숫자가 소수인지 확인하는 테스트 인터페이스이다. 내부에 NumberTestImpl을 내장한다.

	public boolean isPrime(int number);
	
	@Test
	default void testIsPrime(){ //testIsPrime메서드 : assertTrue,assertFalse메서드를 통해 여러 케이스에 대하여 isPrime()구현을 테스트한ek.
		assertTrue(isPrime(2));
		assertTrue(isPrime(3));
		assertFalse(isPrime(4));
		assertTrue(isPrime(100));
		assertFalse(isPrime(6));
	}
	/*
	 * 책에서는 ExampleTest_11를 내장하지만 junit5테스트는 불가했다.
	 * 
	 */
	/*
	class NumberTestImpl implements ExampleTest_11{ //NumberTestImpl클래스:ExampleTest_11인터페이스를 구현, isPrime메서드를 구현한다.

		@Override
		public boolean isPrime(int number) {
			if(number <2) {
				return false;
			}
			
			for(int i=2; i <= Math.sqrt(number);i++) {
				if(number % i ==0) {
					return false;
				}
			}			
			return true;
		}
	}
	 */
}

