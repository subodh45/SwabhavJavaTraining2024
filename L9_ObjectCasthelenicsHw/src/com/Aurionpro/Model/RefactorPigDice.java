package com.Aurionpro.Model;

import java.util.*;

public class RefactorPigDice {
	
	private int total, turn, score;

	public RefactorPigDice() {
		total = 0;
		turn = 1;
		score = 0;
	}

	public void playGame(Scanner scanner ,Random random) {
		while (true) {
			System.out.println("Turn: " + turn);
			System.out.println("Roll or hold (r/h): ");
			String choiceString = scanner.next();
			char choice =choiceString.charAt(0);

			if (choice != 'r' && choice != 'h') {
				System.out.println("Enter valid input.");
				continue;
			}
			if (choice == 'r') {
				int rollValue = rollDice(random);
				System.out.println("Roll value: " + rollValue);
				checkRollValue(rollValue);
				continue;
			}
			total += score;
			score = 0;
			System.out.println("Your total score is " + total);
			if (total > 20) {
				System.out.println("You win! Your Score is " + total);
				System.out.println("You took " + turn + " turns to win this game.");
				break;
			}
			turn++;
		}
		scanner.close();
	}

	private void checkRollValue(int rollValue) {
		if (rollValue == 1) {
			System.out.println("You got 1. This makes your turn score zero.");
			System.out.println("Your total score is " + total);
			System.out.println("Next turn begins." + '\n');
			score = 0;
			turn++;
			return;
		}
		score += rollValue;
		System.out.println("This turn score is " + score);
	}

	private int rollDice(Random random) {
		return random.nextInt(6) + 1;
	}
}
