package com.xworkz.collection.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.collection.dto.HotelDto;

public class Hotelrepositoryimpl  implements Hotelrepository{
	
	List<HotelDto> hoteldtolist=new ArrayList<HotelDto>();

	@Override
	public boolean onSave(HotelDto hoteldto) {
  if(hoteldtolist!=null) {
	  hoteldtolist.add(hoteldto);
	  System.out.println("hotel dto list is not equal to null");
	  return true;
  }else {
	  System.out.println("hotel dto list is  equal to null");
	 
  }
  return false;	
	}

}
