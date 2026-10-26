package com.abhishek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArraysTesting {
	
	@BeforeEach
	void show() {
		System.out.println("Hi");
	}
	
	@BeforeAll
	static void show1() {
		System.out.println("Hi before all");
	}
	
	@AfterEach
	void print() {
		System.out.println("Hello");
	}
	
	@AfterAll
	static void print1() {
		System.out.println("Hi after all");
	}

	@Test
	void test() {
		int arr1[] = {2,4,6,8};
		int arr2[] = {2,4,6,8};
		
		assertArrayEquals(arr1,arr2);
		System.out.println("test");
	}
	
	@Test
	void test2() {
		int arr1[] = {2,4,6,8};
		int arr2[] = {2,4,6,8};
		
		assertArrayEquals(arr1,arr2);
		System.out.println("test2");
	}

}
