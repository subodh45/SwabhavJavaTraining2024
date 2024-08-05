package com.Aurionpro.Model;

import java.util.Scanner;

public class Account {
    Scanner scanner =new Scanner(System.in);
	private int accountNumber;
	private String name;
	private double balance;
	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance ;
	}
	
	public void deposit() {
		
		System.out.println("enter account to be added ");
		double deposit = scanner.nextInt();
		
		if(deposit<=0) {
			System.out.println("Enter valid input");
			return;
		}
		this.setBalance(this.getBalance()+deposit);
		System.out.println("Amount Deposite Succefully. "+"\n"+"Updated balance is "+this.getBalance());
	}
		
	public void deposit(double amount) {
		try {
			if(amount<=0)
				throw new NegativeAmountException();
		    this.setBalance(this.balance + amount);
		    System.out.println("deposit added succefully.");
		    System.out.println("updated balance is "+this.getBalance());
		}
		catch(NegativeAmountException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
	
	public void withdraw(double amount) {
		try {
			if(amount <=0)
				throw new NegativeAmountException();
			if (this.getBalance() < amount)
			{	
				throw new InsufficientFundsException();
			}
			this.setBalance(this.getBalance() - amount);

			System.out.println("Amount withdraw Succefully .");
			System.out.println("updated balance is " + this.getBalance());
		} 
		catch(InsufficientFundsException exception) {
			System.out.println(exception.getMessage());
		}
		catch(NegativeAmountException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}
