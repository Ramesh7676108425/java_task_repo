package com.xworkz.animal.runner;

import com.xworkz.animal.repository.AnimalRepository;
import com.xworkz.animal.repository.AnimalRepositoryImplementation;
import com.xworkz.animal.service.AnimalService;
import com.xworkz.animal.service.AnimalServiceImplementation;

public class AnimalRunner {
	
	public static void main(String[] args) {
		
		
		AnimalRepository repository=new AnimalRepositoryImplementation();
		AnimalService service=new AnimalServiceImplementation(repository);
		service.validateandsave("dog");
		service.validateandsave("elephant");
		service.validateandsave("tiger");
		repository.read();
		
	}

}
