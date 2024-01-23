package com.xworkz.collection.service;

import com.xworkz.collection.dto.HotelDto;
import com.xworkz.collection.repository.Hotelrepository;

public class HotelServiceImplementation  implements HotelService{
	
	
	public Hotelrepository repository;
	
	

	public HotelServiceImplementation(Hotelrepository repository) {
		
		this.repository = repository;
	}



	@Override
	public boolean validateandsave(HotelDto hotelDto) {
		
		if(hotelDto!=null) {
			System.out.println("hotel dto is not null");
			boolean save=repository.onSave(hotelDto);
			if(repository.onSave(hotelDto)) {
				System.out.println("saved successfully");
				return true;
			}else {
				System.out.println("not saved successfully");
				return false;
			}
		}else {
			System.out.println("dto is null");
		}
		return false;
	}



	@Override
	public void read() {
System.out.println("reading all the service");		
	}

}
