package com.aurionpro.creational.factory.test;
import com.aurionpro.creational.factory.model.*;

public class IAccountTest {
public static void main(String[] args) {
	
	AccountFactory accountType = new AccountFactory();
	IAccount account = accountType.createSavingAccount(123,"Subodh",10000, 1000, Accounts.CURRENTACCOUNT);
	
	account.credit(1000);
	
    IAccount account2 = accountType.createCurrentAccount(123,"Subodh",10000, 1000, Accounts.CURRENTACCOUNT);
	
	account2.credit(1000);
	
	
}
}
