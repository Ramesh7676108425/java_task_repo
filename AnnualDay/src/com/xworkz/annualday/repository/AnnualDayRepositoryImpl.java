package com.xworkz.annualday.repository;

import com.xworkz.annualday.dto.AnnualDayDto;

public class AnnualDayRepositoryImpl extends AnnualDayRepository {

	AnnualDayDto[] dtos = new AnnualDayDto[5];
	int index = 0;

	@Override
	public boolean onSave(AnnualDayDto annualDayDto) {
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null) {
				if (dtos[i].equals(annualDayDto)) {
					System.out.println("obj is present");
					return false;
				}
			}

		}
		System.out.println(index);
		if (index < dtos.length) {
			dtos[index] = annualDayDto;
			index++;
			System.out.println(index);
			System.out.println("dto is saved successfully");
			return true;
		} else {
			System.out.println("dto is not saved");
			return false;
		}
	}

	@Override
	public AnnualDayDto[] read() {
		return dtos;
	}

	@Override
	public boolean updateByVenue(String venue, AnnualDayDto annualDayDto) {
         boolean result=false;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null) {
				if(dtos[i].getVenue().equalsIgnoreCase(venue)) {
					dtos[i]=annualDayDto;
					result=true;
		
				}
				
			}
               
		}
		if(result==true) {
			return result;
		}
		return false;
	}

}
