package com.aurionpro.behaviour.observer.model;
import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountnumber;
	private String name;
	private double balance;
	private List<INotify> notifiers ;
	
	public Account(int accountnumber, String name, double balance, List<INotify> notifiers) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = notifiers;
		
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
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

	public List<INotify> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotify> notifiers) {
		this.notifiers = notifiers;
	}
	

	public void deposit(double amount) {
		try {
			if(amount<=0)
				throw new NegativeAmountException();
		    this.setBalance(this.balance + amount);
		    System.out.println("deposit added succefully.");
		    System.out.println("updated balance is "+this.getBalance());
		    
		    notifiers.forEach((notifier) -> notifier.notify(this, "deposit"));
		    
		}
		catch(NegativeAmountException exception)
		{   
			notifiers.forEach((notifier) -> notifier.notify(this, "NegativeAmountException"));
			
		}
	}

	public void withdraw(double amount) {
		//try {
			if(amount <=0)
				throw new NegativeAmountException();
			if (this.getBalance() < amount)
			{	
				throw new InsufficientFundsException();
			}
			this.setBalance(this.getBalance() - amount);

			System.out.println("Amount withdraw Succefully .");
			System.out.println("updated balance is " + this.getBalance());
			
			notifiers.forEach((notifier) -> notifier.notify(this, "withdraw"));
		//} 
//		catch(InsufficientFundsException exception) {
//			//notifiers.forEach((notifier) -> notifier.notify(this, "InsufficientFundsException"));
//		}
//		catch(NegativeAmountException exception)
//		{
//			//notifiers.forEach((notifier) -> notifier.notify(this, "NegativeAmountException"));
//		}
	}
	
}
