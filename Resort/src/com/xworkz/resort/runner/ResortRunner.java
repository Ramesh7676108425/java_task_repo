package com.xworkz.resort.runner;

import com.xworkz.resort.abstractimplementation.ResortImplementation;
import com.xworkz.resort.abstracts.Resort;
import com.xworkz.resort.dto.ResortDto;

public class ResortRunner {
	
	public static void main(String[] args) {
		
		ResortDto r =new ResortDto ();
		
		Resort rt =new ResortImplementation();
		
		r.setAddress("hkugkg");
		r.setContactNumber(785858);
		r.setEmail("kjhklh");
		r.setId("hhh");
		r.setName("hilh");
		r.setReview("jjjj");
		rt.onsave(r);
		rt.read();
		rt.searchResortId("");
		System.out.println("");
		
	}

}
