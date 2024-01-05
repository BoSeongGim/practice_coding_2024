package com.practice.junit5.chpater3_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest_3_13Test {

	@Test
	void testFullName() {
		String firstName = "john";
		String lastName = "Doe";
		
		assertAll("Full Name",
			() -> assertNotNull(firstName),
			() -> assertNotNull(lastName),
			() -> assertEquals("john Doe", firstName + " " + lastName)
		);
	}

}
