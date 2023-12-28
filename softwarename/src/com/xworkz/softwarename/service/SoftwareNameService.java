package com.xworkz.softwarename.service;

public interface SoftwareNameService {
	
	boolean validateandsave(String softwareName);
	
	boolean isExist(String  softwareName );
	
	boolean update(String oldName,String newName);

}
