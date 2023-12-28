package com.xworkz.accountdetails.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AccountDetailsDto {
	
	
	private String name;
	private String email;
	private String AccontNumber;
	private String address;
	private double contactNumber;
	private String branchCode;
	

}
