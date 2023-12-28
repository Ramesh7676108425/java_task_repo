package things;

public class palindrome {
	
	public static void main(String[] args) {
		
		int sum=0,rem,temp;
		
		int num=151;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

}
