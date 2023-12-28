package scom.xworkz.schoolname.service;

import com.xworkz.schoolname.repository.SchoolNameRepository;

public  class SchoolNameServiceImplementation implements SchoolNameService {
private	SchoolNameRepository repository;
public SchoolNameServiceImplementation(SchoolNameRepository repository) {
	this.repository=repository;
}
@Override
	public boolean validateandsaveS(String schoolName) {
		
		
		if(schoolName==null) {
			System.out.println("is null");
			return false;
		}if(schoolName.isEmpty()) {
			System.out.println("is empty");
			return false;
		}if(schoolName.isBlank()) {
			System.out.println("is blank");
			return false;
		}if(schoolName.length()<2&&schoolName.length()>25) {
			
			System.out.println(schoolName);
			return false;
		}else {
			
			boolean exist=isExists(schoolName);
			if(exist!=true) {
				
			}
			boolean save=repository.onSave(schoolName);
			if(save) {
				System.out.println("saved successfully");
				return true;
			}else {
				System.out.println("not saved successfully");
			}
		}
		return false;
	}
@Override
public boolean isExists(String schoolName) {

	String[] school=repository.read();
	if(schoolName!=null&&school!=null) {
		for(String name:school) {
			if(name!=null) {
				if(name.equals(schoolName)) {
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
		System.out.println("null check is done");
		boolean oldvaluecheck=isExists(oldName);
		System.out.println("is exist:"+oldName);
		if(oldvaluecheck) {
			System.out.println("oldvalue is checked");
			boolean update=repository.update(newName, oldName);
			if(update==true) {
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
	
	String[] school=repository.read();
	for(String names:school) {
		System.out.println("element is:"+names);
	
}

}
@Override
public boolean delete(String schoolName) {
	if(schoolName!=null) {
		boolean delete=repository.delete(schoolName);
		System.out.println("delete:"+delete);
		if(delete) {
			System.out.println("deleted successfully");
		}else {
			System.out.println("not deleted successfully");
		}
	}else {
		System.out.println("not present");
	}
	return false;
}
}
