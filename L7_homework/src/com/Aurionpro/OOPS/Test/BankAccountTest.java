package com.Aurionpro.OOPS.Test;
import java.util.Scanner;

import com.Aurionpro.OOPS.Model.*;

public class BankAccountTest {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   
	   BankAccount bankAccount = new BankAccount();
	   
	   /*System.out.println("enter acc number :");
	   long a =sc.nextLong();
	   bankAccount.setAccountNumber(a);*/
	   
	   bankAccount.setAccountNumber(12345678910L);
	   bankAccount.setName("Subodh");
	   bankAccount.setBalance(200000);
	   
	   System.out.println("Your Information: ");
	   System.out.println("Name : "+ bankAccount.getName());
	   System.out.println("Account number  : "+ bankAccount.getAccountNumber());
	   System.out.println("Balance : "+ bankAccount.getBalance());
	   
	   while(true)
	   {
		   System.out.println("choose 1.deposit 2.Withdraw 3.checkBalance 4.exit ");
		   int choice=sc.nextInt();
		   
		   switch(choice)
		   {
		    case 1: System.out.println("Enter amount to be Deposited ");
		            int amount =sc.nextInt();
		           
		            if(amount <=0)
		   		    {
		   		    	System.out.println("ENter valid amount.");
		   		    }else
		   		    {
		   		        bankAccount.deposit(amount);
		   		    }
		            break;
			   
		    case 2: System.out.println("Enter amount to be withdraw :");
		            double withdraw =sc.nextDouble();
		            double accBalance = bankAccount.getBalance();
		            System.out.println("balnce "+ accBalance);
		            
		            if(withdraw <=0 || withdraw >accBalance )
		   		    {
		   		    	System.out.println("ENter valid amount.");
		   		    }else
		   		    {
		   		        bankAccount.withdraw(withdraw);
		   		    }
		            break;
			   
		    case 3:  double balance = bankAccount.getBalance();
		             System.out.println("Balance : "+ balance);
		              break;
			   
		    case 4:  System.exit(0);
		             break;
		   
		    default : System.out.println("Invalid Input.");
		   }
		   
	   }
	   
	   
}
}
