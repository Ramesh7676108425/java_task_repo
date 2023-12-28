package com.xworkz.worldcup.service;


import com.xworkz.worldcup.constants.Host;
import com.xworkz.worldcup.constants.Winner;
import com.xworkz.worldcup.dto.WorldCupDto;
import com.xworkz.worldcup.repository.WorldCupRepository;
import com.xworkz.worldcup.repository.WorldCupRepositoryImplementation;

public class WorldCupImplementation extends WorldCupService {

	
	WorldCupRepository repo=new WorldCupRepositoryImplementation();
	
	private  boolean validatehost(String host) {
		if(host.isEmpty()) {
			System.out.println("is empty");
			return false;
		} else if(host.isBlank()) {
			System.out.println("is blank");
			return false;
		}
		if(!(Host.INDIA.toString().equalsIgnoreCase(host))||
		(Host.AUS.toString().equalsIgnoreCase(host))){
		return false;
	}
return true;
}

	public boolean validatewinner(String winner) {
		if(winner.isEmpty()) {
			System.out.println("is empty");
			return false;
			
		}else if(winner.isBlank()) {
			System.out.println("is blank");
			return false;
		}
		if(!(Winner.SL.toString().equalsIgnoreCase(winner))||(Winner.SA.toString().equalsIgnoreCase(winner))) {
			return false;
		}
		return true;
		}

	@Override
	public WorldCupDto validateDto(WorldCupDto worldCupDto) {
		if(worldCupDto !=null) {
			boolean resultOfhost=validatehost(worldCupDto.getHost());
			boolean iswinner=validatewinner(worldCupDto.getWinner());
			if(resultOfhost && iswinner) {
				boolean save=repo.onSave(worldCupDto);
				if(save) {
					System.out.println("data saved successfully");
				}else {
					System.out.println("data is not saved");
				}
			}
		}
		return null;
		
	}
	
//	public void read() {
//		WorldCupDto[] dto = repo.read();
//		for (WorldCupDto worldCupDto : dto) {
//			System.out.println(worldCupDto);
//		}
//
//	}
}