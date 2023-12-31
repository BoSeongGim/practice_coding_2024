package com.practice.junit5.chpater1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ExampleTest_1_10 {

	@Test
	void testArraySort() {
		int[] input = {3,1,4,2,5};
		int[] expected = {1,2,3,4,5};
		
		Arrays.sort(input);//Arrays.sort()메소드:입렬배열을 정렬한다.
		
		assertAll("Array Sorting",
			()-> assertArrayEquals(input, expected),
			()->{
				
				//중첩된 테스트 메서드이다.
				//
				assertAll("Element ordering",
					()->assertEquals(1,input[0]),
					()->assertEquals(2,input[1]),
					()->assertEquals(3,input[2]),
					()->assertEquals(4,input[3]),
					()->assertEquals(5,input[4])
				);
				
			}	
		);
	}

}
