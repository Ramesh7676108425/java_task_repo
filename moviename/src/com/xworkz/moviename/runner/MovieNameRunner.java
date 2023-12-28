package com.xworkz.moviename.runner;

import com.xworkz.moviename.repository.MovieNameRepository;
import com.xworkz.moviename.repository.MovieNameRepositoryImplementation;
import com.xworkz.moviename.service.MovieNameService;
import com.xworkz.moviename.service.MovieNameServiceImplementation;

public class MovieNameRunner {
	
	public static void main(String[] args) {
		
		MovieNameRepository repository=new MovieNameRepositoryImplementation();
		
		MovieNameService service=new MovieNameServiceImplementation(repository);
		
		service.validateandsave("rrr");
		service.validateandsave("milana");
		service.validateandsave("animal");
		
	}

}
