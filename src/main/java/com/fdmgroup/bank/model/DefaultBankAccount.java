package com.fdmgroup.bank.model;

import java.math.BigDecimal;

public abstract class DefaultBankAccount implements BankAccount {
	private Customer customer;
	private Integer accountNumber;
	BigDecimal balance;
	private static int nextAccountNumber = 1;

	public DefaultBankAccount(Customer customer, BigDecimal balance) {
		super();
		this.customer = customer;
		this.balance = balance;
		this.accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}

	@Override
	public BigDecimal credit(BigDecimal funds) {
		balance = balance.add(funds);
		return balance;
	}
	
	@Override
	public abstract boolean debit(BigDecimal funds);
		 
	
	@Override
	public Customer getCustomer() {
		return customer;
	}

	@Override
	public Integer getAccountNumber() {
		return accountNumber;
	}

	@Override
	public BigDecimal getBalance() {
		return balance;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		DefaultBankAccount other = (DefaultBankAccount) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [customer=" + customer + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

}
