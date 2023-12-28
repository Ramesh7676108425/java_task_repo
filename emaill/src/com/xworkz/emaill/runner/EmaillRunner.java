package com.xworkz.emaill.runner;

import com.xworkz.emaill.constants.AccountType;
import com.xworkz.emaill.constants.Gender;
import com.xworkz.emaill.dto.EmaillDto;
import com.xworkz.emaill.service.EmaillImplementation;
import com.xworkz.emaill.service.EmaillService;

public class EmaillRunner {
	
	public static void main(String[] args) {
		
		EmaillDto dto=new EmaillDto();
		dto.setFirstName("raju");
		dto.setLastName("sisya");
		dto.setMiddleName("macha");
		dto.setAddress("mysore");
		dto.setContactNumber(47847464);
		dto.setPassword(953554);
		dto.setUserName("rajumaharaj");
		dto.setGender(Gender.FEMALE.toString());
		dto.setAccountType(AccountType.PRIVATE.toString());
		
		EmaillDto dto1=new EmaillDto();
		dto1.setFirstName("madan");
		dto1.setLastName("rasika");
		dto1.setMiddleName("m");
		dto1.setAddress("banglore");
		dto1.setContactNumber(767610);
		dto1.setPassword(88807);
		dto1.setUserName("HS");
		dto1.setAccountType(AccountType.PUBLIC.toString());
		dto1.setGender(Gender.MALE.toString());
		
		
		EmaillDto dto2=new EmaillDto();
		dto2.setFirstName("som");
		dto2.setLastName("ic");
		dto2.setMiddleName("ss");
		dto2.setAddress("kollegal");
		dto2.setContactNumber(998877);
		dto2.setPassword(000000);
		dto2.setUserName("HS");
		dto2.setAccountType(AccountType.PUBLIC.toString());
		dto2.setGender(Gender.MALE.toString());
		
		

		EmaillService ser=new EmaillImplementation();
		ser.validateDto(dto);
		ser.validateDto(dto1);
		ser.validateDto(dto2);
		ser.read();
		
		
	}

}
