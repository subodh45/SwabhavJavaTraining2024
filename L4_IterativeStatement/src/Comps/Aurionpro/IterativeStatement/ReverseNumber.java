package Comps.Aurionpro.IterativeStatement;

import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :");
		int number = sc.nextInt();
		int reverse = 0;
		int n;

		while (number > 0) {
			n = number % 10;
			number = number / 10;
			reverse = (reverse * 10) + n;

		}

		System.out.println(reverse);
	}
}
