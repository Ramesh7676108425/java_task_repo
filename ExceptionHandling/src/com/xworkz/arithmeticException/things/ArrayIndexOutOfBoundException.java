package com.xworkz.arithmeticException.things;

public class ArrayIndexOutOfBoundException {
	
	public static void main(String[] args) {
		
		System.out.println("this is  ArrayIndexOutOfBoundException ");
		
		try {
			int a[]=new int [6];
			a[7]=70;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
