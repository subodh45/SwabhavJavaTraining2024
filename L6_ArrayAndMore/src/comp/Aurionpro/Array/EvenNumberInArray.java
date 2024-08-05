package comp.Aurionpro.Array;

import java.util.*;

public class EvenNumberInArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of an array ");
		int size = sc.nextInt();

		int number[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter " + (i + 1) + " element of array ");
			number[i] = sc.nextInt();

		}
		System.out.print("Your Array :");
		for (int i = 0; i < size; i++) {
			System.out.print(number[i] + " ");
		}

		System.out.println();
		int count = 0;
		System.out.print("Even number in array are ");
		for (int i = 0; i < size; i++) {
			int ele = number[i];

			if (ele % 2 == 0) {
				System.out.print(ele + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("count is " + count);

	}

}