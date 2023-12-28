package com.xorkz.validation.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ExamApplication {
	
	private String ApplicationId;
	private String email;
	private int password;
	private String contactNumber;
	private String modeOfExam;

}
