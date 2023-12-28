package com.xworkz.schoolname.repository;

public interface SchoolNameRepository {
	
	public boolean onSave(String schoolName);

	
	String[] read();
	
	boolean update(String newName,String oldName);
	
	boolean delete(String schoolName);
}
