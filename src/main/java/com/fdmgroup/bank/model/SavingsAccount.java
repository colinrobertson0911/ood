package com.fdmgroup.bank.model;

import java.math.BigDecimal;

public interface SavingsAccount {
	
	public abstract BigDecimal addInterest (BigDecimal amount);
}
