package com.fdmgroup.bank.model;

import java.util.HashMap;
import java.util.Map;

public class Bank {

	private String name;
	private Address address;
	private String sortCode;
	private Map<Integer, DefaultBankAccount> accounts = new HashMap<>();	

	public Bank(String name, Address address, String sortCode) {
		super();
		this.name = name;
		this.address = address;
		this.sortCode = sortCode;
		
	}

	public void addAccount(DefaultBankAccount account) {
		accounts.put(account.getAccountNumber(), account);
	}

	// TODO a method to remove an account - needs a loop with an array

	public BankAccount removeAccount(BankAccount account) {
		return accounts.remove(account.getAccountNumber());
		
	}

	public Map<Integer, DefaultBankAccount> getAccounts() {
		return accounts;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getSortCode() {
		return sortCode;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", address=" + address + ", sortCode=" + sortCode + ", accounts=" + accounts
				+ "]";
	}

}
