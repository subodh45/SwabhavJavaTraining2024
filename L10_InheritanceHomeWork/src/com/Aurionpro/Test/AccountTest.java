package com.Aurionpro.Test;
import com.Aurionpro.Model.*;
import java.util.*;

public class AccountTest {
	  public static void main(String[] args) {
	  
		  Scanner scanner = new Scanner(System.in);
		  
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
				  currentaccount.setOverDraftLimit(balance + (balance * 0.10));
				  System.out.println("your overdraft limit is "+ currentaccount.getOverDraftLimit());
				  currentaccount.getMenu(scanner,currentaccount);
			  }
			  if(choice==2)
			  {
				  SavingAccount savingaccount =new SavingAccount(2345,"Rahul",20000,2000);
				  getChoice(scanner,savingaccount);
			  }
			  if(choice==3)
			  {
				  System.out.println("Thank you for using our service");
				  break;
			  }
			    
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
			System.out.println(savingaccount.getBalance()); 
			getChoice(scanner ,savingaccount);
		}
		if(choice2==4)
		{
			return;
		}				
	}
}

