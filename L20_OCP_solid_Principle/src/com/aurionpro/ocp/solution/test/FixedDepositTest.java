package com.aurionpro.ocp.solution.test;
import com.aurionpro.ocp.solution.model.*;


public class FixedDepositTest {
public static void main(String[] args) {
	DiwaliInterest Diwali = new DiwaliInterest();
	
	FixedDeposit FD1 = new FixedDeposit(123,"subodh", 22000,5, Diwali);
	FixedDeposit FD2 = new FixedDeposit(123,"subodh", 22000,5, new HoliInterest());
	
	System.out.println( FD1.getFestival().getInterestRate());
	System.out.println( FD2.getFestival().getInterestRate());
	
	System.out.println( "Simple Interest is "+FD1.calculateSimpleInterest());
	System.out.println( "Simple Interest is "+FD2.calculateSimpleInterest());
}
}





