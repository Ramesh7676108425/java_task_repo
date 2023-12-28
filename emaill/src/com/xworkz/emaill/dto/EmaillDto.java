package com.xworkz.emaill.dto;

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
public class EmaillDto {
	
	
	private String firstName;
	private String lastName;
    private String middleName;
    private double contactNumber;
    private String userName;
    private int password;
    private String gender;
    private String address;
    private String accountType;
}
