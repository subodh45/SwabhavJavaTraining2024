package com.aurionpro.creational.factory.model;

public class SavingAccount implements IAccount{
 
	int accountNumber;
	String name ;
	int balance ;
	int minBalance;
	
	
	
	
	public SavingAccount(int accountNumber, String name, int balance,int minBalance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.minBalance= minBalance;
		
	}

	
	
	public int getMinBalance() {
		return minBalance;
	}



	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
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



	


	@Override
	public void credit(int amount) {
		 this.setBalance((this.getBalance() + amount ));
		 System.out.println("Amount credited "+ " New Balnce is "+ this.getBalance());
		
	}

	@Override
	public void debit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("account debited in saving account");
	}

}
