package com.xworkz.Malpe.repository;

import java.util.List;

import com.xworkz.Malpe.dto.MalpeDto;

public interface MalpeRepository {
	
	
	
	boolean onSave(MalpeDto malpeDto);
	
	List<MalpeDto> readall();
	
	
	

}
