package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDto;

public class ApplicationRepositoryImplementation implements ApplicationRepository{
	
	private ApplicationDto[] dtolist=new ApplicationDto[4];
	private int index=0;

	@Override
	public boolean onSave(ApplicationDto applicationdto) {
		
		if(index<dtolist.length) {
			dtolist[index]=applicationdto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public ApplicationDto[] read() {
		// TODO Auto-generated method stub
		return dtolist;
	}

}
