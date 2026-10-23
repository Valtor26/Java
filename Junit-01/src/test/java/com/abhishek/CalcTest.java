package com.abhishek;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c = new Calc();
		int res = c.divide(10, 5);
		assertEquals(3,res);
	}

}
