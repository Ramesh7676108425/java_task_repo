package com.xworkz.statename.runner;

import com.xworkz.statename.repository.StateNameRepository;
import com.xworkz.statename.repository.StateNameRepositoryImplementation;
import com.xworkz.statename.service.StateNameService;
import com.xworkz.statename.service.StateNameServiceImplementation;

public class StateNameRunner {
	
	
	public static void main(String[] args) {
		
		StateNameRepository repository =new StateNameRepositoryImplementation();
		
		StateNameService service=new StateNameServiceImplementation(repository);
		service.validateandsave("karnataka");
		service.validateandsave("kerala");
		service.validateandsave("ap");
		
		
	}

}
