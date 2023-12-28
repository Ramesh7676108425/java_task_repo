package com.xworkz.annualday.service;

import com.xworkz.annualday.dto.AnnualDayDto;

public abstract class AnnualdayService {

	
	
	public abstract boolean validateDto(AnnualDayDto annualDayDto);
	
	public abstract void read();
	
	public abstract void update(String venue ,AnnualDayDto annualDayDto);
}
