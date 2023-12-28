package com.xworkz.implementation;

import com.xworkz.abstracts.Life;

public class Human extends Life {

	@Override
	public void name() {
		System.out.println("this is human method");
		
	}

	@Override
	public int familyMembers() {
		System.out.println("family membrs are 20");
		return 0;
	}

	@Override
	public int friends() {
		System.out.println("30");
		return 30;
	}

	@Override
	public int age() {
		System.out.println("22");
		return 22;
	}

	@Override
	public void communication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metabolism() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void growth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adpaptation() {
		// TODO Auto-generated method stub
		
	}

}
