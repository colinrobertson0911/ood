package com.fdmgroup.serialization;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Customer {
	private Address address;
	private String firstName;
	private String secondName;
	@JsonIgnore
	LocalDate dateOfBirth;

	public Customer(Address address, String firstName, String secondName, LocalDate dateOfBirth) {
		super();
		this.address = address;
		this.firstName = firstName;
		this.secondName = secondName;
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Customer [address=" + address + ", firstName=" + firstName + ", secondName=" + secondName
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

}
