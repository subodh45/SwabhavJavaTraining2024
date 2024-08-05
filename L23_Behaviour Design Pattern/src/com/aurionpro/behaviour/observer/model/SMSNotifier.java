package com.aurionpro.behaviour.observer.model;

public class SMSNotifier implements INotify{

	@Override
	public void notify(Account account,String operation) {
		if(operation.equals("deposit")) {
		System.out.println(" debit sms message, new Balance is  "+ account.getBalance());
		return;
		}
		if(operation.equals("NegativeAmountException")) {
			Exception exception = new NegativeAmountException() ;
			System.out.println("sms message "+exception.getMessage());
			return;
		}
		if(operation.equals("InsufficientFundsException")) {
			Exception exception = new InsufficientFundsException() ;
			System.out.println("sms message "+exception.getMessage());
			return;
		}
		
		System.out.println(" credit sms message, new Balance is  "+ account.getBalance());
	}

	
	
}
