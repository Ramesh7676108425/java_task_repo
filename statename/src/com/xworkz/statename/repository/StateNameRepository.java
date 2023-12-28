package com.xworkz.statename.repository;

public interface StateNameRepository {
	
	boolean onSave(String stateName);
	
	String[] read();

}
