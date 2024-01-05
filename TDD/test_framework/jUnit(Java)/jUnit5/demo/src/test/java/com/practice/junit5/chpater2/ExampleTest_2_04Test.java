package com.practice.junit5.chpater2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//문제 : 버블 정렬 알고리즘을 사용하여 정수 배열을 정렬하는 bubbleSort()메서드의 성능을 테스트하는 JUnit5테스트 메서드를 작성하세요.
class ExampleTest_2_04Test {

	@Test
	public void testBubbleSortPerformance() {
	//	MyClass myClass = new MyClass();
		int[] array = {5,4,3,2,1};
		long startTime = System.currentTimeMillis();
		//myClass.bubbleSort(array);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		assertTrue(totalTime < 1000);
	}

}
