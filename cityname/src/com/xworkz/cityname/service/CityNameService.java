package com.xworkz.cityname.service;

public interface CityNameService {
	
	
	public boolean validateandsave(String cityName);
	
	
	
	public boolean isExist(String cityName);
	
	
	boolean update(String oldName,String newName);
	
	void read();

}
