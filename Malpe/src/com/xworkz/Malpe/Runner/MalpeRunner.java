package com.xworkz.Malpe.Runner;

import com.xworkz.Malpe.dto.MalpeDto;
import com.xworkz.Malpe.repository.MalpeRepository;
import com.xworkz.Malpe.repository.MalpeRepositoryImpl;
import com.xworkz.Malpe.service.MalpeService;
import com.xworkz.Malpe.service.MalpeServiceImpl;

public class MalpeRunner {
	
	
	public static void main(String[] args) {
		
		
		
		MalpeDto dto=new MalpeDto();
		
		dto.setLocation("udupi");
		dto.setName("xyz");
		dto.setNumberofboats(15);
		dto.setNumberOffish(300);
		System.out.println(dto.toString());
		
		
		MalpeRepository repository=new MalpeRepositoryImpl();
		
		MalpeService service =new MalpeServiceImpl(repository);
		
		service.validateandSave(dto);
		service.read();
		
		
		
		
		
		
	}

}
