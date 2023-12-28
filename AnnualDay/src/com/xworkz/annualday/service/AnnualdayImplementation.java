package com.xworkz.annualday.service;

import com.xworkz.annualday.constants.CentreName;
import com.xworkz.annualday.constants.Venue;
import com.xworkz.annualday.dto.AnnualDayDto;
import com.xworkz.annualday.repository.AnnualDayRepository;
import com.xworkz.annualday.repository.AnnualDayRepositoryImpl;

public class AnnualdayImplementation extends AnnualdayService {

	AnnualDayRepository repo = new AnnualDayRepositoryImpl();

	@Override
	public boolean validateDto(AnnualDayDto annualDayDto) {
		if (annualDayDto != null) {
			boolean resultOfcentreName = validateCentreName(annualDayDto.getCenterName());
			boolean isVenue = validateVenue(annualDayDto.getVenue());
			if (resultOfcentreName && isVenue) {
				boolean save = repo.onSave(annualDayDto);
				if (save) {
					System.out.println("Data Saved Successfully");
				} else {
					System.out.println("Data is not saved");
				}
			}
		}

		return false;
	}

	private boolean validateCentreName(String centreName) {

		if (centreName.isEmpty()) {
			System.out.println("is empty");
			return false;
		} else if (centreName.isBlank()) {
			return false;
		}
		if (!(CentreName.BTM_LAYOT.toString().equalsIgnoreCase(centreName)
				|| CentreName.RAJAJUNAGR.toString().equalsIgnoreCase(centreName))) {

			System.out.println("center name is worng");
			return false;
		}
		return true;

	}

	private boolean validateVenue(String venue) {
		if (venue.isEmpty()) {
			System.out.println("is empty");
			return false;
		}
		if (venue.isBlank()) {
			return false;
		}
		if (!(Venue.BENGLORE.toString().equalsIgnoreCase(venue) || Venue.MYSORE.toString().equalsIgnoreCase(venue))) {
			System.out.println(" venue is worng");
			return false;
		}
		return true;

	}

	@Override
	public void read() {
		AnnualDayDto[] dto = repo.read();
		for (AnnualDayDto annualDayDto : dto) {
			System.out.println(annualDayDto);
		}

	}

	@Override
	public void update(String venue, AnnualDayDto annualDayDto) {
		if (validateVenue(annualDayDto.getVenue()) && validateCentreName(annualDayDto.getCenterName())) {
			boolean result = repo.updateByVenue(venue, annualDayDto);
			if (result == true) {
				System.out.println("updated ");
			}
		}
		else {
			System.out.println("not updated");
		}
	}
}
