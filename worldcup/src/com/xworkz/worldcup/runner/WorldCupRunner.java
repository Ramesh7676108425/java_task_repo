package com.xworkz.worldcup.runner;

import com.xworkz.worldcup.dto.WorldCupDto;
import com.xworkz.worldcup.service.WorldCupImplementation;
import com.xworkz.worldcup.service.WorldCupService;

public class WorldCupRunner {
	
	public static void main(String[] args) {
		
		WorldCupService word=new WorldCupImplementation();
		WorldCupDto worldcupDto=new WorldCupDto();
		worldcupDto.setWinner("india");
		worldcupDto.setRunnerup("aus");
		worldcupDto.setBestBowler("shami");
		worldcupDto.setYear(2023);
		
		
		WorldCupDto worldcupDto2=new WorldCupDto();
		worldcupDto2.setWinner("nz");
		worldcupDto2.setRunnerup("sl");
		worldcupDto2.setBestBowler("jaddu");
		worldcupDto2.setYear(2022);
		
		
		WorldCupDto worldcupDto3=new WorldCupDto();
		worldcupDto3.setWinner("sa");
		worldcupDto3.setRunnerup("aus");
		worldcupDto3.setBestBowler("ashwin");
		worldcupDto3.setYear(2022);
		word.validateDto(worldcupDto);
		word.validateDto(worldcupDto2);
		word.validateDto(worldcupDto3);
		
		
		
		
	}

}
