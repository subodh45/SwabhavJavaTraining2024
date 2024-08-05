package com.aurionpro.creational.abstractfactory.model;

import java.util.Scanner;

public class CurrentAccount implements IAccount {
    Scanner scanner;
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
	public void credit() {
		scanner = new Scanner(System.in);
		System.out.println("enter account to be added ");
		double deposit = scanner.nextDouble();
		
		if(deposit<=0) {
			System.out.println("Enter valid input");
			return;
		}
		this.setBalance((int) (this.getBalance()+deposit));
		System.out.println("Amount Deposite Succefully. "+"\n"+"Updated balance is "+this.getBalance());
	}
				
	@Override
	public void debit() {
		scanner = new Scanner(System.in);
		System.out.println("Amount credited in CurrentAccount ");
		System.out.println("enter account to be withdraw ");
		double withdraw = scanner.nextDouble();
		double withdrawAmount=0;
		
		if(withdraw <=0 )
		{
			System.out.println("Enter valid input");
			return;
		}

		if( withdraw >(this.getOverDraftLimit()+this.getBalance())|| withdrawAmount > (this.getOverDraftLimit()+this.getBalance()))
		{
			System.out.println("OverdraftLimit cross .");
			return;
		}
		
		
		this.setBalance((int)(this.getBalance()-withdraw));
		System.out.println("Amount Withdraw Succefully. "+"\n"+"Updated balance is "+this.getBalance());
		withdrawAmount= withdrawAmount+withdraw;
		
		System.out.println(" overdraftLimit is "+ this.getOverDraftLimit());
		System.out.println("Amount debited in currentAccount");
			
	}

}



