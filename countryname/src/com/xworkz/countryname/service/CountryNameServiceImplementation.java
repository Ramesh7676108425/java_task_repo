package com.xworkz.countryname.service;

import com.xworkz.countryname.repository.CountryNameRepository;

public class CountryNameServiceImplementation implements CountryNameService {

	private CountryNameRepository repository;
	
	public CountryNameServiceImplementation(CountryNameRepository repository) {
		this.repository=repository;
	}
	
	
	@Override
	public boolean validateandsave(String countryName) {
		if(countryName==null) {
			System.out.println(" ");
			return false;
		}
		if(countryName.isEmpty()) {
			System.out.println("is empty");
			return false;
		}if(countryName.isBlank()) {
			System.out.println("is blank");
			return false;
		}if(countryName.length()>2&&countryName.length()>25) {
			System.out.println("");
			return false;
		}if(!countryName.contains("a")) {
			System.out.println("contains");
			return false;
		}
		else {
			
			boolean exist=isExist(countryName);
			if(exist!=true) {
			boolean save=repository.onSave(countryName);
				if(save) {
					System.out.println("saved successfully");
					return true;
				}
				else{
					System.out.println("not saved successfully");
					return false;
				}
			}
		
		}
		//return false;
		return false;
	}


	@Override
	public boolean isExist(String countryName) {
		
		String[] country=repository.read();
		if(countryName!=null&&country!=null) {
			for(String name:country) {
				if(name!=null) {
					if(name.equals(countryName)) {
						return true;
					}
				}
			}
		}
			return false;

}


	@Override
	public boolean update(String oldName, String newName) {
		System.out.println("update running");
		if(oldName!=null&&newName!=null) {
			System.out.println("null check");
			boolean oldnamecheck=isExist(oldName);
			System.out.println("isExist:"+oldName);
			if(oldnamecheck) {
				System.out.println("old value is checked");
				boolean update=repository.update(oldName, newName);
				if(update==true) {
					System.out.println("update successfull");
					return true;
				}else {
					System.out.println("not update successfully");
				}
					
				}else {
					System.out.println("not present");
				}
			}
		
		return false;
	}


	@Override
	public void read() {
		
	String[] countries=repository.read();
	for(String names:countries) {
		System.out.println("element is:"+names);
	}
	}
}