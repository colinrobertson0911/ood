package com.fdmgroup.compare;

import java.util.Comparator;

public class CustomerComparatorById implements Comparator<Customer> {

	@Override
	public int compare(Customer customerOne, Customer customerTwo) {
		if (customerOne == null) {
			return -1;
		}
		if (customerTwo == null) {
			return -1;
		}
		return customerOne.getId() - customerTwo.getId();
	}
	
}
