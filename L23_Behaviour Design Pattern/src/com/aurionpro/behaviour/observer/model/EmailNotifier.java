package com.aurionpro.behaviour.observer.model;

public class EmailNotifier implements INotify {

	@Override
	public void notify(Account account,String operation) {
		if(operation.equals("deposit")) {
			System.out.println(" debit email message, new Balance is  "+ account.getBalance());
			return;
		}
		if(operation.equals("NegativeAmountException")) {
			Exception exception = new NegativeAmountException() ;
			System.out.println("Email message "+ exception.getMessage());
			return;
		}
		if(operation.equals("InsufficientFundsException")) {
			Exception exception = new InsufficientFundsException() ;
			System.out.println("Email message "+ exception.getMessage());
			return;
		}
			System.out.println(" credit email message, new Balance is  "+ account.getBalance());
	}

	
}
