package com.xworkz.collection.service;

import com.xworkz.collection.dto.BarDto;
import com.xworkz.collection.repository.BarRepository;

public class BarServiceImplementation implements BarService {
	public BarRepository repository;
	
	public BarServiceImplementation(BarRepository repository) {
		
		this.repository = repository;
	}





	@Override
	public boolean validateandsave(BarDto barDto) {
		if(barDto!=null) {
			System.out.println("bardto is not null");
			boolean save=repository.onSave(barDto);
			if(repository.onSave(barDto)) {
				System.out.println("saved successfully");
				return true;
			}else {
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
