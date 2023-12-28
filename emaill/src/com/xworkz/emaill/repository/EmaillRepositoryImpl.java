package com.xworkz.emaill.repository;

import com.xworkz.emaill.dto.EmaillDto;

public class EmaillRepositoryImpl extends EmaillRepositoryabstact {
	
	EmaillDto[] dto=new EmaillDto[4];
	int index=0;

	public boolean onSave(EmaillDto emailldto) {
		for (int i=0;i<dto.length;i++) {
			if(dto[i]!=null) {
				if(dto[i].equals(emailldto)) {
					System.out.println("object is present");
					return false;
				}
			}
		}
		if(index<dto.length) {
			dto[index]=emailldto;
			index++;
			System.out.println("dto saved successfully");
			return true;
		}else {
			System.out.println("dto not saved");
		}
		return false;
	}

	@Override
	public boolean validateDto(EmaillDto emaillDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

}
