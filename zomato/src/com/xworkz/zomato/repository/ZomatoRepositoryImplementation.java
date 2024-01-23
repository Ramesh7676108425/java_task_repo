package com.xworkz.zomato.repository;

import com.xworkz.zomato.dto.ZomatoDto;

public class ZomatoRepositoryImplementation implements ZomatoRepository {
	
private ZomatoDto[] dtos=new ZomatoDto[3];	 
private int index=0;
	@Override
	public boolean onSave(ZomatoDto zomatodto) {
		
		if(index<dtos.length) {
			dtos[index]=zomatodto;
			index++;
			return true;
		}
		return false;
	}
	@Override
	public ZomatoDto[] read() {
		return dtos;
	}
	@Override
	public boolean update(String email, ZomatoDto zomatodto) {
		if(email!=null&&zomatodto!=null) {
			for(int i=0;i<dtos.length;i++) {
				if(dtos[i]!=null) {
					if(dtos[i].getEmail().equalsIgnoreCase(email)) {
						dtos[i]=zomatodto;
						return true;
					}
				}
			}
		}
		return false;
	}
	@Override
	public boolean delete(String email) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i]!=null) {
				if(dtos[i].getEmail().equalsIgnoreCase(email)) {
					dtos[i]=null;
					return true;
				}
			}
		}
		return false;
	}

}
