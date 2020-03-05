package com.fdmgroup.compare;

import java.util.Comparator;

public class CustomerComparatorByIdAndName implements Comparator<Customer> {

	@Override
	public int compare(Customer customerOne, Customer customerTwo) {
		if (customerOne == null) {
			return -1;
		}
		if (customerTwo == null) {
			return -1;
		}
		int idComparison = customerOne.getId() - customerTwo.getId();
		if (idComparison != 0) {
			return idComparison;
		}
			
		return customerOne.getSecondName().compareTo(customerTwo.getSecondName());
	}
}
