package com.xworkz.polymorphism.driver;

import com.xworkz.polymorphism.things.Method;

public class MethodRunner {
	
	
	public static void main(String[] args) {
		
		Method.student("elephant");
		Method.Student();
		Method.student(23);
		Method.student("elephant", 23);
		
	}

}
