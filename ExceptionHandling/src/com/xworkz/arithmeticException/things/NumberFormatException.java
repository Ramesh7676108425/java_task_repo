package com.xworkz.arithmeticException.things;

public class NumberFormatException {
	
	public static void main(String[] args) {
		
		System.out.println("this is  NumberFormatException");
		
		try {
			String str="hello";
			int number=Integer.parseInt(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
