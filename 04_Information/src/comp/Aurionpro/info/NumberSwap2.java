package comp.Aurionpro.info;

import java.util.*;

public class NumberSwap2 {
  public static void main(String[] args) {
	
	  System.out.println("enter 1st number ");
	  Scanner sc = new Scanner(System.in);
	  int number1 = sc.nextInt();
	  
	  System.out.println("enter 2nd number ");
	  int number2 = sc.nextInt();
	  
	  number2 = number1+number2;
	  number1 = number2-number1;
	  
	  number2 = number2-number1;
	  
	  System.out.println("1st number is " + number1 + " "+ "number2 "+ number2);
	  
	  
	  
}
}
