package com.xworkz.actorname.runner;

import com.xworkz.actorname.repository.ActorNameRepository;
import com.xworkz.actorname.repository.ActorNameRepositoryImplementation;
import com.xworkz.actorname.service.ActorNameService;
import com.xworkz.actorname.service.ActorNameServiceImplementation;

public class ActorNameRunner {
	
	
	public static void main(String[] args) {
		
		ActorNameRepository repository=new ActorNameRepositoryImplementation();
		
		ActorNameService service=new ActorNameServiceImplementation(repository);
		service.validateandsave("appu");
		service.validateandsave("yuva");
		service.validateandsave("vinay");
		service.validateandsave("kiran");
		service.read();
		
		
		String oldName="appu";
		String newName="BOSS";
		
		service.update(oldName,newName);
		
		service.read();
		
		
		service.delete("BOSS");
		service.read();
		
	}
	

}
