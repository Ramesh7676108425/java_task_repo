package com.xworkz.food.service;

import com.xworkz.food.repository.FoodRepository;

public class FoodServiceImplimentation implements FoodService {
	private FoodRepository repository;
	
	public FoodServiceImplimentation(FoodRepository repository ) {
		this.repository=repository;
	}

	@Override
	public boolean validateSave(String foodName) {
		if(foodName.isEmpty()||foodName.isBlank()||(foodName.length()
				<3&& foodName.length()>25)
				|| foodName==null) {
			System.out.println("give correct name");
		}else {
			boolean save=repository.onsave(foodName);
			if(save) {
				System.out.println("foodname added successfully");
				return true;
				
			}else {
				System.out.println("foodname is not added successfully");
				return false;
			}
		}
		return false;
	}

}
