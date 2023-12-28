package things;

public class ReversString {
	
	public static void main(String[] args) {
		
	String str="abcdef";
	String rst="";
	char ch;
	
	for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
		rst=ch+rst;
	}
	System.out.println("reverse string:"+rst);
}
}