package com.xworkz.runner;

import com.xworkz.abstracts.Buildings;
import com.xworkz.implementation.SchollBuilding;

public class BuildingsRunner {
	
	public static void main(String[] args) {
		
		
		Buildings xyz=new SchollBuilding();
		System.out.println("xyz.cement()");
		xyz.pillers();
		xyz.rod();
		xyz.design();
		xyz.floars();
	}

}
