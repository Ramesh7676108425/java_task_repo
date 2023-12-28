package com.xworkz.bikename.service;

import com.xworkz.bikename.repository.BikeNameRepository;

public class BikeNameServiceImplementation implements BikeNameService {
	private BikeNameRepository repository;
	public BikeNameServiceImplementation(BikeNameRepository repository) {
		this.repository=repository;
	}
	

	@Override
	public boolean validateandsave(String bikeName) {
		if(bikeName==null) {
			System.out.println("is null");
			return false;
		}else if(bikeName.isEmpty()) {
			System.out.println("is empty");
			return false;
		}else if(bikeName.isBlank()) {
			System.out.println("is null");
			return false;
		}else if(bikeName.length()>3&&bikeName.length()<20) {
			System.out.println("bike name");
			return false;
		}else {
			boolean exist=isExist(bikeName);
				if(exist!=true) {
					
				
			
			boolean save=repository.onSave(bikeName);
			if(save) {
				System.out.println("saved successfully");
				return true;
			}else {
				System.out.println("not saved successfully");
			}
		}
		
		return false;
	}
	}

	@Override
	public boolean isExist(String bikeName) {
		
		String[] bike=repository.read();
		if(bike!=null||bikeName!=null) {
			for(String name:bike) {
				if(name!=null) {
					
				
				if(name.equalsIgnoreCase(bikeName)) {
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
		if(oldName!=null||newName!=null) {
			System.out.println("");
			boolean oldvaluecheck=isExist(oldName);
			System.out.println("oldvalue is:"+oldName);
			if(oldvaluecheck) {
				System.out.println("old value is checked");
				boolean update=repository.update(oldName, newName);
				if(update) {
					System.out.println("updated successfully");
					return true;
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
		String[] bike=repository.read();
		for(String name:bike) {
			System.out.println("element is:"+name);	
		}
		
		
	}


	@Override
	public boolean delete(String bikeName) {
		if(bikeName!=null) {
			boolean delete=repository.delete(bikeName);
			System.out.println("deleted:"+delete);
			if(delete) {
				System.out.println("deleted successfully");
				return true;
			}else {
				System.out.println("not deleted");
			}
		}else {
			System.out.println("not present");
		}
		return false;
	}

}
