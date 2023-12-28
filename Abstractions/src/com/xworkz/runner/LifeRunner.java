package com.xworkz.runner;

import com.xworkz.abstracts.Life;
import com.xworkz.implementation.Human;

public class LifeRunner {
	
	public static void main(String[] args) {
		
		Life life=new Human();
		
		life.age();
		life.communication();
		life.familyMembers();
		life.friends();
		life.name();
		
	}

}
