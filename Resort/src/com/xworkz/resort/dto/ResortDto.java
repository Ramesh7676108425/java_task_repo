package com.xworkz.resort.dto;

public class ResortDto {

	private String id;
	private String name;
	private String email;
	private int contactNumber;
	private String address;
	private String review;

	public ResortDto() {
		System.out.println("no args constructor");
	}

	public ResortDto(String id, String name, String email, int contactNumber, String address, String review) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
		this.review = review;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String toString() {
		return "ResortDto[id=" + id + ", name=" + name + ", email=" + email + ",contactNumber=" + contactNumber + ", address=" +address +",review=" + review +"]";
	}

}
