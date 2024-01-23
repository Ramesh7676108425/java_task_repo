package com.xworkz.collection.service;

import com.xworkz.collection.dto.RapidoDto;
import com.xworkz.collection.repository.Rapidorepository;

public class RapidoServiceimpl implements RapidoService {
	
	public Rapidorepository repository;
	

	public RapidoServiceimpl(Rapidorepository repository) {
		
		this.repository = repository;
	}


	@Override
	public boolean validatandsave(RapidoDto rapidodto) {

		
		if(rapidodto!=null) {
			System.out.println("rapidodto not equal to null");
			boolean save=repository.onSave(rapidodto);
			if(repository.onSave(rapidodto)) {
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
System.out.println("reading all service");		
	}

}
