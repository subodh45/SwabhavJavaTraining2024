package com.aurionpro.creational.factory.model;

public class AccountFactory {

	public IAccount createSavingAccount(int accountNumber,String name ,int balance ,int minBalance,Accounts AccountType)
	{
		IAccount account = new SavingAccount ( accountNumber, name ,balance ,minBalance);	
		return account;
		
	}
	
	public IAccount createCurrentAccount(int accountNumber,String name ,int balance ,int overDraftLimit,Accounts AccountType)
	{
		IAccount account = new CurrentAccount ( accountNumber, name ,balance ,overDraftLimit);	
		return account;
		
	}
}


