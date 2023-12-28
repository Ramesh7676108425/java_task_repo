package com.xworkz.actressname.repository;

public class ActressNameRepositoryImplementation implements ActressNameRepository {
	
	
	private String[] actress=new String[4];
	private int index=0;

	@Override
	public boolean onSave(String actressName) {
		
		if(actress==null||index>=actress.length) {
			System.out.println("array is full");
		}else {
			if(index<actress.length) {
				actress[index]=actressName;
				index++;
				return true;
			}
		}
		return false;
	}

}
