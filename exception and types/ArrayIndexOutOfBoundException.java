package com.xworkz.ExceptionHandling.things;

public class ArrayIndexOutOfBoundException {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("this is ArrayIndexOutOfBoundException");
		
		try {
			int a[]=new int[6];
			a[7]=8;
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
