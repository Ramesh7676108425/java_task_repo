package com.xworkz.annualday.dto;

import java.util.Date;

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
public class AnnualDayDto {
	private String centerName;
	private Date date;
	private String venue;
	private String theam;
	private float budget;
	private String guest;
	
	
	

}
