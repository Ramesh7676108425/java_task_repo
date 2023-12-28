package things;

public class PalindromeNumber {
	
	
	public static void main(String[] args) {
		
	int rem,temp,sum=0;
	
	int num=151;
	temp=num;
	
	while(num>0) {
		rem=num%10;
		sum=sum*10+rem;
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
		
	}

}
