package Comps.Aurionpro.IterativeStatement;
import java.util.*;

public class FactorialNumberUsingFor {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("enter number :");
	 int number = sc.nextInt();
	 
	 int factorial =1;
	 
	 if(number ==1 || number == 0)
	 {System.out.println("factorial is "+ factorial);}
	 else
	 {
		 for(int n =2;n<=number;n++)
		 {
			 factorial = factorial *n; 
		 }
		 
		 System.out.println("factorial is "+ factorial);
	 }
}
}
