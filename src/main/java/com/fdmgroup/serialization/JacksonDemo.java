package com.fdmgroup.serialization;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SequenceWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonDemo {
	
	static final String FILENAME = "./customer.json";
	static ObjectMapper mapper;

	public static void main(String[] args) {
		Address davidAddress = new Address(" 1", " Main Street", " Gourock", " Inverclyde", " PA19 SGN");
		Customer david = new Customer(davidAddress, " David", " Cuthill", LocalDate.of(1998, 4, 17));
		Address colinAddress = new Address(" 26", " Cheviot Gardens", " Irvine", " North Ayrshire", " KA11 1GZ");
		Customer colin = new Customer(colinAddress, " Colin", " Robertson", LocalDate.of(1976, 11, 18));
		
		List<Customer> allCustomers = new ArrayList<>();
		allCustomers.add(david);
		allCustomers.add(colin);

		mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
		writeToFile(FILENAME, allCustomers);
		readJsonFromFileToCustomer(FILENAME);
		

	}

	public static void writeToFile(String filename, List<Customer> customers) {
		try {
			
			// Write single object
			File jsonFile = new File(filename);
			SequenceWriter seqWriter = mapper.writer().writeValuesAsArray(jsonFile);
			for (Customer customer : customers) {
				seqWriter.write(customer);
			}
			seqWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Write " + customers.size() + " objects from JSON");
	}
	
	public static List<Customer> readJsonFromFileToCustomer(String filename){
		List<Customer> customers = new ArrayList<>();
		try {
			File jsonFile = new File(filename);
			customers = mapper.readValue(jsonFile, List.class);
			}catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println("Read " + customers.size() + " objects from JSON");
		return customers;
		
		
	}

}
