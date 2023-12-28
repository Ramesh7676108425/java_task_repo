package com.xworkz.constructorchaining.things;

public class ReverseString {
	
	

	public static void main(String[] args) {
		
		String x="ABCDE";
		
		int i=0,j=x.length()-1;
		
		
		
		String revs=" ";
		for(int i2=0;i2<x.length();i2++) {
			
			revs=x.charAt(i2)+revs;
		}
		System.out.println(revs);
		
		
	}

}


