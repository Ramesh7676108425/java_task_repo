package com.xorkz.product.runner;

import com.xworkz.product.abstractimplementation.MusicalNightImplementation;
import com.xworkz.product.abstracts.MusicalNight;
import com.xworkz.product.constants.Guest;
import com.xworkz.product.dto.MusicalNightDto;

public class MusicalNightRunner {
	
	
	public static void main(String[] args) {
		
		
		MusicalNight m=new MusicalNightImplementation();
		
		MusicalNightDto  musicalNightDto =new MusicalNightDto();
		
		 musicalNightDto.setAgerestriction("aa");
		 musicalNightDto.setDate("12/12");
		 musicalNightDto.setDurationInHours(4);
		 musicalNightDto.setEventName("bb");
		 musicalNightDto.setGuest(Guest.ROYAL.toString());
		 musicalNightDto.setHasAfterParty(true);
		 musicalNightDto.setMaxAttendees(100);
		 musicalNightDto.setMaxAttendence(88);
		 musicalNightDto.setOrganizer("cc");
		 musicalNightDto.setPerformers("Super");
		 musicalNightDto.setSoldOut(false);
		 musicalNightDto.setSponser("vv");
		 musicalNightDto.setTicketPrice(4.3);
		 musicalNightDto.setVenue("bhyy");
		 musicalNightDto.setWebsite("huh");
		 System.out.println(m.onsave(musicalNightDto));
		 m.read();
		 
		
		
		
		
	}

}
