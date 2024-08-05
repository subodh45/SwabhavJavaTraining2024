package com.aurionpro.creational.abstractfactory.model;

public class CurrentAccountFactory implements IAccountFactory {
	

	@Override
	public IAccount getAccount(int accountNumber,String name ,int balance ,int minBalance) {
		
		IAccount account = new CurrentAccount( accountNumber, name , balance , minBalance);
		return account;
	}

}
