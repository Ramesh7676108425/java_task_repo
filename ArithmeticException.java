package things;

import java.rmi.AccessException;

public class ArithmeticException {
	
	public static void main(String[] args) {
		
		System.out.println("");
		
		try {
			int a=7/0;
		}
		catch(Exception e) {
		System.out.println(e);
			
		}
		
	}
	}
	


