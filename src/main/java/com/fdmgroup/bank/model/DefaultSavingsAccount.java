package com.fdmgroup.bank.model;

import java.math.BigDecimal;

public class DefaultSavingsAccount extends DefaultBankAccount implements SavingsAccount {

	public static final String ACCOUNT_NAME = "Savings Account";
	
		
	public DefaultSavingsAccount(Customer customer, BigDecimal balance) {
		super(customer, balance);
	}
	
	@Override
	public boolean debit(BigDecimal funds) {
			boolean result = true;
			if (balance.subtract(funds).signum() <= 0) {
				result = false;
			}else {
				balance = balance.subtract(funds);
			}
			return result;
	}
	
	public BigDecimal addInterest (BigDecimal amount) {
		balance = balance.add(amount);
		return balance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [toString()=" + super.toString() + "]";
	}
	
	
}
