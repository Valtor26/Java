package com.abhishek;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString rs = new ReverseString();
		assertEquals("avaJ",rs.reverseString("Java"));
	}

}
