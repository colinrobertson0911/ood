package com.fdmgroup.bank.model;

import java.math.BigDecimal;

public class DefaultCurrentAccount extends DefaultBankAccount implements CurrentAccount {

	public static final String ACCOUNT_NAME = "Current Account";

	private BigDecimal overdraft;

	public DefaultCurrentAccount(Customer customer, BigDecimal balance) {
		super(customer, balance);
		this.overdraft = new BigDecimal("0");

	}

	public DefaultCurrentAccount(Customer customer, BigDecimal balance, BigDecimal overdraft) {
		super(customer, balance);
		this.overdraft = overdraft;
	}

	@Override
	public boolean debit(BigDecimal funds) {
		boolean result = true;
		BigDecimal a = balance.add(overdraft);
		BigDecimal b = a.subtract(funds);
		int c = b.signum();
		System.out.println("");
		if (c < 0) {
			result = false;
		} else {
			System.out.println("Debit withdrawn from acount with " + balance + " and an overdraft of " + overdraft);
			balance = balance.subtract(funds);
		}
		return result;

	}

	public BigDecimal getOverdraft() {
		return overdraft;
	}

	public boolean setOverdraft(BigDecimal newOverdraft) {
		boolean result = true;
		if (balance.signum() == -1) {
			if (balance.add(newOverdraft).signum() < 0) {
				result = false;
			} else {
				this.overdraft = newOverdraft;
			}

		}
		return result;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overdraft=" + overdraft + ", toString()=" + super.toString() + "]";
	}

}
