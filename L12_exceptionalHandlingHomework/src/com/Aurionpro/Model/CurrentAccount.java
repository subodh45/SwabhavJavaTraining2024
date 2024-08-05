package com.Aurionpro.Model;
import com.Aurionpro.Model.OverdraftLimitExceededException;
import java.util.Scanner;

import com.Aurionpro.Model.Account;

public class CurrentAccount extends Account {
	   
	Scanner scanner=new Scanner(System.in);
	private double overDraftLimit;

	public CurrentAccount(int accountNumber, String name, double balance,double overDraftLimit) {
		super(accountNumber,name,balance);
		this.overDraftLimit=overDraftLimit;	
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overDraftLimit=" + overDraftLimit +" " + super.toString() + "]";
	}

	public void getMenu(Scanner scanner, CurrentAccount currentaccount) {
		System.out.println("select 1.deposit 2.withdraw 3.checkBalance 4.exit");
		int choice2=scanner.nextInt();
		if(choice2!=1 &&choice2!=2&&choice2!=3&&choice2!=4)
		{
			System.out.println("enter valid choice.");
			getMenu(scanner ,currentaccount);
		}
		if(choice2==1)
		{
			currentaccount.deposit();
			getMenu(scanner ,currentaccount);
		}
		if(choice2==2)
		{
			currentaccount.withdraw();
			getMenu(scanner ,currentaccount);
		}
		if(choice2==3)
		{
			System.out.println(currentaccount.getBalance()); 
			getMenu(scanner ,currentaccount);
		}
		if(choice2==4)
		{
			return;
		}	
		
	}

	public void withdraw()
	{
		System.out.println("enter account to be withdraw ");
		double withdraw = scanner.nextInt();
		double withdrawAmount=0;
		
		if(withdraw <=0 )
		{
			System.out.println("Enter valid input");
			return;
		}
		try {
		if( withdraw >(this.getOverDraftLimit()+this.getBalance())|| withdrawAmount > (this.getOverDraftLimit()+this.getBalance()))
		{
			throw new OverdraftLimitExceededException();
		}
		}
		catch(OverdraftLimitExceededException exception2)
		{
			System.out.println(exception2.getMessage());
			return;
		}
		this.setBalance(this.getBalance()-withdraw);
		System.out.println("Amount Withdraw Succefully. "+"\n"+"Updated balance is "+this.getBalance());
		withdrawAmount= withdrawAmount+withdraw;
		
		System.out.println(" overdraftLimit is "+ this.getOverDraftLimit());
	}			
}
