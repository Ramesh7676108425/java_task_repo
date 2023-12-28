package com.xworkz.worldcup.repository;


import com.xworkz.worldcup.dto.WorldCupDto;

public abstract class WorldCupRepository {
	
	
	public abstract boolean onSave(WorldCupDto worldCupDto);

	//public abstract WorldCupDto[] read();
	}


