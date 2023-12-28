package com.xworkz.actorname.repository;

public interface ActorNameRepository {
	
	
	boolean onSave(String actorName);
	
	String[] read();
	
	boolean update(String actorName);
	
	boolean delete(String actorName);

}
