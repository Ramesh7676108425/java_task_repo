package com.xworkz.talukname.repository;

public interface TalukNameRepository {
	
	
	boolean onSave(String talukName);
	
	
	String[] read();
	
	boolean update(String oldName,String newName);

}
