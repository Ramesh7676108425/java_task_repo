package com.xworkz.zomato.repository;

import com.xworkz.zomato.dto.ZomatoDto;

public interface ZomatoRepository {
	
	
	boolean onSave(ZomatoDto zomatodto);
	
	ZomatoDto[] read();
	
	boolean update(String email,ZomatoDto zomatodto);
	
	boolean delete(String email);

}
