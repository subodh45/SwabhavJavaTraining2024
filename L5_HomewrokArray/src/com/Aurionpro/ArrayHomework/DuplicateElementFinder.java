package com.Aurionpro.ArrayHomework;
import java.util.*;

public class DuplicateElementFinder {
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
		int count=0;
		
		System.out.print("Duplicate element are ");
		for(int i=0;i<size;i++)
		{
			int element1=number[i];
			
			for(int n=i+1; n<size;n++)
			{
				int element2 =number[n];
				
				if(element1 == element2)
				{
					System.out.print( element1 +" " );
					count++;
					break;
				}
			}
		}
		System.out.println();
		System.out.println("Total Duplicate element is "+ count);
		
		
	}

}