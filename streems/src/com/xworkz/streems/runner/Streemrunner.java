package com.xworkz.streems.runner;

import com.xworkz.streems.repository.StreemRepository;
import com.xworkz.streems.repository.StreemRepositoryImplimentation;
import com.xworkz.streems.service.StreemService;
import com.xworkz.streems.service.StreemServiceImplimentation;

public class Streemrunner {
	
	public static void main(String[] args) {
		StreemRepository repository=new StreemRepositoryImplimentation();
		StreemService service=new StreemServiceImplimentation(repository);
		service.validateSave("ECE");
		service.validateSave("civil");
		service.validateSave("ISE");
		repository.read();
	}

}
