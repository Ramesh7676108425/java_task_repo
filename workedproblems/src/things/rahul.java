package things;

public class rahul {
	
	public static void main(String[] args) {
		
		String str="rahul";
		String rev="";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			rev=ch+rev;		
		}
		System.out.println("reverse string is:"+rev);
		
	}

}
