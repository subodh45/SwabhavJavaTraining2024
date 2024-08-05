package Comps.Aurionpro.IterativeStatement;

import java.util.*;
import java.lang.*;

public class ArmstrongNumberFinderNthterm {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to find Armstrong or not :");
		int number = sc.nextInt();
		int original = number;
		String num = Integer.toString(number);

		double length = num.length();
		System.out.println(length);
		double armstrong = 0;
		double n;

		while (number > 0) {
			n = number % 10;
			armstrong = armstrong + Math.pow(n, length);
			number = number / 10;

		}

		if (original == armstrong) {
			System.out.println("Yes it is an Armstrong number .");
		} else
			System.out.println("Not an Armstrong number .");

	}
}