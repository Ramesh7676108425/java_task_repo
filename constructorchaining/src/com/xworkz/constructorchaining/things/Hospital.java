package com.xworkz.constructorchaining.things;

public class Hospital {
	
	
	public String name;
	public int numberOfDoctors;
	public boolean isprivate;
	
	
	
	public Hospital() {
		System.out.println("default constructor");
	}
	
	public Hospital(String name) {
		this();
		System.out.println("name of hospital is:"+name);
		this.name=name;
	}
	
	public Hospital(String name,int numberOfDoctors) {
		//8this(String name);
		System.out.println("name of hospital is:"+name + " "+ "numberOfDoctors: "+numberOfDoctors);
		this.name=name;
		this.numberOfDoctors=numberOfDoctors;
	}

	public Hospital(String name, int numberOfDoctors, boolean isprivate) {
		System.out.println("name of hospital is:"+name + " "+ "numberOfDoctors: "+numberOfDoctors+" "+"isprivate: "+isprivate);
		this.name = name;
		this.numberOfDoctors = numberOfDoctors;
		this.isprivate = isprivate;
	}
	
	

}
