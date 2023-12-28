package com.xworkz.actressname.runner;

import com.xworkz.actressname.repository.ActressNameRepository;
import com.xworkz.actressname.repository.ActressNameRepositoryImplementation;
import com.xworkz.actressname.service.ActressNameService;
import com.xworkz.actressname.service.ActressNameServiceImplementation;

public class ActressNameRunner {
	
	
	public static void main(String[] args) {
		
		
		ActressNameRepository repository=new ActressNameRepositoryImplementation();
		
		ActressNameService service=new ActressNameServiceImplementation(repository);
		service.validateandsave("ashika");
		service.validateandsave("rakshitha");
		service.validateandsave("sush");
		service.validateandsave("ayesha");
		
	}

}
