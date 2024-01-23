package com.xworkz.zomato.service;

import com.xworkz.zomato.dto.ZomatoDto;

public interface ZomatoService {
	
	boolean validateandsave(ZomatoDto ZomatoDto);
	
	boolean  read();
	boolean validateUpdate(String email,ZomatoDto ZomatoDto);

}
