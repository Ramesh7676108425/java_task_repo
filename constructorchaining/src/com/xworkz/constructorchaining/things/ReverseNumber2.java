package com.xworkz.constructorchaining.things;

public class ReverseNumber2 {
	
	
public static void main(String[] args) {
	//	int num,res=0;rem
		int num= 2345;
		int res=0;
		
		while(num >0) {
			int rem=num%10;//2345%10=5
			res=res*10+rem;// (0*10)+5=5
			
			System.out.println("res:"+res);
			num=num/10;
			
		}
		
		if(num==res) {
			System.out.println("xyz");
		}
		else {
			System.out.println("abcd");
		}
		
		
	}

}


