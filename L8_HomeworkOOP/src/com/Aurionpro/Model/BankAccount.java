package com.Aurionpro.Model;


public class BankAccount {

	private long accountNumber;
	private String name;
	private double balance;
	private String accountType;
	
	public BankAccount()
	{}
	
	public BankAccount(long accountNumber,String name,double balance,String accountType)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
		this.accountType=accountType;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public void deposite(int amount)
	{    setBalance(this.balance+amount);
		
		System.out.println("Money Added Successfully ");
		System.out.println("Updated balance is "+ getBalance());
	}
	
	public void withdraw(double withdraw)
	{
			double newbalance2 = this.balance - withdraw;
			setBalance(newbalance2);
			System.out.println("Amount Withdraw Successfully. ");
			System.out.println("Updated Balance is "+ getBalance());  
		
	}

	
}
