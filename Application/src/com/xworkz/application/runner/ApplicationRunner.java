package com.xworkz.application.runner;

import com.xworkz.application.dto.ApplicationDto;
import com.xworkz.application.repository.ApplicationRepository;
import com.xworkz.application.repository.ApplicationRepositoryImplementation;
import com.xworkz.application.service.ApplicationService;
import com.xworkz.application.service.ApplicationServiceImplementation;

public class ApplicationRunner {
	
	public static void main(String[] args) {
		
		
		ApplicationDto dtos=new ApplicationDto();
		dtos.setApplicationId("ab");
		dtos.setContactNumber("");
		dtos.setEmail("rameshl@gmail.com");
		dtos.setModeOfExam("online");
		dtos.setPassword(0);
		System.out.println(dtos.toString());
		
		
		
		ApplicationRepository repository=new ApplicationRepositoryImplementation();
		
		ApplicationService service=new ApplicationServiceImplementation(repository);
		service.validateandsave(dtos);
	}

}
