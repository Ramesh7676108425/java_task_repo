package com.xworkz.emaill.repository;

import com.xworkz.emaill.dto.EmaillDto;

public abstract class EmaillRepositoryabstact {
	
	
	public abstract boolean validateDto(EmaillDto emaillDto);
    public abstract void read();
}


