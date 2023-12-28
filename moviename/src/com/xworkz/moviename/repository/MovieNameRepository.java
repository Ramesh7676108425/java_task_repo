package com.xworkz.moviename.repository;

public interface MovieNameRepository {
	
	
	boolean onSave(String moviename);
	
	String[]  read();

}
