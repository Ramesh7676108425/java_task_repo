package com.xworkz.food.repository;

public class FoodRepositoryImplimentation implements FoodRepository {
	
	private String[] food=new String[4];
	private int index=0;

	@Override
	public boolean onsave(String foodName) {
		if(food==null||index>=food.length) {
			System.out.println("array is null and index is grater than given value");
		}
		
		
		else {
			if(index<food.length) {
				food[index]=foodName;
				index++;
				return true;
			}
		}
		return false;
	}

}
