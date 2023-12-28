package com.xworkz.emaill.service;

import com.xworkz.emaill.constants.AccountType;
import com.xworkz.emaill.constants.Gender;
import com.xworkz.emaill.dto.EmaillDto;
import com.xworkz.emaill.repository.EmaillRepositoryabstact;
import com.xworkz.emaill.repository.EmaillRepositoryImpl;

public class EmaillImplementation extends EmaillService {
	EmaillRepositoryImpl rep=new EmaillRepositoryImpl();
	@Override
	public boolean validateDto(EmaillDto emailldto) {
		if(emailldto!=null) {
			boolean resultfirstName=validatefirstName(emailldto.getFirstName());
			boolean resultlastName=validatelastName(emailldto.getLastName());
			boolean resultmiddleName=validatemiddleName(emailldto.getMiddleName());
			boolean resultaddress=validateaddress(emailldto.getAddress());
			
		if(resultfirstName&&resultlastName&&resultmiddleName&&resultaddress) {
			boolean save=rep.onSave(emailldto);
			if(save) {
				System.out.println("saved");}
			else {
				System.out.println("not saved");
			}
		
		}
		}
		return false;
	}
	
	
	private boolean validatefirstName(String firstName) {
		if(firstName.isEmpty()) {
			System.out.println("is empty");
			return false;
		}else if(firstName.isBlank()) {
			System.out.println("is blank");
			return false;
		}
		return true;
		
	}
	private boolean validatelastName(String lastName) {
		if(lastName.isEmpty()) {
			System.out.println("is empty");
			return false;
		}else if(lastName.isBlank()) {
			System.out.println("is blank");
			return false;
		}
		return true;
		
	}
	private boolean validatemiddleName(String middleName) {
		if(middleName.isEmpty()) {
			System.out.println("is empty");
			return false;
		} else if(middleName.isBlank()) {
			System.out.println("is blank");
			return false;
		}
		return true;
		
	}
	private boolean validateaddress(String address) {
		if(address.isEmpty()) {
			System.out.println("is empty");
			return false;
		}else if(address.isBlank()) {
			System.out.println("is blank");
			return false;
		}
		return true;
		
	}
	
	private boolean validategender(String gender) {
		if(gender.isEmpty()) {
			System.out.println("is empty");
		}else if(gender.isBlank()) {
			System.out.println("is blank");
		}
		if(!(Gender.FEMALE.toString().equalsIgnoreCase(gender))||
				(Gender.MALE.toString().equalsIgnoreCase(gender))) {
			System.out.println("");
			return false;
			
		}
		return true;
		
	}
	private boolean validateaccountType(String accountType) {
		if(accountType.isEmpty()) {
			System.out.println("is empty");
			return false;
		}else if(accountType.isBlank()) {
			System.out.println("is blank");
			return false;
		}
		if(!(AccountType.PRIVATE.toString().equalsIgnoreCase(accountType))||
				(AccountType.PUBLIC.toString().equalsIgnoreCase(accountType))) {
			System.out.println("");
			return false;
		}
		return true;
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

}
