package com.xworkz.softwarename.repository;

public class SoftwareNameRepositoryImplementation implements SoftwareNameRepository {

	
	private String[] software=new String[4];
	private int index=0;
	@Override
	public boolean onSave(String softwareName) {
		if(software==null||index>=software.length) {
			System.out.println("array  is null  ");
		}else {
			if(index<software.length) {
				software[index]=softwareName;
				index++;
				return true;
			}
		}
		
		return false;
	}
	@Override
	public String[] read() {
		// TODO Auto-generated method stub
		return software;
	}

}
