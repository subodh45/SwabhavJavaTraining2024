package comps.Aurionpro.Lecture3;

import java.util.*;

public class MaximumOfThreeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter 1st number :");
		int number1 = sc.nextInt();

		System.out.println("enter 2nd number :");
		int number2 = sc.nextInt();

		System.out.println("enter 3rd number :");
		int number3 = sc.nextInt();

		if (number1 > number2 && number1 > number3) {
			System.out.println("Maximum number is " + number1);
		} else if (number2 > number3) {
			System.out.println("Maximum number is " + number2);
		} else {
			System.out.println("Maximum number is " + number3);
		}

	}

}
