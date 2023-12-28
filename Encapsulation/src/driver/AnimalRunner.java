package driver;

import things.Animal;

public class AnimalRunner {
	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.setName("elephant");
		a.setAge(35);
		System.out.println("name is:"+a.getName());
		System.out.println("age is:"+a.getAge());
		
		
		
	}

}
