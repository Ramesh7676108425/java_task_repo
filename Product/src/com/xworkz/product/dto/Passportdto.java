package com.xworkz.product.dto;

import java.sql.Date;

public class Passportdto {
	
private String	username;
	 private Date dateOfBirth;
 private String	gender;
 private Date Regdate;
 private String CurrentAddress;
 private String PermanentAddress;
 private String OfficeLocation;
 private int age;
 private int ApplicationId;
private int contactNumber;
private String	PaymentOption;
private String	email;

public Passportdto() {
	
	System.out.println("no args constructor");
	
}

public Passportdto(String username, Date dateOfBirth, String gender, Date regdate, String currentAddress,
		String permanentAddress, String officeLocation, int age, int applicationId, int contactNumber,
		String paymentOption, String email) {
	super();
	this.username = username;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	Regdate = regdate;
	CurrentAddress = currentAddress;
	PermanentAddress = permanentAddress;
	OfficeLocation = officeLocation;
	this.age = age;
	ApplicationId = applicationId;
	this.contactNumber = contactNumber;
	PaymentOption = paymentOption;
	this.email = email;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Date getRegdate() {
	return Regdate;
}

public void setRegdate(Date regdate) {
	Regdate = regdate;
}

public String getCurrentAddress() {
	return CurrentAddress;
}

public void setCurrentAddress(String currentAddress) {
	CurrentAddress = currentAddress;
}

public String getPermanentAddress() {
	return PermanentAddress;
}

public void setPermanentAddress(String permanentAddress) {
	PermanentAddress = permanentAddress;
}

public String getOfficeLocation() {
	return OfficeLocation;
}

public void setOfficeLocation(String officeLocation) {
	OfficeLocation = officeLocation;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getApplicationId() {
	return ApplicationId;
}

public void setApplicationId(int applicationId) {
	ApplicationId = applicationId;
}

public int getContactNumber() {
	return contactNumber;
}

public void setContactNumber(int contactNumber) {
	this.contactNumber = contactNumber;
}

public String getPaymentOption() {
	return PaymentOption;
}

public void setPaymentOption(String paymentOption) {
	PaymentOption = paymentOption;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Passportdto [username=" + username + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", Regdate="
			+ Regdate + ", CurrentAddress=" + CurrentAddress + ", PermanentAddress=" + PermanentAddress
			+ ", OfficeLocation=" + OfficeLocation + ", age=" + age + ", ApplicationId=" + ApplicationId
			+ ", contactNumber=" + contactNumber + ", PaymentOption=" + PaymentOption + ", email=" + email + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ApplicationId;
	result = prime * result + ((CurrentAddress == null) ? 0 : CurrentAddress.hashCode());
	result = prime * result + ((OfficeLocation == null) ? 0 : OfficeLocation.hashCode());
	result = prime * result + ((PaymentOption == null) ? 0 : PaymentOption.hashCode());
	result = prime * result + ((PermanentAddress == null) ? 0 : PermanentAddress.hashCode());
	result = prime * result + ((Regdate == null) ? 0 : Regdate.hashCode());
	result = prime * result + age;
	result = prime * result + contactNumber;
	result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((gender == null) ? 0 : gender.hashCode());
	result = prime * result + ((username == null) ? 0 : username.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Passportdto other = (Passportdto) obj;
	if (ApplicationId != other.ApplicationId)
		return false;
	if (CurrentAddress == null) {
		if (other.CurrentAddress != null)
			return false;
	} else if (!CurrentAddress.equals(other.CurrentAddress))
		return false;
	if (OfficeLocation == null) {
		if (other.OfficeLocation != null)
			return false;
	} else if (!OfficeLocation.equals(other.OfficeLocation))
		return false;
	if (PaymentOption == null) {
		if (other.PaymentOption != null)
			return false;
	} else if (!PaymentOption.equals(other.PaymentOption))
		return false;
	if (PermanentAddress == null) {
		if (other.PermanentAddress != null)
			return false;
	} else if (!PermanentAddress.equals(other.PermanentAddress))
		return false;
	if (Regdate == null) {
		if (other.Regdate != null)
			return false;
	} else if (!Regdate.equals(other.Regdate))
		return false;
	if (age != other.age)
		return false;
	if (contactNumber != other.contactNumber)
		return false;
	if (dateOfBirth == null) {
		if (other.dateOfBirth != null)
			return false;
	} else if (!dateOfBirth.equals(other.dateOfBirth))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (gender == null) {
		if (other.gender != null)
			return false;
	} else if (!gender.equals(other.gender))
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}




}
