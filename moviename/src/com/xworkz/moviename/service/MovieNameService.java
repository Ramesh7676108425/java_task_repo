package com.xworkz.moviename.service;

public interface MovieNameService {
	
	boolean validateandsave(String movieName);
	
	boolean isExist(String movieName);

}
