package com.fdmgroup.compare;

import java.security.InvalidParameterException;
import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	private int id;
	private String firstName;
	private String secondName;
	LocalDate dateOfBirth;

	public Customer(int id, String firstName, String secondName, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public int compareTo(Customer other) {
		if (other == null) {
			throw new InvalidParameterException("Other Customer in compareTo was null");
		}

		return this.id - other.id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Customer [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", dateOfBirth="
				+ dateOfBirth + "]";
	}

}
