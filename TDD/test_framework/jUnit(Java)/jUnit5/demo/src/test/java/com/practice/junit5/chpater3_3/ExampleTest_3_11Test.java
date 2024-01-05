package com.practice.junit5.chpater3_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest_3_11Test {

	@Test
	void testAssertAll() {
		String firstName = "john";
		String lastName = "Doe";
		int age =30;
		
		assertAll("person",
			() -> assertEquals("john",firstName),
			() -> assertEquals("Doe",lastName),
			() -> assertEquals(30,age)		
		);
	}
}
