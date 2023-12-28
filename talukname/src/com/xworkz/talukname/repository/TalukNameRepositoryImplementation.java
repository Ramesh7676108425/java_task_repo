package com.xworkz.talukname.repository;

public class TalukNameRepositoryImplementation  implements TalukNameRepository{
	
	
	private String[] taluk=new String[4];
	private int index=0;

	@Override
	public boolean onSave(String talukName) {
		
		if(taluk==null||index>=taluk.length) {
			System.out.println("array is full");
		}else {
			if(index<taluk.length) {
				taluk[index]=talukName;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		return taluk;
	}

	@Override
	public boolean update(String oldName, String newName) {
		for(int i=0;i<taluk.length;i++) {
			
		if(taluk[index]!=null) {
			if(taluk.equals(oldName)) {
				taluk[index]=newName;
				return true;
					
				}
				
			}
		}

		return false;
	}

}
