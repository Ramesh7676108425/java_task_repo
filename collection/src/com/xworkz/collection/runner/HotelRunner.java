package com.xworkz.collection.runner;

import com.xworkz.collection.dto.HotelDto;
import com.xworkz.collection.repository.Hotelrepository;
import com.xworkz.collection.repository.Hotelrepositoryimpl;
import com.xworkz.collection.service.HotelService;
import com.xworkz.collection.service.HotelServiceImplementation;

public class HotelRunner {
	
	
	public static void main(String[] args) {
		
		
		HotelDto dto=new HotelDto();
		
		dto.setName("SRL");
		dto.setLocation("kgl");
		dto.setNumberofitem(50);
		dto.setStaff(10);
		System.out.println(dto.toString());
		
		Hotelrepository repository=new  Hotelrepositoryimpl();
		HotelService service=new HotelServiceImplementation(repository);
		service.validateandsave(dto);
		service.read();
	}

}
