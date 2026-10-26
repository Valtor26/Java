package com.abhishek.service;
import com.abhishek.learning.Course;

public class PurchaseCourse {
	private Course course;
	
	public boolean proceedWithCourse(Course course) {
		return course.coursePurchased();
	}
}
