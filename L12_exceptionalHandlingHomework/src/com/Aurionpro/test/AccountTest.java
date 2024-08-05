package com.Aurionpro.test;

import com.Aurionpro.Model.*;
import java.util.*;

public class AccountTest {
	  public static void main(String[] args) {
	  
		  Scanner scanner = new Scanner(System.in);
		 try { 
		  while(true)
		  {
			  System.out.println("select type of account 1.CurrentAccount 2.SavingAccount.3.Exit");
			  int choice =scanner.nextInt();
			  
			  if(choice !=1&&choice !=2&& choice!=3)
			  {
				  System.out.println("enter valid Input ");
				  continue;
			  }
			  if(choice ==1)
			  {
				  CurrentAccount currentaccount = new CurrentAccount(12345,"Subodh",100000,5000);
				  double balance =currentaccount.getBalance();
				  currentaccount.setOverDraftLimit( (balance * 0.10));
				  System.out.println("Your Balance is "+balance);
				  System.out.println("your overdraft limit is "+ currentaccount.getOverDraftLimit());
				  currentaccount.getMenu(scanner,currentaccount);
			  }
			  if(choice==2)
			  {
				  SavingAccount savingaccount =new SavingAccount(2345,"Rahul",20000,2000);
				  double balance =savingaccount.getBalance();
				  System.out.println("Your Balance is "+balance);
				  System.out.println("your Minimum Balance limit is "+ savingaccount.getMinBalance());
				  getChoice(scanner,savingaccount);
			  }
			  if(choice==3)
			  {
				  System.out.println("Thank you for using our service");
				  break;
			  }
			    
		  }		
		 }
		 catch(ArithmeticException exception)
		 {
			 System.out.println("Number2 cant be zero.");
		 }
		 catch(ArrayIndexOutOfBoundsException exception)
		 {
			 System.out.println("Plzz enter all input.");
		 }
		 catch(NumberFormatException exception)
		 {
			 System.out.println("enter integer only");
		 }
		 catch( InputMismatchException exception)
		 {  
			 System.out.println("Enter valid Input.");
			 AccountTest.main(args);
			
		 }
		 catch(Exception exception )
		 {
			 System.out.println("Something Went Wrong ." + exception);
		 }
		 
	}

	private static void getChoice(Scanner scanner, SavingAccount savingaccount) {
		System.out.println("select 1.deposit 2.withdraw 3.checkBalance 4.exit");
		int choice2=scanner.nextInt();
		if(choice2!=1 &&choice2!=2&&choice2!=3&&choice2!=4)
		{
			System.out.println("enter valid choice.");
			getChoice(scanner ,savingaccount);
		}
		if(choice2==1)
		{
			savingaccount.deposit();
			getChoice(scanner ,savingaccount);
		}
		if(choice2==2)
		{
			savingaccount.withdraw();
			getChoice(scanner ,savingaccount);
		}
		if(choice2==3)
		{
			System.out.println("Your balance is "+savingaccount.getBalance()); 
			getChoice(scanner ,savingaccount);
		}
		if(choice2==4)
		{
			return;
		}				
	}
}

