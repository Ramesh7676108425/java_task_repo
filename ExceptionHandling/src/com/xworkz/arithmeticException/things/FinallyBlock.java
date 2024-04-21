package com.xworkz.arithmeticException.things;

public class FinallyBlock {
	
	public static void main(String[] args) {
		int a[]=new int[10];
		try {
			int a1[]=new int[8];
			a1[9]=10;
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			a[1]=10;
			System.out.println("a[1]:"+a[1]);
		}
	}

}
