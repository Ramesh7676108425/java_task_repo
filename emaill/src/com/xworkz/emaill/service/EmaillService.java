package com.xworkz.emaill.service;

import com.xworkz.emaill.dto.EmaillDto;

public abstract class EmaillService {
	
	
	public abstract boolean validateDto(EmaillDto dto);
	
	public  abstract void read();

}
