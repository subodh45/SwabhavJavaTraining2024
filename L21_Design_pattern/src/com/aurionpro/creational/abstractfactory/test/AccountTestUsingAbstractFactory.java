package com.aurionpro.creational.abstractfactory.test;
import com.aurionpro.creational.abstractfactory.model.*;

public class AccountTestUsingAbstractFactory {
public static void main(String[] args) {
	
	IAccountFactory accountFactory;
	accountFactory = new SavingAccountFactory();
	
  SavingAccount account	=  (SavingAccount) accountFactory.getAccount(1234,"Subidh",1000, 100);
  
  account.credit();
  account.debit();
  
}
}
