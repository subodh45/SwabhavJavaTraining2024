package com.Aurionpro.Inheritance;

public class SavingAccount extends Account {

	private int minBalance;

	public SavingAccount(int accountNumber, String name, double balance, int minBalance) {
		super(accountNumber, name, balance);
		this.minBalance = minBalance;
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "SavingAccount [minBalance = " + minBalance + " "+ super.toString() + "]";
	}
	
	
}
