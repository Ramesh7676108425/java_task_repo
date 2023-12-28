package com.xworkz.moviename.service;

import com.xworkz.moviename.repository.MovieNameRepository;

public class MovieNameServiceImplementation implements MovieNameService {
	
private	MovieNameRepository repository;

public MovieNameServiceImplementation(MovieNameRepository repository ) {
	this.repository=repository;
}

	@Override
	public boolean validateandsave(String movieName) {
		if(movieName==null) {
			System.out.println("");
			return false;
		}
		if(movieName.isEmpty()) {
			System.out.println("");
			return false;
		}
		if(movieName.isEmpty()) {
			System.out.println("");
			return false;
		}if(movieName.length()<2&&movieName.length()>25) {
			System.out.println("");
			return false;
		} 
		else {
			
	//		boolean exist=isexist(movieName);
		//	if(exist!=true) {
			boolean save=repository.onSave(movieName);
				if(save) {
					System.out.println("saved successfully");
					
				}
				else {
					System.out.println("not saved successfully");
				}
			}
		
		return false;
	}

	@Override
	public boolean isExist(String movieName) {
	String[] movie=repository.read();
	if(movieName!=null&&movie!=null) {
		for(String name:movie) {
			if(name!=null) {
				if(name.equals(movieName)) {
					return true;
				}
			}
		}
	}
		
		return false;
	}

}
