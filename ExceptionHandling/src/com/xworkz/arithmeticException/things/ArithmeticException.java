package com.xworkz.arithmeticException.things;

public class ArithmeticException {
	public static void main(String[] args) {
		
		System.out.println("this is  ArithmeticException ");
		
		
		try {
			int a=50/0;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
