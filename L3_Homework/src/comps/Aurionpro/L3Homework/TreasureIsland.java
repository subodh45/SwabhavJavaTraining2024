package comps.Aurionpro.L3Homework;

import java.util.*;

public class TreasureIsland {
	public static void main(String[] args) {

		System.out.println("Welcome to treasure Island !!");
		System.out.println("Choice anyone side from following :");

		Scanner sc = new Scanner(System.in);

		System.out.println("left or right ?");
		String choice1 = sc.next();

		if (choice1.equals("left")) {
			System.out.println("swim or wait ?");
			String choice2 = sc.next();

			if (choice2.equals("wait")) {
				System.out.println("red or blue or yellow ?");
				String choice3 = sc.next();

				switch (choice3) {
				case "yellow":
					System.out.println("You Win");
					break;

				case "red":
					System.out.println("Burned by fire. Game Over !");
					break;

				case "blue":
					System.out.println("Eaten by beasts. Game Over !");
					break;

				default:
					System.out.println("Game Over !");
				}
			} else
				System.out.println("Attacked by trout. Game Over!");
		} else
			System.out.println("fall into a hole . Game Over.");
	}
}
