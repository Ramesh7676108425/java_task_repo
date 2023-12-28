package com.xworkz.worldcup.repository;

import com.xworkz.worldcup.dto.WorldCupDto;

public class WorldCupRepositoryImplementation extends WorldCupRepository {

	WorldCupDto[] xyz=new WorldCupDto[4];
	int index=0;
	@Override
	public boolean onSave(WorldCupDto worldCupDto) {
		for(int i=0;i<xyz.length;i++) {
			if(xyz[i] !=null) {
			if(xyz[i].equals(worldCupDto)) {
				System.out.println("obj is present");
				return false;
			}
				
			}
		}
		
		System.out.println(index);
		if(index<xyz.length) {
			xyz[index]=worldCupDto;
			index++;
			System.out.println(index);
			System.out.println("xyz is saved successfully");
			return true;
		}else {
			System.out.println("xyz is not saved");
			return false;
		}
		
		
		
		
		
		
	}
	//@Override
//	public WorldCupDto[] read() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
