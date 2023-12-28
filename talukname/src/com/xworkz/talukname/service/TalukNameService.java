package com.xworkz.talukname.service;

public interface TalukNameService {
	
	
	public boolean validateandsave(String talukName);
	
	
	public boolean isExist(String talukName);
	
	
	public boolean update(String oldName,String newName);
	
	void read();

}
