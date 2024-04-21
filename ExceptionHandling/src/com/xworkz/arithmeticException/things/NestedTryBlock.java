package com.xworkz.arithmeticException.things;

public class NestedTryBlock {
	
	public static void main(String[] args) {
		
		try {
			int a[]= {10,20,30,40,50,60,70};
			try {
				int b=a[3]/a[1];
			}catch(Exception e) {
				e.printStackTrace();
			}
			a[10]=30;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
