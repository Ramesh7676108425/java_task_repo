package com.xworkz.actressname.service;

import com.xworkz.actressname.repository.ActressNameRepository;

public class ActressNameServiceImplementation implements ActressNameService {
	private ActressNameRepository repository;
	public ActressNameServiceImplementation(ActressNameRepository repository ) {
		this.repository=repository;
	}
	
	
	
	
	@Override
	public boolean validateandsave(String actressName) {
		
		if(actressName==null) {
			System.out.println("actress name is null");
			return false;
		}else if(actressName.isEmpty()) {
			System.out.println("is empty");
			return false;
		}else if(actressName.isBlank()) {
			System.out.println("is blank");
		}else if(actressName.length()<2&&actressName.length()>10) {
			System.out.println("array length");
		}else {
			boolean save=repository.onSave(actressName);
			if(save) {
				System.out.println("saved successfully");
			}else {
				System.out.println("not saved successfully");
			}
		}
		return false;
	}

}
