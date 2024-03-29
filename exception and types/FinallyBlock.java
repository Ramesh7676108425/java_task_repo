package com.xworkz.ExceptionHandling.things;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		int a[]=new int[8];
	
	try {
		System.out.println("a[9]:"+a[9]);
	
		
		
	}catch(Exception e) {
		System.out.println(e);
	}
	finally {
		a[3]=4;
		System.out.println(a[3]);
	}
	System.out.println("end of program");

}
}
