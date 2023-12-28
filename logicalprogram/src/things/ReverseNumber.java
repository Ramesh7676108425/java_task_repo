package things;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int res=0;
		int num=4321;
		
		while(num>0) {
			int  rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		System.out.println("res:"+res);
		
	}

}
