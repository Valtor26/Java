package com.abhishek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString rev = new ReverseString();
		
		assertEquals("avaJ",rev.reverseString("Java"));
	}

}
