package com.xworkz.cityname.service;

import com.xworkz.cityname.repository.CityNameRepository;

public class CityNameServiceImplementation implements CityNameService {

	private CityNameRepository repository;
	
	public CityNameServiceImplementation (CityNameRepository repository) {
		this.repository=repository;
	}
	
	
	@Override
	public boolean validateandsave(String cityName) {
		if(cityName!=null) {
			System.out.println("null");
		}if(cityName.isEmpty()) {
			System.out.println("is empty");
		}if(cityName.isBlank()) {
			System.out.println("is balnk");
		}if(cityName.length()>2&&cityName.length()<20) {
			System.out.println("");
		}else {
			System.out.println("validate city name");
		}
			boolean exist=isExist(cityName);
			if(exist!=true) {
				
			}
			boolean save=repository.onSave(cityName);
			if(save) {
				System.out.println("successfully saved");
			}else {
				System.out.println("not successfully saved");
			}
		}
		return false;
	}


	@Override
	public boolean isExist(String cityName) {
		
		String[] city=repository.read();
		if(cityName!=null&&city!=null) {
			for(String name:city) {
				if(name!=null) {
					if(name.equals(cityName)) {
						return true;
					}
				}
			}
		}
		return false;
	}


	@Override
	public boolean update(String oldName, String newName) {
		System.out.println("update is running");
		if(oldName!=null&& newName!=null) {
			boolean oldnamecheck=isExist(oldName);
			System.out.println("old value:"+oldName);
			if(oldnamecheck) {
				System.out.println("oldname check is done");
				boolean update=repository.update(oldName, newName);
				if(update==true) {
					System.out.println("update successfully");
				}else {
					System.out.println("not updated successfully");
				}
			}else {
				System.out.println("not present");
			}
			}
		
		return false;
	}


	@Override
	public void read() {
	

		String[] city=repository.read();
		for(String names:city) {
			System.out.println("element is:"+names);
		
	}
		
	}

	}
	}
