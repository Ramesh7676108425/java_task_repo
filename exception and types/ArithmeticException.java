package com.xworkz.ExceptionHandling.things;

public class ArithmeticException {
	
	
	public static void main(String[] args) {
		
		System.out.println("this is arithmetic exception");
	
	try {
		int a=50/0;
		
	}catch(Exception e) {
		System.out.println(e);
	}

}
}
