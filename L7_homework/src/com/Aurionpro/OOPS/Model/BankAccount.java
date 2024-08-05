package com.Aurionpro.OOPS.Model;

public class BankAccount {

	private long accountNumber;
	private String name;
	private double balance;
	
	public BankAccount()
	{}
	
	public BankAccount(long accountNumber,String name,double balance)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}
	
	public long getAccountNumber()
	{
	    return this.accountNumber;	
	}
	
	public String getName()
	{
	    return this.name;	
	}
	
	public double getBalance()
	{
	    return this.balance;	
	}
		
	public void setAccountNumber(long a)
	{
	     this.accountNumber =a;	
	}
	
	public void setName(String name1)
	{
	     this.name =name1;	
	}
	
	public void setBalance(double b)
	{
	     this.balance =b;	
	}
	
	public void deposit(int amount)
	{
			double newbalance = this.balance +amount;
			setBalance(newbalance);
			System.out.println("Amount Deposited Successfully. ");
			System.out.println("New Balance is "+ getBalance());  
		
	}
	
	public void withdraw(double withdraw)
	{
			double newbalance2 = this.balance - withdraw;
			setBalance(newbalance2);
			System.out.println("Amount Withdraw Successfully. ");
			System.out.println("New Balance is "+ getBalance());  
		
	}
}
