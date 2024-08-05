package com.aurionpro.creational.abstractfactory.model;

public class SavingAccountFactory implements IAccountFactory{

	@Override
	public SavingAccount getAccount(int accountNumber,String name ,int balance ,int minBalance) {
		
		SavingAccount account = new SavingAccount( accountNumber, name , balance , minBalance);
		return account;
	}

}
