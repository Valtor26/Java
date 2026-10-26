package com.abhishek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.abhishek.learning.*;
import com.abhishek.service.PurchaseCourse;

class TestPurchaseCourse {

	PurchaseCourse pc = new PurchaseCourse();
	@Test
	void testJava() {
		JavaCourse jc = new JavaCourse();
		
		
		
		boolean status = pc.proceedWithCourse(jc);
		
		assertTrue(status);
	}
	
	@Test
	void testSpringBoot() {
		SpringBootCourse sb = new SpringBootCourse();
		
		pc.proceedWithCourse(sb);
	}
	
	@Test
	void testJunit() {
		JunitCourse juc = new JunitCourse(); 
		
		pc.proceedWithCourse(juc);
	}

}
