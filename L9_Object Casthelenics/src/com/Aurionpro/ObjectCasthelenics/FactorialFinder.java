package com.Aurionpro.ObjectCasthelenics;

import java.util.Scanner;

public class FactorialFinder {
 public static void main(String[] args) {
	
	 Scanner sc =  new Scanner(System.in);
	 System.out.println("Enter number to find Factorial ");
	 int number =sc.nextInt();
	 
	 int factorial =factorialFinderApp(number);
	
	 if(factorial == -1)
	 {
		 System.out.println("cant find factorial of negative number");
		 return;
	 }
	 
	 System.out.println("factorial is " + factorial);
}

private static int factorialFinderApp(int number) {
	// TODO Auto-generated method stub
	if(number<0)
		return -1;
	if(number==0)
		return 1;
	
	  int factorial =1;
	  
	   for(int i=1;i<=number ;i++)
	   {
		   factorial = factorial *i;
	   }
	  
	  return factorial;
	
}
}
