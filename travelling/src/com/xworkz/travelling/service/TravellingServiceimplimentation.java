package com.xworkz.travelling.service;

import com.xworkz.travelling.repository.TravellingRepository;

public class TravellingServiceimplimentation implements TravellingService {
private TravellingRepository repository;

public TravellingServiceimplimentation(TravellingRepository  repository) {
	this.repository=repository;
}
	@Override
	public boolean validateSave(String placeName) {
		
		if(placeName.isEmpty()||placeName.isBlank()) {
			System.out.println("placename is empty and blank");
			return false;
			
		}if(placeName.length()>3&&placeName.length()>25) {
			return false;
		} if(placeName==null) {
			System.out.println("placename is null");
			return false;
		}else {
			boolean save=repository.onSave(placeName);
			if(save) {
				System.out.println("placename added successfully");
				return true;
				
			}else {
				System.out.println("placename is not added successfully");
				return false;
		}
		
	}

	}
}

