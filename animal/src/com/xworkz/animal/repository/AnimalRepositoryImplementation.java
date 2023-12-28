package com.xworkz.animal.repository;

public class AnimalRepositoryImplementation implements AnimalRepository {
 private  String[] animal=new String[4];
 int index=0;
 
	@Override
	public boolean onSave(String animalName) {
		if(animal==null||index>=animal.length) {
			System.out.println("array is null and index is greter than the given value");
		}
		else{
			if(index<animal.length) {
				animal[index]=animalName;
				index++;
				return true;
			
		}
		}
		
		return false;
	}

	@Override
	public String[] read() {
		// TODO Auto-generated method stub
		return animal;
	}

}
