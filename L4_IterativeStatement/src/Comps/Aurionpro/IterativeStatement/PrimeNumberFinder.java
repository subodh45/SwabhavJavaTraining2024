package Comps.Aurionpro.IterativeStatement;

import java.util.*;

public class PrimeNumberFinder {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int number = sc.nextInt();
	int sum=0;
	int n =2;
	if(number>=2) {
	while(n<= number)
	{
		if(number%n==0)
		{
			sum = sum+n;
		}		
		n++;
	}
	
	if(sum==number)
	{System.out.println("Its prime number.");}
	else
		System.out.println("Not a prime");
	}
	else
	{System.out.println("enter valid numbe.r");}
	
	
	
}
}
