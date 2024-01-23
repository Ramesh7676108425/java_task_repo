package com.xworkz.collection.repository;

import java.util.List;

import com.xworkz.collection.dto.RapidoDto;

public interface Rapidorepository {
	
	
	
	boolean onSave(RapidoDto rapidodto);
	
	List<RapidoDto> readall();

}
