package comps.Aurionpro.Homework;
import java.io.*;
import java.util.Scanner;

public class PrimeNumberPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row");
		int maxrow = sc.nextInt();
		printPrimePyramid(maxrow);
	}

	public static void printPrimePyramid(int maxrow) {
		int currentPrime = 2;
		int row = 1;
		int primesInCurrentRow = 0;

		while (row <= maxrow) {

			while (primesInCurrentRow < row) {
				if (isPrime(currentPrime)) {
					System.out.print(currentPrime + " ");
					primesInCurrentRow++;
				}
				currentPrime++;
			}

			System.out.println();
			row++;
			primesInCurrentRow = 0;
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
