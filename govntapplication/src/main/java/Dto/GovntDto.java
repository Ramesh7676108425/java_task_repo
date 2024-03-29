package Dto;

import javax.persistence.Id;

import lombok.Data;

@Data
public class GovntDto {
	@Id
	private int id;
	private String name;
	private Long contactNumber;
	private String email;
	private int age;
	private String motherTounge;
	private String gender;
	private String maritalStatus;
	private String nationality;
	private String religion;
	private String address;
	

}
