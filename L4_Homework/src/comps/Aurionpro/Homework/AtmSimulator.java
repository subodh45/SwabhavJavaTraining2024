package comps.Aurionpro.Homework;
import java.util.*;

public class AtmSimulator {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Welcome to Atm !!");
	  int balance =1000;
	  
	  while(true)
	  {
		  System.out.println("Atm Menu:");
		  System.out.println("1. Check Balance ");
		  System.out.println("2. Deposit Money ");
		  System.out.println("3. Withdraw Money ");
		  System.out.println("4. exit ");
		  int choice = sc.nextInt();
		  
		  switch(choice)
		  {
		  case 1: System.out.println("Your Balance is "+ balance);
		          break;
		  
		  case 2: System.out.println("Enter Amount to be Deposit: ");
		          int deposit = sc.nextInt();
		          balance = balance +deposit;
		          System.out.println("Your Balance is "+ balance);
		          break;
		  
		  case 3: System.out.println("Enter Amount to be Withdraw: ");
                  int withdraw = sc.nextInt();
                  if(balance > withdraw) {
                  balance = balance -withdraw;
                  System.out.println("Your Balance is "+ balance);
                         
                  }
                  else {
                	  System.out.println("Not sufficient balance");
                	  }
                  break;
                  
		  case 4: System.out.println("Thank you For using Our services !");
			      System.exit(0);
		        
		  default :  System.out.println("Invalid input");
		          
		          
		  }
	  }
	  
}
}
