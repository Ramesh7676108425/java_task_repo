package com.xworkz.actorname.service;

import com.xworkz.actorname.repository.ActorNameRepository;

public class ActorNameServiceImplementation  implements ActorNameService {
	private ActorNameRepository repository;
	public ActorNameServiceImplementation(ActorNameRepository repository) {
		this.repository=repository;
	}
	

	@Override
	public boolean validateandsave(String actorName) {
		
		if(actorName==null) {
			System.out.println("is null");
			return false;
		}else if(actorName.isEmpty()) {
			System.out.println("is empty");
			return false;
		}else if(actorName.isBlank()) {
			System.out.println("is blank");
			return false;
		}else if(actorName.length()<4&&actorName.length()>20) {
			System.out.println("actorname length");
		}else {
			boolean exist=isExist(actorName);
			if(exist!=true) {
				
			
			boolean save=repository.onSave(actorName);
			if(save) {
				System.out.println("saved successfullly");
				return true;
			}else {
				System.out.println("not saved successfully");
			}
		}
		}
		return false;
	}


	@Override
	public boolean isExist(String actorName) {
		String[] actor=repository.read();
		if(actor!=null||actorName!=null) {
			for(String name:actor) {
				if(name!=null) {
					if(name.equalsIgnoreCase(actorName)) {
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
		if(oldName!=null|| newName!=null) {
			System.out.println("");
			boolean oldvalucheck=isExist(oldName);
			System.out.println("old value is:"+oldName);
			if(oldvalucheck) {
				System.out.println("old value is checked");
			}else {
				boolean update =repository.update(newName);
				if(update==true) {
					System.out.println("updated successfully");
					return true;
				}else {
					System.out.println("not updated successfully");
				}
			}
		}else {
			System.out.println("not exist");
		}
		return false;
	}


	@Override
	public void read() {

		String[] actor=repository.read();
		for(String name:actor) {
			System.out.println("actor is:"+name);
		}
	}


	@Override
	public boolean delete(String actorName) {
		if(actorName!=null) {
			boolean delete=repository.delete(actorName);
			if(delete) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("not deleted successfully");
			}
		}else {
			System.out.println("element is not present");
		}
		return false;
	}

}
