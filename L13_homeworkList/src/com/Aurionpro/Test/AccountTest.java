package com.Aurionpro.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.Aurionpro.model.*;

public class AccountTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Account>accounts = new ArrayList<Account>();

		try {
			System.out.println("enter number of acoount ");
			int numberOfAccount =scanner.nextInt();
			
			addAccount(accounts,numberOfAccount,scanner);
            printAccount(accounts);
		
		    sortAccountList(accounts);
		    System.out.println("After Sorting Accounts based on their balance ");
		    printAccount(accounts);
		    
		    Account maxBalanceAccount=accounts.get(0);
		    System.out.println("maximum balance is "+maxBalanceAccount.getBalance());
		    
		    
		
		} catch (Exception exception) {
			System.out.println("Error occur " + exception);
		}
	}

	private static void sortAccountList(List<Account> accounts) {
	  
	   for(int i=0;i<accounts.size();i++)
	   {   Account maxBalanceAccount=accounts.get(i);
	       double maxBalance = maxBalanceAccount.getBalance();
	      for(int n=i+1;n<accounts.size();n++)
	      {  Account account=accounts.get(n);
	         double balance = account.getBalance();
	      
	         if(balance >maxBalance)
	         {
	    	  Account temp=account;
	    	  accounts.set(i, account);
	    	  accounts.set(n,maxBalanceAccount);
	    	  i--; 
	    	  break;
	          }   
	   }
	   }
		
	}

	private static void printAccount(List<Account> accounts) {
		for(Account account:accounts)
		{
			System.out.println(account);
		}
		
	}

	private static void addAccount(List<Account>accounts,int numberOfAccount,Scanner scanner) {
		for(int n=1;n<=numberOfAccount;n++)
		{
		System.out.println("enter account number "+(n)+" Account");
		int accountNumber = scanner.nextInt();

		System.out.println("enter name of "+(n)+" Account");
		String name = scanner.next();

		System.out.println("enter balance of"+(n)+" Account");
		double balance = scanner.nextDouble();

		accounts.add( new Account(accountNumber, name, balance));
		}
		
	}
}

