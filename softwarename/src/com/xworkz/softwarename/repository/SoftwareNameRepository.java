package com.xworkz.softwarename.repository;

public interface SoftwareNameRepository {
	
	boolean onSave(String softwareName);
	
	String[] read();
	
	boolean update(String oldName,String newName);
	
	

}
