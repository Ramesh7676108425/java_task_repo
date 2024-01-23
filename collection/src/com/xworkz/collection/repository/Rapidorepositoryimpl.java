package com.xworkz.collection.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.collection.dto.RapidoDto;

public class Rapidorepositoryimpl  implements Rapidorepository{
	
	List<RapidoDto> rapidolist=new ArrayList<RapidoDto>();

	@Override
	public boolean onSave(RapidoDto rapidodto) {
		
		if(rapidolist!=null) {
			rapidolist.add(rapidodto);
			System.out.println("rapido dtolist is not equal to null");
			return true;
		}else {
			System.out.println("rapido dtolist is  equal to null");
		}
		return false;
	}

	@Override
	public List<RapidoDto> readall() {
		// TODO Auto-generated method stub
		return rapidolist;
	}

}
