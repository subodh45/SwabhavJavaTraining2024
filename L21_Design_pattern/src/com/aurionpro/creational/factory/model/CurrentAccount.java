package com.aurionpro.creational.factory.model;

public class CurrentAccount implements IAccount {

	int accountNumber;
	String name ;
	int balance ;
	int overDraftLimit;

	
	
	public CurrentAccount(int accountNumber, String name, int balance, int overDraftLimit) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.overDraftLimit = overDraftLimit;
	}

	
	
	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public int getOverDraftLimit() {
		return overDraftLimit;
	}



	public void setOverDraftLimit(int overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}



	@Override
	public void credit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount credited in CurrentAccount ");
	}

	@Override
	public void debit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount debited in currentAccount");
	}

}
