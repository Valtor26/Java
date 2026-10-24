package com.abhishek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	
	ReverseString rev = new ReverseString();
	@Test
	void test() {
		assertEquals("avaJ", rev.reverseString("Java"));
	}
	
	@Test
	void testReverse() {
		assertNotEquals("avaJa",rev.reverseString("Java"),()->"The output is wrong");
	}

}
