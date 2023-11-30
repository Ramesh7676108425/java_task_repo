package com.xworkz.arrays.things;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String x="abcdhhdh";
		
		int i=0,j=x.length()-1;
		
		
		
		String revs=" ";
		for(int i1=0;i1<x.length();i1++) {
			revs=x.charAt(i1)+revs;
		}
		System.out.println(revs);
		
		
	}

}
