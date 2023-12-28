package com.xworkz.application.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class ApplicationDto {
	
	
	private String ApplicationId;
	private String email;
	private int password;
	private String contactNumber;
	private String modeOfExam;


}
