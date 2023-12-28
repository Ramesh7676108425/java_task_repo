package com.xworkz.talukname.runner;

import com.xworkz.talukname.repository.TalukNameRepository;
import com.xworkz.talukname.repository.TalukNameRepositoryImplementation;
import com.xworkz.talukname.service.TalukNameService;
import com.xworkz.talukname.service.TalukNameServiceImplementation;

public class TalukNameRunner {
	
	
	public static void main(String[] args) {
		
		
		TalukNameRepository repository=new TalukNameRepositoryImplementation();
		
		TalukNameService service=new TalukNameServiceImplementation(repository);
		
		service.validateandsave("kollegal");
		service.validateandsave("mysore");
		service.validateandsave("hanur");
		service.validateandsave("nagara");
		service.validateandsave("nagara2");
		service.read();
		
		
		
		String oldName="kollegal";
		String newName="dubai";
		
		service.update( oldName, newName );
		service.read();
		
	}

}
