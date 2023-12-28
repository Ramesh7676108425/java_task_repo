package com.xworkz.animal.service;

import com.xworkz.animal.repository.AnimalRepository;

public class AnimalServiceImplementation implements AnimalService {
	
	private AnimalRepository repository;
	
	public AnimalServiceImplementation(AnimalRepository  repository) {
		this.repository=repository;
	}
	@Override
public boolean validateandsave(String animalName) {
		
		if(animalName.isEmpty()) {
			System.out.println(" ");
			return false;
		} if(animalName.isBlank()) {
			System.out.println();
			return false;
		} if(animalName==null) {
			System.out.println("");
			return false;
		}if(animalName.length()<3&&animalName.length()>25) {
			System.out.println("");
		}else {
			boolean save=repository.onSave(animalName);
				if(save) {
					System.out.println("animal name is saved successufully");
					return true;
				}	else {
						System.out.println("animal name is not saved successufull");
						return false;
				
		}
				
		}
	
		
					
				

			
		
		
		
		return false;
	}
	@Override
	public boolean isExist(String animalName) {
		String[] streem=repository.read();
		if(animalName!=null&&streem!=null) {
			for(String  name:streem) {
				if(name!=null) {
					if(name.equals(animalName)) {
					return true;}
				}
			}
				
		
		}
		return false;
	}


}
