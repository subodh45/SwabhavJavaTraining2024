package comp.Aurionpro.Homework;

import java.util.*;

public class TrapezoidArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter value of 1st base of trapezoid :");
		int base = sc.nextInt();

		System.out.println("enter value of 2nd base of trapezoid :");
		int base2 = sc.nextInt();

		System.out.println("enter height of trapezoid :");
		int height = sc.nextInt();

		double area = ((base + base2) / 2) * height;

		System.out.println("Area of trapezoid is " + area);

	}
}
