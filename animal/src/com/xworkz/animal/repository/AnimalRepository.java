package com.xworkz.animal.repository;

public interface AnimalRepository {
	
	boolean onSave(String animalName);
	String[] read();

}
