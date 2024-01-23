package com.xworkz.Malpe.service;

import com.xworkz.Malpe.dto.MalpeDto;
import com.xworkz.Malpe.repository.MalpeRepository;

public class MalpeServiceImpl  implements MalpeService{
	public MalpeRepository repository;
	
	public  MalpeServiceImpl(MalpeRepository  repository) {
		this.repository=repository;
		
	}

	@Override
	public boolean validateandSave(MalpeDto malpeDto) {
		if(malpeDto!=null) {
			System.out.println("malpedto is not null");
			
		//	boolean onSave=repository.onSave(malpeDto);
			if(repository.onSave(malpeDto)) {
				System.out.println("saved successfully");
				return true;
			
		}else 
		{
			System.out.println("not saved successfully");
			return false;
		}
		
	}else {
		System.out.println("dto is null");
	}
	return false;
}

	@Override
	public void read() {
System.out.println("reading the service dto");		
	}

}
