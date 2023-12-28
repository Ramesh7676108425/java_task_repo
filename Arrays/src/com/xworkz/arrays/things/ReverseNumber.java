package com.xworkz.arrays.things;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int num= 1234;
		int res=0; 
		
		while(num !=0) {
			int rem=num%10;
			res=res*10+rem;
			
			System.out.println("res:"+res);
			num=num/10;
			
		}
		
		if(num==res) {
			System.out.println("rrtybjbd");
		}
		else {
			System.out.println("ajhgdugd");
		}
		
		
	}

}
