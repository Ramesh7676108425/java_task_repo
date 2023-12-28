package com.xworkz.softwarename.service;

import com.xworkz.softwarename.repository.SoftwareNameRepository;

public class SoftwareNameServiceImplementation implements SoftwareNameService {
	
	private SoftwareNameRepository repository;//association
	
	public SoftwareNameServiceImplementation(SoftwareNameRepository  repository) {
		this.repository=repository;
	}

	@Override
	public boolean validateandsave(String softwareName) {
		if(softwareName==null) {
			System.out.println("");
			return false;
		}
		if(softwareName.isEmpty()) {
			System.out.println(" is empty");
			return false;
		}if(softwareName.isBlank()) {
			System.out.println("");
			return false;
		} if(softwareName.length()<2&&softwareName.length()>20){
			System.out.println(" ");
			return false;
		}if(!(softwareName.contains("a"))) {
			System.out.println("software Name must contains 'a' character");
			return false;
			}
		else{
			
			boolean exist=isExist(softwareName);
			if(exist!=true) {
				boolean save=repository.onSave(softwareName);
				if(save) {
					System.out.println("saved successfully");
					return true;
				}else {
					System.out.println("not saved successfully");
					return false;
				}
			} else {
				System.out.println("software name is already exists");
			}
				
			
			
		}
		return false;
		
		
	}

	@Override
	public boolean isExist(String softwareName) {
		
		String[] name=repository.read();
		if(name!=null&&softwareName!=null) {
			for(String name1:name) {
				if(name1!=null) {
					if(name1.equals(softwareName)) {
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
		if(oldName!=null&&newName!=null) {
			System.out.println("null check");
			boolean oldvaluecheck=isExist(oldName);
			System.out.println("is exist:"+oldName);
			if(oldvaluecheck) {
				System.out.println("oldvalue check is done");
				boolean update=repository.update(oldName, newName);
				if(update==true) {
					System.out.println("update successfully");
				}
			}else{
				System.out.println("not update successfully");
				
			}
		}else {
			System.out.println("not present");
		}
		return false;
	}

}
