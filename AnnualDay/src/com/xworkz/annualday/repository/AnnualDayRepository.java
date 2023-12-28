package com.xworkz.annualday.repository;

import com.xworkz.annualday.dto.AnnualDayDto;

public abstract class AnnualDayRepository {
	
	public abstract boolean onSave(AnnualDayDto annualDayDto);
	
	public abstract AnnualDayDto[] read();
	
	public abstract boolean updateByVenue(String venue ,AnnualDayDto annualDayDto);

}
