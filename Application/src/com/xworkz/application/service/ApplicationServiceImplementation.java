package com.xworkz.application.service;

import com.xworkz.application.dto.ApplicationDto;
import com.xworkz.application.repository.ApplicationRepository;

public class ApplicationServiceImplementation implements ApplicationService {

	private ApplicationRepository repository;

	public ApplicationServiceImplementation(ApplicationRepository repository) {
		this.repository = repository;
	}

	// boolean validate= true;
	@Override
	public boolean validateandsave(ApplicationDto applicationdto) {
		boolean validateid = true;
		boolean validateemail=true;
		boolean validatecontactNumber=true;
		boolean validatepassword=true;
		boolean validatemodeOfExam=true;
		if (applicationdto != null) {
			System.out.println("is null");
			if (applicationdto.getApplicationId() == null) {
				System.out.println("appliaction id is null");
				validateid=false;
			}
			if (applicationdto.getApplicationId().equals("null")) {
				System.out.println("");
				validateid=false;
			}
			if(applicationdto.getApplicationId().startsWith("G")) {
				System.out.println("starting with letter g");
				validateid=false;
			}
			

			if (applicationdto.getApplicationId().length() < 3 && applicationdto.getApplicationId().length() > 25) {
				System.out.println(" length checking");
				validateid = false;
			} if(applicationdto.getEmail()==null) {
				System.out.println("eriuugeriugi");
				validateemail=false;
			}
			if(applicationdto.getEmail().equals("null")) {
				System.out.println("bvhebivbrib");
				validateemail=false;
			}if(applicationdto.getEmail().length()<3&&applicationdto.getEmail().length()>20) {
				System.out.println("bgbgibgg");
				validateemail=false;
			}
			if(applicationdto.getEmail().contains("@")) {
				System.out.println("conatins @");
				validateemail=false;
			}
			if(applicationdto.getContactNumber()==null) {
				System.out.println("vjycewcvjev");
				validatecontactNumber=false;
			}
			if(applicationdto.getContactNumber().equals("null")) {
				System.out.println("");
				validatecontactNumber=false;
			}
			if(applicationdto.getContactNumber().length()<9&&applicationdto.getContactNumber().length()>11) {
				System.out.println("");
				validatecontactNumber=false;
			}
			if(applicationdto.getPassword()==0) {
				System.out.println("");
				 validatepassword=false;
				
			}
			if(applicationdto.getPassword()<0) {
				System.out.println("");
				 validatepassword=false;
			}
			if(applicationdto.getModeOfExam()==null) {
				System.out.println("");
				validatemodeOfExam=false;
			}
			if(applicationdto.getModeOfExam().equals("null")) {
				System.out.println("");
				validatemodeOfExam=false;
			}
			if(applicationdto.getModeOfExam().length()<3&&applicationdto.getModeOfExam().length()>20) {
				System.out.println("");
				validatemodeOfExam=false;
			}
		}
		if(validateid==true||validateemail==true||validatepassword==true||validatemodeOfExam==true) {
			 boolean save=repository.onSave(applicationdto);
			 System.out.println("save:"+save);
			 
		}
//		boolean save=repository.onSave(applicationdto);
//		System.out.println("save:"+save);
		return false;
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		ApplicationDto[] dtos = repository.read();
		for (ApplicationDto name : dtos) {
			System.out.println(name);
		}
	}

}
