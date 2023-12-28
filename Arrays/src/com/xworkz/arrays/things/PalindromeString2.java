package com.xworkz.arrays.things;

public class PalindromeString2 {
	
	public static void main(String[] args) {
		
		String sr="eye";
		int i=0;int j = sr.length()-1;
		

		String revs=" ";
		for(int i1=0;i1<sr.length();i1++) {
			revs=sr.charAt(i1)+revs;
		}
		System.out.println(revs);
		
		
	}



		
	}


