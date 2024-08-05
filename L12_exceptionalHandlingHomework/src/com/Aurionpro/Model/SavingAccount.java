package com.Aurionpro.Model;
import com.Aurionpro.Model.MinimumBalanceException;

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

	public String toString() {
		return "SavingAccount [minBalance = " + minBalance + " "+ super.toString() + "]";
	}
	
	public void withdraw()
	{
		System.out.println("enter account to be withdraw ");
		double withdraw = scanner.nextInt();
		
		if(withdraw <=0 || withdraw >this.getBalance())
		{
			System.out.println("Enter valid input");
			return;
		}
		try {
		if( (this.getBalance()-withdraw) <this.getMinBalance())
		{
			throw new MinimumBalanceException();
		
		}}
		catch(MinimumBalanceException exception)
		{
			System.out.println(exception.getMessage());
			return;
		}
		
		this.setBalance(this.getBalance()-withdraw);
		System.out.println("Amount Withdraw Succefully. "+"\n"+"Updated balance is "+this.getBalance());
	}
	
}
