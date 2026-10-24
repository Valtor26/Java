package com.abhishek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void testReverseString_OneWord() {
		ReverseString rev = new ReverseString();
		
		assertEquals("avaJ",rev.reverseString("Java"));
	}
	
	@Test
	void testReverseString_MultiWord() {
		ReverseString rev = new ReverseString();
		
		assertEquals("rac ecar", rev.reverseString("race car"));
	}

}
