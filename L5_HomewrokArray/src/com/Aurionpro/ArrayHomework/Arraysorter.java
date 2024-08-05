package com.Aurionpro.ArrayHomework;
import java.util.*;

public class Arraysorter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array.");
		int size = sc.nextInt();
		
		int number[] = new int[size];
		
		for(int i=0;i<size ;i++)
		{
			System.out.println("Enter "+(i+1)+" value of Array");
			number[i]=sc.nextInt();
		}
		
		System.out.println("Array Initialization complete");
		
		System.out.print(" Sorted array are :");
		Arrays.sort(number);
		for(int d:number)
		{
			System.out.print(d+" ");
			
		}		
	}
}