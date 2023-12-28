package com.xworkz.bikename.service;

public interface BikeNameService {
	
	boolean validateandsave(String bikeName);
	
	
	boolean isExist(String bikeName);
	
	boolean update(String oldName,String newName);
	
	void read();
	boolean delete(String bikeName);

}
