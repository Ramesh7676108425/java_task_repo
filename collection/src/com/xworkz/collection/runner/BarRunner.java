package com.xworkz.collection.runner;

import com.xworkz.collection.dto.BarDto;
import com.xworkz.collection.repository.BarRepository;
import com.xworkz.collection.repository.BarRepositoryImplementation;
import com.xworkz.collection.service.BarService;
import com.xworkz.collection.service.BarServiceImplementation;

public class BarRunner {
	
	
	public static void main(String[] args) {
		
		
		BarDto dto=new BarDto();
		dto.setBrandANme("black&white");
		dto.setLocation("kollegal");
		dto.setNumberofbrands(20);
		dto.setPrice(2800);
		dto.setAmbiance("attractive");
		System.out.println(dto.toString());
		
		BarRepository repository=new BarRepositoryImplementation();
		
		BarService service=new BarServiceImplementation(repository);
		
		service.validateandsave(dto);
		service.read();
	}

}
