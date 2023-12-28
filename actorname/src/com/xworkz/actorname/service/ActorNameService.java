package com.xworkz.actorname.service;

public interface ActorNameService {
	
	
	boolean validateandsave(String actorName);
	
	boolean isExist(String actorName);
	
	boolean update(String oldName,String newName);
	
	void read();
	
	boolean delete(String actorName);

}
