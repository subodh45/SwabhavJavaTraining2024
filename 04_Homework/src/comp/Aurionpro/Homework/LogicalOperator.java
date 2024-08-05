package comp.Aurionpro.Homework;

import java.util.*;

public class LogicalOperator {
	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter any year to find its leap year or not ");
	   int year = sc.nextInt();
	   
	   if(year % 4 == 0 || year% 100==0 )
		   System.out.println("it is leap year");
	   else 
		   System.out.println("it is not an leap year");
	   
	   //number is 2 digit or not 
	   System.out.println("enter any number to find its 2 digit or not ");
	   int number = sc.nextInt();
	   
	   if(number >=10 && number <=99)
		   System.out.println("it is an two digit number ");
	   else
		   System.out.println("it is not an two digit number");
	  
	}

}
