package comp.Aurionpro.Array;

import java.util.*;

public class MultiDimensionalArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows ");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns ");
		int columns = sc.nextInt();

		int matrix[][] = new int[rows][columns];

		System.out.println("enter matrix element ");
		for (int i = 0; i < rows; i++) {
			for (int n = 0; n < columns; n++) {
				System.out.println("enter " + n + " element of " + i + " array");
				matrix[i][n] = sc.nextInt();
			}
		}

		System.out.println("matrix ");
		for (int i = 0; i < rows; i++) {
			for (int n = 0; n < columns; n++) {
				System.out.print(matrix[i][n] + " ");

			}

			System.out.println();
		}
	}
}
