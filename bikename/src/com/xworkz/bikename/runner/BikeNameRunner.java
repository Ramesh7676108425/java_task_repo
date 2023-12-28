package com.xworkz.bikename.runner;

import com.xworkz.bikename.repository.BikeNameRepository;
import com.xworkz.bikename.repository.BikeNameRepositoryImplementation;
import com.xworkz.bikename.service.BikeNameService;
import com.xworkz.bikename.service.BikeNameServiceImplementation;

public class BikeNameRunner {
	
	public static void main(String[] args) {
		
		
		BikeNameRepository repository=new BikeNameRepositoryImplementation();
		
		BikeNameService service=new BikeNameServiceImplementation(repository);
		
		service.validateandsave("RX");
		service.validateandsave("KTM");
		//service.validateandsave("NS200");
		service.read();
		
		
		String oldName="RX";
		String newName="DUKE";
		
		
		service.update(oldName,newName);
		service.read();
		
		service.delete("DUKE");
		service.read();
		
		
		
		
	}

}
