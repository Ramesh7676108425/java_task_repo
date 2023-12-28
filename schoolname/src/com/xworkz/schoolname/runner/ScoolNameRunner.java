package com.xworkz.schoolname.runner;

import com.xworkz.schoolname.repository.SchoolNameRepository;
import com.xworkz.schoolname.repository.SchoolNameRepositoryImplementation;

import scom.xworkz.schoolname.service.SchoolNameService;
import scom.xworkz.schoolname.service.SchoolNameServiceImplementation;

public class ScoolNameRunner {
	
	public static void main(String[] args) {
		
		SchoolNameRepository repository=new SchoolNameRepositoryImplementation();
		
		SchoolNameService service=new SchoolNameServiceImplementation(repository);
		
		service.validateandsaveS("SDA");
		service.validateandsaveS("vasavi");
		service.read();
		
		
		
		String oldName="SDA";
		String newName="ramesh";
		
		service.update(oldName,newName);
		
		service.read();
		service.delete("ramesh");
		service.read();
		
		
	}

}
