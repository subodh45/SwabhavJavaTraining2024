package com.Aurionpro.ObjectCasthelenics;
import java.util.*;

public class EvenOddChecker {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter number :");
	 
	 int number =sc.nextInt();
	 
	 if(number%2==0)
	 {
		 System.out.println("even");
		 return;
	 }
	 System.out.println("odd");
	 
}
}
