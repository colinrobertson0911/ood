package com.fdmgroup.bank.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fdmgroup.bank.model.Address;
import com.fdmgroup.bank.model.Bank;
import com.fdmgroup.bank.model.BankAccount;
import com.fdmgroup.bank.model.DefaultBankAccount;
import com.fdmgroup.bank.model.DefaultCurrentAccount;
import com.fdmgroup.bank.model.Customer;
import com.fdmgroup.bank.model.DefaultSavingsAccount;
import com.fdmgroup.bank.model.SavingsAccount;

public class CustomerDemo {

	public static void main(String[] args ) {
		Address davidAddress = new Address 
				(" 1", " Main Street"," Gourock", " Inverclyde", " PA19 SGN");
		Customer david = new Customer(davidAddress, " David", " Cuthill", LocalDate.of( 1998, 4, 17));
		BankAccount davidBankAccount = new DefaultCurrentAccount(david, new BigDecimal("0.00"), new BigDecimal("0.00"));
		//System.out.println(davidBank);
		
		
		Address colinAddress = new Address 
				(" 26", " Cheviot Gardens", " Irvine", " North Ayrshire", " KA11 1GZ");
		Customer colin = new Customer(colinAddress, " Colin", " Robertson", LocalDate.of( 1976, 11, 18));
		BankAccount colinBankAccount = new DefaultSavingsAccount(colin,  new BigDecimal("567.89"));
		//System.out.println(colinBank);
		
		
		Address bankAddress = new Address(" 56", " Main Street", " Glasgow", " North Lanarkshire", " G2 4FG");
		Bank bank = new Bank(" BigBank", bankAddress, " 80-64-21");
		bank.addAccount((DefaultBankAccount) davidBankAccount);
		bank.addAccount((DefaultBankAccount) colinBankAccount);
		//System.out.println(bank);
		
		
		// Test Current account with overdraft
		System.out.println(DefaultCurrentAccount.ACCOUNT_NAME);
		System.out.println("");
		System.out.println("Old account balance = " + (davidBankAccount.getBalance()));
		davidBankAccount.credit(new BigDecimal("0.00"));
		System.out.println("New balance (after credit) = " + (davidBankAccount.getBalance()));

		
		//test debit
		boolean debitCurrentAccount = davidBankAccount.debit(new  BigDecimal("70.00"));
		if (!debitCurrentAccount ) {
			System.err.println("Not enough funds in the account.");
		}else {
			System.out.println("David new balance (after debit) = " + davidBankAccount.getBalance());
		}
		
		
		
		//Test savings account with added interest
		System.out.println("");
		System.out.println(DefaultSavingsAccount.ACCOUNT_NAME);
		System.out.println("");
		System.out.println("Colin's balance with interest = " + ((SavingsAccount) colinBankAccount).addInterest(new BigDecimal("21.23")));
		
		
//		//Test add accounts to bank
//		System.out.println("\n*** Add Bank Account Test ***");
//		
//		bank.removeAccount(colinBankAccount);
//		if (bank.getAccounts().size() == 1) {
//			System.out.println("Passed: removed second account");
//		}else {
//			System.err.println("Error removing account as size not = 1");
//		}
//		
//		bank.removeAccount(davidBankAccount);
//		if (bank.getAccounts().size() == 0) {
//			System.out.println("Passed: removed first account");
//		}else {
//			System.err.println("Error removing account as size not + 0");
//		}
//		
//		if (davidBankAccount.equals(colinBankAccount)) {
//			System.out.println("Accounts are equal");
//		}else {
//			System.out.println("Accounts are not equal");
//		}
		
	}

	
}
