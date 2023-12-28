package com.xworkz.talukname.service;

import com.xworkz.talukname.repository.TalukNameRepository;

public class TalukNameServiceImplementation  implements TalukNameService {
	
	private TalukNameRepository repository;
	public TalukNameServiceImplementation (TalukNameRepository repository) {
		this.repository=repository;
	}
	
	
	

	@Override
	public boolean validateandsave(String talukName) {
		if(talukName!=null) {
			System.out.println("is null");
		}if(talukName.isEmpty()) {
			System.out.println("is empty");
		}if(talukName.isBlank()) {
			System.out.println("is null");
		}if(talukName.length()>2&&talukName.length()<20) {
			System.out.println("lnlke");
		}else {
			
			boolean exist=isExist(talukName);
			if(exist!=true) {
				
			}
			boolean save=repository.onSave(talukName);
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
	public boolean isExist(String talukName) {
		String[] taluk=repository.read();
		if(taluk!=null||talukName!=null) {
			for(String name:taluk) {
				if(name!=null) {
					if(taluk.equals(talukName)) {
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
			System.out.println(" ");
			boolean oldnamecheck=isExist(oldName);
			System.out.println("old value:"+oldName);
			if(oldnamecheck) {
				System.out.println("old value is checked");
				boolean update=repository.update(oldName, newName);
				if(update==true) {
					System.out.println("update successfully");
					return true;
				}else {
					System.out.println("not saved successfully");
				}
			}else {
				System.out.println("not exist");
			}
		}
		return false;
	}




	@Override
	public void read() {
		
		String[] taluk=repository.read();
		for(String name:taluk) {
			System.out.println("element is:"+taluk);
			
		}
		
	}

}
