package com.xworkz.softwarename.runner;

import com.xworkz.softwarename.repository.SoftwareNameRepository;
import com.xworkz.softwarename.repository.SoftwareNameRepositoryImplementation;
import com.xworkz.softwarename.service.SoftwareNameService;
import com.xworkz.softwarename.service.SoftwareNameServiceImplementation;

public class SoftwareNameRunner {
	
	public static void main(String[] args) {
		SoftwareNameRepository repository=new SoftwareNameRepositoryImplementation();
		
		SoftwareNameService service=new SoftwareNameServiceImplementation(repository);
		
		service.validateandsave("Oracle ");
		service.validateandsave("yya");
		
		
		
		String oldName="";
		String newName="";
		
		service.update( newName, oldName);
		
	}

}
