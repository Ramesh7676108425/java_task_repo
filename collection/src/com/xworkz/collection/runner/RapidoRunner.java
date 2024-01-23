package com.xworkz.collection.runner;

import com.xworkz.collection.dto.RapidoDto;
import com.xworkz.collection.repository.Rapidorepository;
import com.xworkz.collection.repository.Rapidorepositoryimpl;
import com.xworkz.collection.service.RapidoService;
import com.xworkz.collection.service.RapidoServiceimpl;

public class RapidoRunner {
	
	
	public static void main(String[] args) {
		
		
		RapidoDto dto=new RapidoDto();
		dto.setCustomer("karthik");
		dto.setDrivername("vikas");
		dto.setLocation("banglore");
		dto.setRating(8);
		System.out.println(dto.toString());
		
		
		Rapidorepository repository=new Rapidorepositoryimpl();
		RapidoService service=new RapidoServiceimpl(repository);
		service.validatandsave(dto);
		service.read();
	}

}
