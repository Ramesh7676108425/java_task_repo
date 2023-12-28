package com.xworkz.inheritance.things;

public class Dancer {
	
	private String name;
	private String place;
	private int salary;
	
	public Dancer() {
		System.out.println("default constructor");
	}

	public Dancer(String name, String place, int salary) {
		super();
		this.name = name;
		this.place = place;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
