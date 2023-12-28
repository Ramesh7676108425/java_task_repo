package com.xworkz.resort.abstractimplementation;

import com.xworkz.resort.abstracts.Resort;
import com.xworkz.resort.dto.ResortDto;

public class ResortImplementation extends Resort {
int index=0;
Object[] obj =new Object[4];
	@Override
	public boolean onsave(ResortDto resortDto) {
		if(resortDto!=null) {
			if (index<obj.length) {
				obj[index]=resortDto;
				index++;
				
			}
			return true;
			
		}else {
			System.out.println("null");
		}
		return false;
	}

	@Override
	public void read() {
		for(Object object:obj) {
			System.out.println(object);
		}
		
	}

	@Override
	public void searchResortId(String id) {
		for(Object object:obj) {
			if(object!=null) {
			//System.out.println();
			ResortDto resortDto =(ResortDto)object;
			if(resortDto.getId().equals(id)) {
				System.out.println(resortDto);
			}
		}
		
	}
	}
	
		public void searchResortname(String name) {
			for(Object object:obj) {
				if(object!=null) {
				//System.out.println();
				ResortDto resortDto =(ResortDto)object;
				if(resortDto.getName().equals(name)) {
					System.out.println(resortDto);

}
				}
			}
		}
}
