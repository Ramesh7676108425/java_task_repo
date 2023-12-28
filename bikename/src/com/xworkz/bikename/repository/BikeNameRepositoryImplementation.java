package com.xworkz.bikename.repository;

public class BikeNameRepositoryImplementation implements BikeNameRepository {

	private String[] bike = new String[3];
	private int index = 0;

	@Override
	public boolean onSave(String bikeName) {

		if (bike == null || index >= bike.length) {
			System.out.println("array is full");
		} else {

			if (index < bike.length) {
				bike[index] = bikeName;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		return bike;
	}

	@Override
	public boolean update(String oldName, String newName) {
		for (int i = 0; i < bike.length; i++) {

			if (bike != null) {
				if (bike[i].equals(oldName)) {
					bike[i] = newName;
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public boolean delete(String bikeName) {
		//System.out.println("delete method in repo");
		for(int i=0;i<bike.length;i++) {
			//System.out.println("delete method in repo");
			if(bike[i]!=null) {
				System.out.println("delete method in repo");
				if(bike[i].equalsIgnoreCase(bikeName)) {
					bike[i]=null;
					return true;
				}
			}
		}
		return false;
	}
}
