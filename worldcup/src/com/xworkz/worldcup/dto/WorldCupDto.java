package com.xworkz.worldcup.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class WorldCupDto {
	
	
	private String host;
	private int year;
	private String winner;
	private String runnerup;
	private String bestBowler;
	public String getHost() {
		// TODO Auto-generated method stub   
		return null;
	}
	

}
