package com.xworkz.googleapps.repository;

import com.xworkz.googleapps.dto.GoogleAppsDto;

public class GoogleAppsRepositoryImplementation implements GoogleAppsRepository{
	
	private GoogleAppsDto[] dtolist=new GoogleAppsDto[4];
	private int index=0;

	@Override
	public boolean onSave(GoogleAppsDto googleappsdto) {
		
		if(index<dtolist.length) {
			dtolist[index]=googleappsdto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public GoogleAppsDto[] read() {
		return dtolist;
	}

}
