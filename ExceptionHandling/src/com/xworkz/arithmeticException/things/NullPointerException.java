package com.xworkz.arithmeticException.things;

public class NullPointerException {
	
	public static void main(String[] args) {
		
		System.out.println("this is NullPointerException");
		
		try {
			String str=null;
			System.out.println(str.length());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
