package com.xorkz.product.runner;

import java.sql.Date;

import com.xworkz.product.abstractimplementation.PassportImplimentation;

import com.xworkz.product.constants.Gender;
import com.xworkz.product.dto.Passportdto;

public class PassportRunner {
	
	public static void main(String[] args) {
		
		PassportImplimentation p=new PassportImplimentation();
		
		Passportdto passportdto=new Passportdto();
		
		passportdto.setAge(25);
		passportdto.setApplicationId(1222);
		passportdto.setContactNumber(767610842);
		Date d=new Date(2001-10-24);
		
		passportdto.setDateOfBirth(d);
		passportdto.setEmail("rameshlrami16@gmail.com");
		passportdto.setGender(Gender.G1.toString());
		passportdto.setOfficeLocation("banglore");
		passportdto.setPaymentOption("Gpay");
		passportdto.setPermanentAddress("banglore");
		passportdto.setUsername(null);
		Date d2=new Date(2001-11-28);
		passportdto.setRegdate(d2);
		p.onsave(passportdto);
		
		p.read();
		
		p.searchBycontactNumber(767610842);
		
		p.deleteByApplicationId(1222);
		
		
		
	}

}
