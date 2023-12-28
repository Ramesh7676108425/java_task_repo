package com.xworkz.countryname.repository;

public interface CountryNameRepository {
	
	
	boolean onSave(String countryname);
	
	String[] read();
	
	boolean update(String oldName,String newName);

}
