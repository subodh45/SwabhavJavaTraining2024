package com.Aurionpro.Test;
import com.Aurionpro.Model.*;
import java.util.*;

public class BankAccountTest {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("enter number of Account :");
	  int size = sc.nextInt();
	  
	  BankAccount bankAccounts[]=new BankAccount[size];
	  
	  for(int i=0;i<size;i++)
	  {
		  bankAccounts[i]=new BankAccount();
		  long AccountNumber =12322322232L;
		  bankAccounts[i].setAccountNumber((AccountNumber+i));
		  
		  System.out.println("ENter holder name :");
		  String name =sc.next();
		  bankAccounts[i].setName(name);
		  double balance;
		  if((i+1)%2==0)
		  {
		   balance = 200000 + (1000* (i+2));
		  }else
		  {
		       balance = 200000 - (1000* (i+2));  
		  }
		  bankAccounts[i].setBalance(balance);
		  bankAccounts[i].setAccountType("Saving");
	  }
	  
	/*  for(int i=0;i<size;i++)
	  {
		  System.out.println("Account No. :" + bankAccounts[i].getAccountNumber());
		  System.out.println("name :" + bankAccounts[i].getName());
		  System.out.println("Balance. :" + bankAccounts[i].getBalance());
		  System.out.println("Account Type. :" + bankAccounts[i].getAccountType());
		  System.out.println();
	  } */
	  
	  
	  for(int n=0;n<size;n++)
	  {
		  double maxBalance= bankAccounts[n].getBalance();
		  
		  for(int i=n+1;i<size;i++)
		  {
			  double balance= bankAccounts[i].getBalance();
			  
			  if(balance>maxBalance)
			  {
				  BankAccount temp = bankAccounts[i];
				  bankAccounts[i]=bankAccounts[n];
				  bankAccounts[n]=temp;
				  n--;
				  break;
			  }
			  else if(balance==maxBalance)
			  { 
				  BankAccount temp = bankAccounts[n+1];
				  bankAccounts[n+1]=bankAccounts[i];
				  bankAccounts[i]=temp;
				  i++;
				  
			  }
		  }
	  }
	  
	  System.out.println("After Sorting ");
	  for(int i=0;i<size;i++)
	  {
		  System.out.println("Account No. :" + bankAccounts[i].getAccountNumber());
		  System.out.println("name :" + bankAccounts[i].getName());
		  System.out.println("Balance. :" + bankAccounts[i].getBalance());
		  System.out.println("Account Type. :" + bankAccounts[i].getAccountType());
		  System.out.println();
	  }
	  
}
}
