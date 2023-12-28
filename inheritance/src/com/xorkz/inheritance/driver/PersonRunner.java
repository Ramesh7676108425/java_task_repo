package com.xorkz.inheritance.driver;

import com.xworkz.inheritance.things.Person;

public class PersonRunner {
	
	public static void main(String[] args) {
		
		Person dancer= new Person();
		
		dancer.setName("fuyu");
		dancer.setPlace("hih");
		dancer.setSalary(67575);
		
		String name=dancer.getName();
		System.out.println("name is:"+name);
		
		String place =dancer.getPlace();
		System.out.println("place is :"+place);
		
		int salary=dancer.getSalary();
		System.out.println("salary is :"+salary);
		
	}

}
