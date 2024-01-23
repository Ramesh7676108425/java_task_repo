package com.xworkz.Malpe.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.Malpe.dto.MalpeDto;

public class MalpeRepositoryImpl  implements MalpeRepository{
	
	
List<MalpeDto> Malpedtolist=new ArrayList<MalpeDto>();
	@Override
	public boolean onSave(MalpeDto malpeDto) {
		if(Malpedtolist!=null) {
			Malpedtolist.add(malpeDto);
			System.out.println("malpedto list is not null");
		return true;
		
			
			
		}else {
			System.out.println("malpedto is null");
			
		}
	
		return false;
	}
	@Override
	public List<MalpeDto> readall() {
		System.out.println("reading all");
		return Malpedtolist;
	}

}
