package com.aurionpro.creational.abstractfactory.model;

import java.util.Scanner;

public class SavingAccount implements IAccount{
	 
	Scanner scanner;
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
	public void credit() {
		
		scanner = new Scanner(System.in);
		System.out.println("enter account to be added ");
		int amount = scanner.nextInt();
		
		System.out.println("balance is "+ this.getBalance());
		this.setBalance(this.getBalance() + amount);
		System.out.println("updated balance is "+ this.getBalance());		
	}

	@Override
	public void debit() {
		scanner = new Scanner(System.in);
		System.out.println("enter account to be withdraw ");
		int withdraw = scanner.nextInt();
		
		if(withdraw <=0 || withdraw >this.getBalance())
		{
			System.out.println("Enter valid input");
			return;
		}
		if( (this.getBalance()-withdraw) <this.getMinBalance())
		{
			System.out.println("Minimum balance condition is not satisflying.");
		    return;
		}
		
		
		this.setBalance((int)(this.getBalance()-withdraw));
		System.out.println("Amount Withdraw Succefully. "+"\n"+"Updated balance is "+this.getBalance());
	  
		System.out.println("amount debited in saving account");
	}

}

