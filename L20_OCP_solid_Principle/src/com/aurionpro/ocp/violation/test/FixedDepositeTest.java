package com.aurionpro.ocp.violation.test;
import com.aurionpro.ocp.violation.model.*;

public class FixedDepositeTest {
public static void main(String[] args) {
	
	FixedDeposit FD1 = new FixedDeposit(123,"subodh", 22000,5,FestivalType.DIWALI);
	System.out.println(FD1.getInterestrate());
	
	System.out.println( "Simple Interest is "+FD1.calculateSimpleInterest());
}
}
