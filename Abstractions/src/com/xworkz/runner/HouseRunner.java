package com.xworkz.runner;

import com.xworkz.abstracts.House;
import com.xworkz.implementation.People;

public class HouseRunner {
	
	public static void main(String[] args) {
		
		House house=new People();
		
		house.housetype();
		house.houseDesign();
		house.numberOfpeople();
		house.numberOfRooms();
		
	}

}
