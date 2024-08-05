package comp.Aurionpro.Homework;

import java.util.*;

public class CompoundInterest {
	public static void main(String[] args) {

		System.out.println("enter Principle amount :");
		Scanner sc = new Scanner(System.in);
		double principleamount = sc.nextDouble();

		System.out.println("enter rate of interest ");
		double rateofinterest = sc.nextDouble();

		System.out.println("enter number of years ");
		double years = sc.nextDouble();

		double CompoundInterest = (principleamount * (Math.pow((1 + (rateofinterest / 100)), years))) - principleamount;

		System.out.println("Total Interest get is " + CompoundInterest);
	}

}
