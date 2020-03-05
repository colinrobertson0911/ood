package com.fdmgroup.bank.model;

import java.math.BigDecimal;

public interface BankAccount {

	BigDecimal credit(BigDecimal funds);

	boolean debit(BigDecimal funds);

	Customer getCustomer();

	Integer getAccountNumber();

	BigDecimal getBalance();

}