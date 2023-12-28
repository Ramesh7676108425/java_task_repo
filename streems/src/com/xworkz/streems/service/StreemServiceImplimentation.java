package com.xworkz.streems.service;

import com.xworkz.streems.repository.StreemRepository;

public class StreemServiceImplimentation implements StreemService {
                   private StreemRepository repository;
                   
     public  StreemServiceImplimentation(StreemRepository repository) {
    	 this.repository=repository;
     }
                   
	@Override
	public boolean validateSave(String streemName) {
		if(streemName.isEmpty()||streemName.isBlank()||
				(streemName.length()<3&&streemName.length()>25)||
				streemName==null) {
			System.out.println("give correct name");
		}else {
			boolean exist=isexist(streemName);
			if(exist!=true) {
				
		boolean	save=repository.onsave(streemName);
		if(save) {
			System.out.println("streemname added successfullly");
			return true;
		}else {
			System.out.println("streemname is not added successfully");
			return false;
		}
		}else {
			System.out.println("stream name is already exist");
			//return false;
		}
		}
			
		return false;
	}

	@Override
	public boolean isexist(String streemName) {
		String[] streem=repository.read();
		if(streemName!=null&&streem!=null) {
			for(String  name:streem) {
				if(name!=null) {
					if(name.equals(streemName)) {
					return true;}
				}
			}
				
		
		}
		return false;
	}

}
