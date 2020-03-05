package com.fdmgroup.bank.model;

import java.math.BigDecimal;

public interface CurrentAccount {

	BigDecimal getOverdraft();

	boolean setOverdraft(BigDecimal overdraft);

}