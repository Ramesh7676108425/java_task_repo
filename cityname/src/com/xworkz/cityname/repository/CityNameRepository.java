package com.xworkz.cityname.repository;

public interface CityNameRepository {
	
	
	public boolean onSave(String cityName);
	
	
	String[] read();
	
	boolean update(String oldName,String newName);

}
