package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDto;

public interface ApplicationRepository {
	
	
	boolean onSave(ApplicationDto applicationdto);
	
	ApplicationDto[] read();
	

}
