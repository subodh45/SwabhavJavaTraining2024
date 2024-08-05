package Comps.Aurionpro.IterativeStatement;
import java.util.*;

public class SumOfEvenNumberUsingWhile {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Number to find sum :");
	  int number = sc.nextInt();
	  int n= 1;
	  int sum=0;
	  
	  while(n <=number)
	  {
		  if(n %2 ==0)
		  {
			  sum = sum + n;
		  }  
		  
		  n++;
	  }
	  
	  System.out.println("Sum of even number is "+ sum);
}
}
