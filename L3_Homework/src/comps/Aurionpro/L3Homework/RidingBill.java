package comps.Aurionpro.L3Homework;

import java.util.*;

public class RidingBill {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int bill = 0;

		System.out.println("Enter your height(cm) :");
		int height = sc.nextInt();

		if (height > 120) {
			System.out.println("Yes! YOU can ride.");

			System.out.println("Enter your Age(years) :");
			int age = sc.nextInt();

			if (age < 12) {
				bill += 5;
			} else if (age < 18) {
				bill += 7;
			} else if (age < 55 && age >45) {
				bill += 0;
			} else {
				bill += 12;
			}

			System.out.println("Do You Want Photos(Yes/No) :");
			String choice = sc.next();

			switch (choice) {
			case "Yes":
				bill += 3;
				break;
			default:
				bill += 0;
				break;
			}

		} else {
			System.out.println("Sorry ! can't Ride. ");
		}

		System.out.println("Total bill =$" + bill);
	}
}
