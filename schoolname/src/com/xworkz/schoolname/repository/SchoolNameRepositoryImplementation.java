package com.xworkz.schoolname.repository;

public class SchoolNameRepositoryImplementation implements SchoolNameRepository {
	
	private String[] school=new String[4];
	
	private int index=0;

	@Override
	public boolean onSave(String schoolName) {
		if(school==null||index>=school.length) {
			System.out.println("array is full");
		}else {
			if(index<school.length) {
				school[index]=schoolName;
				index++;
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String[] read() {
		return school;
	}

	@Override
	public boolean update(String newName, String oldName) {
		for(int i=0;i<school.length;i++) {
			if(school[i]!=null) {
				if(school[i].equals(oldName)) {
					school[i]=newName;
					return true;
				}
			}
		
			
		}
		return false;
	}

	@Override
	public boolean delete(String schoolName) {
		if(schoolName!=null) {
			for(int i=0;i<school.length;i++) {

					if(school[i]!=null) {
						if(school[i].equalsIgnoreCase(schoolName)) {
						school[i]=null;
						return true;
					}
					
				}
				
			}
		}
		return false;
	}

}


