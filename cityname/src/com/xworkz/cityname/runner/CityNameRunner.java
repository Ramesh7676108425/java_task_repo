package com.xworkz.cityname.runner;

import com.xworkz.cityname.repository.CityNameRepository;
import com.xworkz.cityname.repository.CityNameRepositoryImplementation;
import com.xworkz.cityname.service.CityNameService;
import com.xworkz.cityname.service.CityNameServiceImplementation;

public class CityNameRunner {
	
	public static void main(String[] args) {
		
		CityNameRepository repository=new CityNameRepositoryImplementation();
		
		
		CityNameService service=new CityNameServiceImplementation(repository);
		
		service.validateandsave("banglore");
		service.validateandsave("mysore");
		service.validateandsave("kollegal");
		service.validateandsave("hanur");
		service.read();
		
		
		
		String oldName="banglore";
		String newName="dubai";
		
		
		service.update (oldName, newName);
		service.read();
		
	}

}
