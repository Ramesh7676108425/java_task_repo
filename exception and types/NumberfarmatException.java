package com.xworkz.ExceptionHandling.things;

public class NumberfarmatException {
	
	public static void main(String[] args) {
		
		System.out.println("");
		try {
			String str="hello";
			int number=Integer.parseInt(str);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
