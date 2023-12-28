package com.xworkz.product.abstractimplementation;

import com.xworkz.product.abstracts.MusicalNight;
import com.xworkz.product.dto.MusicalNightDto;

public class MusicalNightImplementation  extends MusicalNight {
	Object[] obj=new Object[3];
	
	int index =0;
	public boolean onsave(MusicalNightDto musicalNightDto) {
		if( musicalNightDto !=null) {
			System.out.println("not null");
			
			if(index<obj.length) {
				obj[index]= musicalNightDto;
				index++;
				
			}
			
			return true;
			
		}
		else {
			System.out.println("null");
		}

		return false;
	}
	
	public void read() {
		for (Object object:obj) {
			System.out.println(object);
		}
}

}