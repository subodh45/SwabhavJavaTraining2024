package com.Aurionpro.InheritanceTest;
import com.Aurionpro.Inheritance.*;

public class AccountTest {
  public static void main(String[] args) {
	
	  CurrentAccount currentaccount = new CurrentAccount(12345,"Subodh",100.2,88);
	  
	  SavingAccount savingaccount =new SavingAccount(2345,"Rahul",2208.2,2000);
	  
	  
	  System.out.println(currentaccount.toString());
	  System.out.println(savingaccount.toString());
}
}
