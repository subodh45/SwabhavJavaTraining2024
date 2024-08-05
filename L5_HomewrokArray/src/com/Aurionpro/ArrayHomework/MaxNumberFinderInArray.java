package com.Aurionpro.ArrayHomework;
import java.util.*;

public class MaxNumberFinderInArray {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter size of an aaray ");
	  int size = sc.nextInt();
	  
	  int number[]=new int[size];
	  
	  for(int i=0; i<size ;i++)
	  {
		  System.out.println("Enter "+(i+1)+" value of Array ");
		  number[i]=sc.nextInt();
	  }
	  
	  int max =number[0];
	  
	  for(int n=1;n<size;n++)
	  {
		  int num =number[n];
		  
		  if(num>max)
		  {max = num;}
	  }
	  
	  for(int d:number)
		{
			System.out.print(d+" ");
			
		}
	  System.out.println();
	  System.out.println("Max element of Array is "+ max);
}
}
