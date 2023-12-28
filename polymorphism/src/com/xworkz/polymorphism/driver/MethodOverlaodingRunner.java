package com.xworkz.polymorphism.driver;

import com.xworkz.polymorphism.things.MethodOverlaoding;

public class MethodOverlaodingRunner {

	
	public static void main(String[] args) {
		
		MethodOverlaoding.student();
		MethodOverlaoding.student(22);
		MethodOverlaoding.student("ramesh");
		MethodOverlaoding.student("ramesh", 23);
		
	}
}
