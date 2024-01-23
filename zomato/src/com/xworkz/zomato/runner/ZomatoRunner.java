package com.xworkz.zomato.runner;

import com.xworkz.zomato.constants.FoodItemName;
import com.xworkz.zomato.dto.ZomatoDto;
import com.xworkz.zomato.repository.ZomatoRepository;
import com.xworkz.zomato.repository.ZomatoRepositoryImplementation;
import com.xworkz.zomato.service.ZomatoService;
import com.xworkz.zomato.service.ZomatoServiceImplementation;

public class ZomatoRunner {
	
	public static void main(String[] args) {
		
		ZomatoDto dto=new ZomatoDto();
		dto.setCustomerName("karthik");
		dto.setContactNumber(9889766756l);
		dto.setEmail("karthik@7676");
		dto.setFoodItemName(FoodItemName.CHICKEN.toString());
		dto.setCostOfFoodItem(250);
		System.out.println(dto.toString());
		
		
		ZomatoRepository repository=new ZomatoRepositoryImplementation();
		ZomatoService service=new ZomatoServiceImplementation(repository);
		
		
		ZomatoDto dto1=new ZomatoDto();
		dto1.setCustomerName("rahul");
		dto1.setEmail("rahul@gamil");
		dto1.setContactNumber(5555567376l);
		dto1.setCostOfFoodItem(300);
		dto1.setFoodItemName(FoodItemName.MUTTON.toString());
		System.out.println(dto1.toString());
		
		ZomatoDto dto2=new ZomatoDto();
		dto2.setCustomerName("rajesh");
		dto2.setEmail("rajesh@gamil");
		dto2.setContactNumber(9955567376l);
		dto2.setCostOfFoodItem(350);
		dto2.setFoodItemName(FoodItemName.MUSHROOM.toString());
		System.out.println(dto2.toString());
		
		
		
		ZomatoDto dto3=new ZomatoDto();
		dto3.setCustomerName("som");
		dto3.setEmail("som@gamil");
		dto3.setContactNumber(8885567376l);
		dto3.setCostOfFoodItem(500);
		dto3.setFoodItemName(FoodItemName.PANNER.toString());
		System.out.println(dto3.toString());
		service.validateandsave(dto);
		service.validateandsave(dto1);
		service.validateandsave(dto2);
		service.validateandsave(dto3);
		service.read();
		System.out.println("updated");
		
		
		ZomatoDto dto4=new ZomatoDto();
		
		dto4.setEmail("prashanth@gamil");
		service.validateUpdate("som@gamil", dto4);
		service.read();
		System.out.println("deleted");
		
		repository.delete("som@gamil");
		service.read();
		
	}

}
