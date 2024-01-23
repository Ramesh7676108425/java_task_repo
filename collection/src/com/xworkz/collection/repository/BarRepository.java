package com.xworkz.collection.repository;

import java.util.List;

import com.xworkz.collection.dto.BarDto;

public interface BarRepository {
	
	
	boolean onSave(BarDto barDto);
	
	List<BarDto> readall();

}
