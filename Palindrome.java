package com.xworkz.arrays.things;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int rem,temp,sum=0;
		int num=151;
		temp=num;
		while(num>0) {
			rem=num%10;          //151%10=1  //15%10=5,//1%10=1
			sum=(sum*10)+rem;     //(0*10)+1=1  //(1*10)+5=15,//(15*10)+1=151
			num=num/10;     //151/10=15//15/10=1,1/10=0
		}
		if(temp==sum) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("given number is not palindrome");
		}
		
	}

}
