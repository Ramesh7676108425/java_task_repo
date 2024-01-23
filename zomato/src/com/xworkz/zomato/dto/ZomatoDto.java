package com.xworkz.zomato.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor



public class ZomatoDto {
	
	private String customerName;
	private long contactNumber;
	private String email;
	private String foodItemName;
	private int costOfFoodItem;
	
	

}
