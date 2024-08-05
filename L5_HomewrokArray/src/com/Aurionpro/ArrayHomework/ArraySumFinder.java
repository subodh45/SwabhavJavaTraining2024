package com.Aurionpro.ArrayHomework;
import java.util.*;

public class ArraySumFinder {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array.");
		int size = sc.nextInt();
		
		int number[] = new int[size];
		int sum=0;
		
		for(int i=0;i<size ;i++)
		{
			System.out.println("Enter "+(i+1)+" value of Array");
			number[i]=sc.nextInt();
		}
		
		System.out.println("Array Initialization complete");
		for(int d:number)
		{
			System.out.print(d+" ");
			sum = sum+d;
		}
		
		System.out.println();
		System.out.println("Sum of all the element in  Array is "+ sum );
		
	}

}
