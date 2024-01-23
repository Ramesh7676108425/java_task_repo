package com.xworkz.collection.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.collection.dto.BarDto;

public class BarRepositoryImplementation  implements BarRepository {
	
	List<BarDto> bardtolist=new ArrayList<BarDto>();

	@Override
	public boolean onSave(BarDto barDto) {
		if(bardtolist!=null) {
			bardtolist.add(barDto);
			System.out.println("list of bardto is not equal to null");
			return true;
		}else {
			System.out.println("list of bardto is equal to null");
		}
		return false;
	}

	@Override
	public List<BarDto> readall() {
		// TODO Auto-generated method stub
		return bardtolist;
	}

}
