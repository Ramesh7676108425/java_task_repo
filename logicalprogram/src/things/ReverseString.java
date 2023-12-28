package things;
//builtin method


public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="RAHUL";
		String rev="";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println("revs:"+rev);
	}

}
