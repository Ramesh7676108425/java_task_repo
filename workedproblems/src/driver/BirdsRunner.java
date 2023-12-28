package driver;

import things.Birds;

public class BirdsRunner {
	
	public static void main(String[] args) {
		
		Birds b=new Birds();
		
		b.setAge(12);
		b.setName("peacock");
		b.setSpecies("xyz");
		System.out.println("age is:"+b.getAge());
		System.out.println("name is:"+b.getName());
		
	}

}
