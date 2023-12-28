package com.xworkz.arrays.things;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String x="abcdhhdh";
		
	//	int i=0,j=x.length()-1;
		
		
		
		String revs="";
		for(int i=0;i<x.length();i++) {
			
			revs=x.charAt(i)+revs;
		}
		System.out.println(revs);
		int l=0;
		int r=x.length()-1;
		while(l<r) {}
		
		
		
		
	}

}
