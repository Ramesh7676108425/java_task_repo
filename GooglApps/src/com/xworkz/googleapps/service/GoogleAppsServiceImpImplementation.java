package com.xworkz.googleapps.service;

import com.xworkz.googleapps.dto.GoogleAppsDto;
import com.xworkz.googleapps.repository.GoogleAppsRepository;

public class GoogleAppsServiceImpImplementation  implements GoogleAppsService {
	
	private GoogleAppsRepository repository;
	public GoogleAppsServiceImpImplementation(GoogleAppsRepository repository) {
		this.repository=repository;
	}
//	boolean validate =true;

	@Override
	public boolean validateandsave(GoogleAppsDto googleappsdto) {
		boolean validate =true;
		if(googleappsdto==null) {
			System.out.println("google apps dto is null");
			return false;
		}else {
			if(googleappsdto.getApplicationId().equals("null")) {
				System.out.println("equals to null");
				return false;
			}if(googleappsdto.getApplicationId().equals(null)) {
				System.out.println("null");
				return false;
			}if(googleappsdto.getApplicationId().length()<3&&googleappsdto.getApplicationId().length()>10) {
				System.out.println("");
				return false;
			}if(googleappsdto.getApplicationId().startsWith("G")) {
				System.out.println("apply proper id");
				return false;
			}
		}
		boolean save=repository.onSave(googleappsdto);
		System.out.println("save:"+save);
		
		return false;
	}


	@Override
	public void read() {
		
		GoogleAppsDto[] dtos=repository.read();
		for(GoogleAppsDto dto:dtos) {
			System.out.println(dto);
		}
	}
	

}
