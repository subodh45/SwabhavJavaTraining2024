package comps.Aurionpro.L3Homework;
import java.util.*;

public class CurrencyDenomination {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Amount :");
		int amount = sc.nextInt();
		int og = amount;
		int twoThousand, fiveHundred, twoHundred, hundred;

		if (amount % 100 == 0 && amount <=50000) {
			twoThousand = amount / 2000;
			amount = amount % 2000;

			fiveHundred = amount / 500;
			amount = amount % 500;

			twoHundred = amount / 200;
			amount = amount % 200;

			hundred = amount / 100;

			System.out.println("your Amount is :" + og);
			System.out.println("currency denomination is as follows: ");
			System.out.println("No. of 2000 :" + twoThousand);
			System.out.println("No.of 500 :" + fiveHundred);
			System.out.println("No.of  200 :" + twoHundred);
			System.out.println("No. of 100 :" + hundred);

		} else {
			System.out.println("Enter valid amount. i.e Multiples of 100 only  or below 50000");
		}
	}
}
