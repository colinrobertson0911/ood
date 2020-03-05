package com.fdmgroup.bank.model;

public class Address {
	private String houseNumber;
	private String street;
	private String city;
	private String county;
	private String postCode;

	// Default constructor
	// public Address() {
	// }
	// Custom constructor
	public Address(String houseNumber, String street, String city, String county, String postCode) {
		this(houseNumber, street, city, postCode);
		this.county = county;
	}

	public Address(String houseNumber, String street, String city, String postCode) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", county=" + county
				+ ", postCode=" + postCode + "]";
	}

}
