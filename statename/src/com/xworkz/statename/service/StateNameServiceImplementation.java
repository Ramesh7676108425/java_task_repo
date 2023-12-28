package com.xworkz.statename.service;

import com.xworkz.statename.repository.StateNameRepository;

public class StateNameServiceImplementation  implements StateNameService{
	
	
	private StateNameRepository repository;
	
	public StateNameServiceImplementation(StateNameRepository repository ) {
		this.repository=repository;
	}

	@Override
	public boolean validateandsave(String stateName) {
		
		if(stateName.isEmpty()) {
			System.out.println("");
			return false;
		}if(stateName.isBlank()) {
			System.out.println("");
			return false;
		}if(stateName.length()<3&&stateName.length()<24) {
			System.out.println("");
			return false;
		}if(stateName==null) {
			System.out.println("");
		}else {
			boolean save= repository.onSave(stateName);
			if(save) {
				System.out.println("saved succsessfully");
			}else {
				System.out.println("not saved successfully");
			}
		}
		return false;
	}

	@Override
	public boolean isExist() {
	
			
			
		
		return false;
	}
	
	

}
