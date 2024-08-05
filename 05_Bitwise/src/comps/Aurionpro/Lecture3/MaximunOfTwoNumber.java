package comps.Aurionpro.Lecture3;
import java.util.*;


public class MaximunOfTwoNumber {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter 1st Number :");
	  int number1 = sc.nextInt();
	  
	  System.out.println("enter 2nd number :");
	  int number2 = sc.nextInt();
	  
	  if(number1 == number2)
	  {System.out.println("both numbers are Equal ");}
	  else if(number1> number2)
	  {System.out.println("maximum number is "+ number1);}
	  else
	  {System.out.println("maximum number is "+ number2);}
	  
	  
}
}
