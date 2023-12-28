package com.xworkz.food.runner;

import com.xworkz.food.repository.FoodRepository;
import com.xworkz.food.repository.FoodRepositoryImplimentation;
import com.xworkz.food.service.FoodService;
import com.xworkz.food.service.FoodServiceImplimentation;

public class FoodRunner {
	
	public static void main(String[] args) {
		
		FoodRepository repository=new FoodRepositoryImplimentation();
		FoodService service=new FoodServiceImplimentation(repository);
		service.validateSave("biriyani");
		service.validateSave("veg palav");
				
		
	}

}
