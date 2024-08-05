package comps.Aurionpro.Homework;

import java.util.*;

public class NumberGuesser {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int number = rnd.nextInt(100)+1;
		int n = 5;

		while (n > 0) {
			System.out.println("Guess the number! Attempt left is " + n);
			int guess = sc.nextInt();

			if (guess == number) {
				System.out.println("Real Number is " + number);
				System.out.println("Your Guess is " + guess);
				System.out.println("Yes ! You guess the Number Correctly.");
				break;
			} else if (guess > number) {
				System.out.println("Sorry Wrong Guess! Your number is too high");
			} else if (guess < number) {
				System.out.println("Sorry Wrong Guess! Your number is too low");
			}

			n--;
		}
		if (n == 0) {
			System.out.println("You loose !Failed to Guess number. ");
			System.out.println("Real Number is " + number);
		}

	}
}
