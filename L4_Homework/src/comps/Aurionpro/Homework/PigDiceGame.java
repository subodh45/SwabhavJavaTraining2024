package comps.Aurionpro.Homework;
import java.util.*;

public class PigDiceGame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int total = 0;
		int turn = 1;
		int score = 0;

		while (true) {
			System.out.println("turn :" + turn);
			System.out.println("Roll or hold (r/h): ");
			char choice = sc.next().charAt(0);

			if (choice == 'r') {
				int n = rnd.nextInt(6) + 1;
				System.out.println("roll value :" + n);
				if (n == 1) {
					System.out.println("You got 1 .This makes your turn score  zero. ");
					System.out.println("Your total score is " + total);
					System.out.println("next Turn begin");
					System.out.println();
					score = 0;
					turn++;
				} else {
					score = score + n;
					System.out.println("This turn score is " + score);
				}
			}

			else if (choice == 'h') {
				total = total + score;
				score = 0;

				System.out.println("Your total score is " + total);

				if (total > 20) {
					System.out.println("You win ! your Score is " + total);
					System.out.println("You take " + turn + " Turn to win this game. ");
					System.exit(0);
				} else {
					turn++;
				}
			} else {
				System.out.println("Enter valid Input.");
			}
		}
	}
}
