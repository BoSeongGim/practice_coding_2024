package com.practice.junit5.chpater3_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest_3_15Test {

	@Test
	void testDeltaEquals() {
		double expected = 13.0;
		double actual = 12.9999;
		double delta = 0.01;
		assertEquals(expected, actual, delta);
	}

}
