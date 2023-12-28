package com.xorkz.validation.service;

import com.xorkz.validation.dto.ExamApplication;

public class Service {
	
	public boolean ExamApplicationIdvalidate(ExamApplication dto) {
		if(dto.getApplicationId().isEmpty()) {
			
			System.out.println("empty:");
			return false;
		}
		else if(dto.getApplicationId().isBlank()) {
			return false;
		}
		else if(dto.getApplicationId().length()!=10) {
			System.out.println("it shoud be 10");
			return false;
		}
		else if(!dto.getApplicationId().startsWith("2024")) {
			System.out.println("starts with 2024");
			return false;
		}
		return true;
		
	}
public boolean emailvalidate(ExamApplication e) {
	if(e.getEmail().isBlank()) {
		return false;
	}
	else if(e.getEmail().isEmpty()) {
		return false;
	}
	else if (!(e.getEmail().length()<=30)&&(e.getEmail().length()>=2)){
		return false;
	}
	else if(e.getEmail().contains("@")) {
		return false;
	}
	return true;
}

public boolean contactNumbervalidate(ExamApplication s) {
	
	//if(s.getContactNumber().isEmpty()) {
		//return false;
	//}
	 if(s.getContactNumber().isBlank()) {
		
	}
	else if(s.getContactNumber().length()!=10) {
		return false;
	}
	else if(!s.getContactNumber().startsWith("9")) {
		return false;
	}
	return true;
}
}
