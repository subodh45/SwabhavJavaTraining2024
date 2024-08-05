package Comps.Aurionpro.IterativeStatement;
import java.util.*;

public class ArmstrongNumberFinder {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter number to find Armstrong or not :");
	  int number = sc.nextInt();
	  int original = number;
	  
	  int armstrong = 0;
	  int n;
	  
	  while(number>0)
	  {
		  n = number%10;
		  armstrong = armstrong + n*n*n;
		  number =number/10;
		  
	  }  
	  
	  if(original == armstrong)
	  {System.out.println("Yes it is an Armstrong number .");}
	  else
		  System.out.println("Not an Armstrong number .");
	 
	  
}
}
