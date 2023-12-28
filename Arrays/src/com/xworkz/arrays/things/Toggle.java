package com.xworkz.arrays.things;

public class Toggle {
	
	public static void main(String[] args) {
		
		String s="ramesh";
		String s1="";
		
		
		for (int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				int value=(int)s.charAt(i)+32;
				s1=s1+(char)value;
			}
			else {
				int value=((int)s.charAt(i))-32;
				s1=s1+(char) value;
				
			}
		}
		System.out.println("toggle String is:"+ s1);
		
	}

}
