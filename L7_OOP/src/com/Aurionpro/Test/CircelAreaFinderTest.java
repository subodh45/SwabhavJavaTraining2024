package com.Aurionpro.Test;

import com.Aurionpro.Model.*;
import java.util.*;
import java.util.Scanner;

public class CircelAreaFinderTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CircleAreaFinder c1 = new CircleAreaFinder();
		CircleAreaFinder c2 = new CircleAreaFinder(10);

		System.out.println("enter radius :");
		double radius = sc.nextDouble();
		c1.setRadius(radius);
		c1.area();
		c2.area();
	}

}
