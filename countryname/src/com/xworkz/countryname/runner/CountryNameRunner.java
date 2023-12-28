package com.xworkz.countryname.runner;

import com.xworkz.countryname.repository.CountryNameRepository;
import com.xworkz.countryname.repository.CountryNameRepositoryImplementation;
import com.xworkz.countryname.service.CountryNameService;
import com.xworkz.countryname.service.CountryNameServiceImplementation;

public class CountryNameRunner {
	
	public static void main(String[] args) {
		
		CountryNameRepository repository=new CountryNameRepositoryImplementation();
	
		CountryNameService service=new CountryNameServiceImplementation(repository);
		service.validateandsave("india");
		service.validateandsave("nz");
		service.read();
		String oldName="india";
		String newName="dubai";
		service.update( oldName, newName);
		
	}
	
	

}
