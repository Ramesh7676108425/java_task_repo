package com.xworkz.application.service;

import com.xworkz.application.dto.ApplicationDto;

public interface ApplicationService {
	
	
	boolean validateandsave(ApplicationDto applicationdto);
	
	void read();

}
