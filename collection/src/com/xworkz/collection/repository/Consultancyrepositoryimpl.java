package com.xworkz.collection.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.collection.dto.ConsultancyDto;

public class Consultancyrepositoryimpl  implements Consultancyrepository{
	
	List<ConsultancyDto> clist=new ArrayList<ConsultancyDto>();

	@Override
	public boolean onSave(ConsultancyDto consultancyDto) {
		if(clist!=null) {
			clist.add(consultancyDto);
			System.out.println("clist dto is not equal to null");
			return true;
		}else {
			System.out.println("clist dto is not equal to null");
			//return false;
		}
		return false;
	}

}
