package com.aurionpro.behaviour.observer.model;

public class WssupNotifier implements INotify {

	@Override
	public void notify(Account account,String operation) {
		if(operation.equals("deposit")) {
			System.out.println(" debit wssup message, new Balance is  "+ account.getBalance());
			return;
		}
			System.out.println(" credit wssup message, new Balance is  "+ account.getBalance());
	}

}
