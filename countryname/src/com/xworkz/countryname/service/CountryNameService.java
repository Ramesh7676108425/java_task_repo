package com.xworkz.countryname.service;

public interface CountryNameService {
	
	boolean validateandsave(String countryName);
	
	boolean isExist(String countryName);
	
	boolean update(String oldName,String newName);
	void read();

}
