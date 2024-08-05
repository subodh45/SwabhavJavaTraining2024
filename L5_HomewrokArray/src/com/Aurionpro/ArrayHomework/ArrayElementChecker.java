package com.Aurionpro.ArrayHomework;
import java.util.*;

public class ArrayElementChecker {
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
		
		System.out.println("Enter element to find a element is present in array or not :");
		int num = sc.nextInt();
		boolean present = false;
		for(int i=0;i<size;i++)
		{
			int element=number[i];
			
			if(num == element)
			{
				System.out.println("Element already present in array at."+ i + " position ");
				present =true;
				break;
			}
		}
		
		if(!present)
		{
			System.out.println("element is not present in array.");
		}
		
		
		
	}

}