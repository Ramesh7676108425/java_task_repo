package com.xworkz.resort.abstracts;

import com.xworkz.resort.dto.ResortDto;

public abstract class Resort {
	
	public abstract boolean onsave(ResortDto  ResortDto );
	
	public abstract void read();
	
	public abstract void searchResortId(String id);

}
