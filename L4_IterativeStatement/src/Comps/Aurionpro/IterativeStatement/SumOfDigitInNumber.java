package Comps.Aurionpro.IterativeStatement;
import java.util.*;

public class SumOfDigitInNumber {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number to find sum of their digit: ");
	  int number = sc.nextInt();
	  int sum =0;
	  int n;
	  
	  while(number>0)
	  {
		  n = number %10;
		  sum = sum+n;
		  number = number/10;
		  
	  }
	  
	  System.out.println("Sum is "+ sum);
}
}
