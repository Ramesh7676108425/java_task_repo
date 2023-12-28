package com.xworkz.polymorphism.things;

public class MethodOverlaoding {
	
	public static void student() {
		System.out.println("welcome to xworkz");
	}
	
	public static void student(String name) {
		System.out.println("student name is :"+name);
	}
	
	public static void student(int age) {
		System.out.println("studnet age is :"+age);
	}
	public static void student(String name,int age) {
		
		System.out.println("student name is :"+name+ " "+ "Student age is :"+age);
}
}
