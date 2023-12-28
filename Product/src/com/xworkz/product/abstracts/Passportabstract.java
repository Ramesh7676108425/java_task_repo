package com.xworkz.product.abstracts;

import com.xworkz.product.dto.Passportdto;

public abstract class Passportabstract {
	
	
	public abstract void onsave(Passportdto passportdto) ;
	public abstract void read();
	public abstract void searchBy(String PermanentAddress);
	public abstract void updateBy(String email);
	public abstract void searchBy(int ContactNumber);
	public abstract void updateBy(int ApplicationId);
	public abstract void deleteBy(int ApplicationId);
		
	

}
