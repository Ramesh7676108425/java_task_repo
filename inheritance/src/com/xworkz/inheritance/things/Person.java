package com.xworkz.inheritance.things;

public class Person extends Dancer {
	
public	Person() {
	super("rrr","hihio",222);
	System.out.println(super.getName());
	System.out.println(super.getPlace());
	System.out.println(super.getSalary());
	
}

}
