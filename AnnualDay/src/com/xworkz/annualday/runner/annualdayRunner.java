package com.xworkz.annualday.runner;

import java.util.Date;

import com.xworkz.annualday.constants.CentreName;
import com.xworkz.annualday.constants.Venue;
import com.xworkz.annualday.dto.AnnualDayDto;
import com.xworkz.annualday.service.AnnualdayImplementation;
import com.xworkz.annualday.service.AnnualdayService;

public class annualdayRunner {
	
	public static void main(String[] args) {
		
		AnnualDayDto annualday=new AnnualDayDto();
		annualday.setCenterName(CentreName.RAJAJUNAGR.toString());
		annualday.setBudget(50000);
		annualday.setDate(new Date ());
		annualday.setGuest("om sir");
		annualday.setTheam("retro");
		annualday.setVenue(Venue.MYSORE.toString());
		
		
		AnnualDayDto annualday1=new AnnualDayDto();
		annualday1.setCenterName(CentreName.BTM_LAYOT.toString());
		annualday1.setBudget(500000);
		annualday1.setDate(new Date ());
		annualday1.setGuest("vinodha mam");
		annualday1.setTheam("westren");
		annualday1.setVenue(Venue.BENGLORE.toString());
	
		AnnualDayDto annualday2=new AnnualDayDto();
		annualday2.setCenterName(CentreName.BTM_LAYOT.toString());
		annualday2.setBudget(40000);
		annualday2.setDate(new Date ());
		annualday2.setGuest("harish sir ");
		annualday2.setTheam("traditional");
		annualday2.setVenue(Venue.BENGLORE.toString());
		
		AnnualdayService a = new AnnualdayImplementation();
	    a.validateDto(annualday);
		a.validateDto(annualday1);
		a.validateDto(annualday2);
		a.read();
		System.out.println("display");
		AnnualDayDto annualday3=new AnnualDayDto();
		annualday3.setCenterName(CentreName.BTM_LAYOT.toString());
		annualday3.setBudget(50000);
		annualday3.setDate(new Date ());
		annualday3.setGuest("loki sir ");
		annualday3.setTheam("folk");
		annualday3.setVenue(Venue.MYSORE.toString());
		a.update(Venue.BENGLORE.toString(), annualday3);
		a.read();
		
		
	}

}
