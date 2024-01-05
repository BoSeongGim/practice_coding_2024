package com.practice.junit5.chpater3_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest_3_16Test {

	@Test
	void test() {
		String actual ="The quick brown forx jumps over the lazy dog";
		String expected = "brown fox";
		
		assertTrue(actual.contains(expected));
	}

}
