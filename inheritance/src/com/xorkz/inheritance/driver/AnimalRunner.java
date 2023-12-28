package com.xorkz.inheritance.driver;

import com.xworkz.inheritance.things.Animal;

public class AnimalRunner {
	
	public static void main(String[] args) {
		
		Animal dog=new Animal();
		
		dog.setName("puppy");
		dog.setAge(12);
		
		
		String name=dog.getName();
		int age =dog.getAge();
		
		
	}

}
