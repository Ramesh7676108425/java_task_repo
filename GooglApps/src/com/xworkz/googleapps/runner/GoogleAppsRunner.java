package com.xworkz.googleapps.runner;

import com.xworkz.googleapps.dto.GoogleAppsDto;
import com.xworkz.googleapps.repository.GoogleAppsRepository;
import com.xworkz.googleapps.repository.GoogleAppsRepositoryImplementation;
import com.xworkz.googleapps.service.GoogleAppsService;
import com.xworkz.googleapps.service.GoogleAppsServiceImpImplementation;

public class GoogleAppsRunner {
	
	
	public static void main(String[] args) {
		
		GoogleAppsDto dtos=new GoogleAppsDto();
		dtos.setApplicationCost(0);
		dtos.setApplicationId("G002");
		dtos.setApplicationName("gmail");
		dtos.setApplicationStorage(35);
		dtos.setApplicationVersion("G1");
		System.out.println(dtos.toString());
		
		GoogleAppsRepository repository=new GoogleAppsRepositoryImplementation();
		GoogleAppsService service=new GoogleAppsServiceImpImplementation(repository);
		service.validateandsave(dtos);
		
	}

}
