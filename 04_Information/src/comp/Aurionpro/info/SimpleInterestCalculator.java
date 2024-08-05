package comp.Aurionpro.info;

import java.util.*;

public class SimpleInterestCalculator {
 public static void main(String[] args) {
	
	 System.out.println("enter Principle amount :");
	 Scanner sc = new Scanner(System.in);
	 double principleamount = sc.nextDouble();
	 
	 System.out.println("enter rate of interest ");
	 double rateofinterest = sc.nextDouble();
	 
	 System.out.println("enter number of years ");
	 double years = sc.nextDouble();
	 
	 double finalInterest = principleamount * rateofinterest * years/100 ;
	 
	 System.out.println("Total Interest get is "+finalInterest);
}
}
