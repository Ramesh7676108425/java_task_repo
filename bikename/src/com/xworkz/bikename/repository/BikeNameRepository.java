package com.xworkz.bikename.repository;

public interface BikeNameRepository {
	
	boolean onSave(String bikeName);
	
	String[] read();
	
	boolean update(String oldName,String newName);
	
	boolean delete(String bikeName);

}
