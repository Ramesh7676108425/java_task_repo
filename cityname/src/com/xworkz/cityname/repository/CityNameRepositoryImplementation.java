package com.xworkz.cityname.repository;

public class CityNameRepositoryImplementation implements CityNameRepository{

	private String[] city=new String[3];
	private int index=0;
	
	@Override
	public boolean onSave(String cityName) {
		if(city==null||index>=city.length) {
			System.out.println("array is full");
		}else {
			if(index<city.length) {
				city[index]=cityName;
				index++;
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String[] read() {
		return city;
	}

	@Override
	public boolean update(String oldName, String newName) {
		for(int i=0;i<oldName.length();i++) {
			if(city[i]!=null) {
				if(city.equals(oldName)) {
					city[i]=newName;
					return true;
					
				}
			}
		}
		return false;
	}

}
