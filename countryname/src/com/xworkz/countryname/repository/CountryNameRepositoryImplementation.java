package com.xworkz.countryname.repository;

public class CountryNameRepositoryImplementation implements CountryNameRepository {

	
	private String[] country=new String[4];
	private int index=0;
	@Override
	public boolean onSave(String countryname) {
		
		if(country==null||index>=country.length) {
			System.out.println("fewgfewg");
		}else {
			if(index<country.length) {
				country[index]=countryname;
				index++;
				return true;
			}
		}
		return false;
	}
	@Override
	public String[] read() {
		return country;
	}
	@Override
	public boolean update(String oldName, String newName) {
		for(String name:country) {
			if(name!=null) {
				if(name.equals(oldName)) {
					name=newName;
					return true;
				}
			}
			
		}
		return false;
	}

}
