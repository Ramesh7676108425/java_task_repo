package com.xworkz.actorname.repository;

public class ActorNameRepositoryImplementation implements ActorNameRepository {
	
	
	private String[] actor=new String[4];
	private int index=0;

	@Override
	public boolean onSave(String actorName) {
		if(actor==null||index>=actor.length) {
			System.out.println("array is full");
		}else{
			if(index<actor.length) {
				actor[index]=actorName;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		return actor;
	}

	@Override
	public boolean update(String actorName) {
		for(int i=0;i<actor.length;i++) {
			if(actor[i]!=null) {
				if(actor[i].equals(actorName)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean delete(String actorName) {
		if(actorName!=null) {
			for(int i=0;i<actor.length;i++) {
				if(actor[i]!=null) {
					if(actor[i].equalsIgnoreCase(actorName)) {
						actor[i]=null;
						return true;
					}
				}
			}
		}
		return false;
	}
}
	
/////h
	
	


