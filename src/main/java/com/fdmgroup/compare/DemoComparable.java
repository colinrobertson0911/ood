package com.fdmgroup.compare;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoComparable {

	public static void main(String[] args) {
		Customer david = new Customer(3, "David", "Cuthill", LocalDate.of(2000, 10, 1));
		Customer june = new Customer(1, "June", "McPake", LocalDate.of(2001, 1, 21));
		Customer colin = new Customer(2, "Colin", "Robertson", LocalDate.of(1998, 2, 28));
		Customer colin2 = new Customer(2, "Colin", "Bobertson", LocalDate.of(1998, 2, 28));
		
		List<Customer> allCustomers = new ArrayList<>();
		allCustomers.add(david);
		allCustomers.add(june);
		allCustomers.add(colin);
		allCustomers.add(colin2);
		
		//Demo Comparable		
		printCustomers(allCustomers);
		Collections.sort(allCustomers);
		printCustomers(allCustomers);
		
		//Demo comparator
		Collections.reverse(allCustomers);
		CustomerComparatorById customerComparatorById = new CustomerComparatorById();
		Collections.sort(allCustomers, customerComparatorById);
		printCustomers(allCustomers);
		
		Collections.reverse(allCustomers);
		CustomerComparatorByIdAndName customerComparatorByIdAndName = new CustomerComparatorByIdAndName();
		Collections.sort(allCustomers, customerComparatorByIdAndName);
		printCustomers(allCustomers);
		
	}
	
	public static void printCustomers(Collection<Customer> customers) {
		System.out.println("\n---------------");
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
	

}
