package com.xworkz.statename.repository;

public class StateNameRepositoryImplementation implements StateNameRepository {
	
	private String[] state=new String[4];
	int index=0;

	@Override
	public boolean onSave(String stateName) {
		
		if(state==null||index>=state.length) {
			System.out.println("array is full and index is greter than the given value");
		}
		else {
			if(index<state.length) {
				state[index]=stateName;
				return true;
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		// TODO Auto-generated method stub
		return state;
	}

}
