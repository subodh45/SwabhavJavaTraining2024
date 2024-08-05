package comp.Aurionpro.Array;
import java.util.*;


public class ReverseArray {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("enter size of an array ");
	  int size = sc.nextInt();
	  
	  int number[] =new int[size];
	  int reverse[]=new int[size];
	  
	  for(int i=0;i<size;i++)
	  {
		  System.out.println("enter "+ (i+1)+ " element of array ");
		  number[i]=sc.nextInt();
		  
	  }
	  System.out.print("Your Array :");
	  for(int i=0;i<size;i++)
	  {   
		  System.out.print(number[i]+" ");
	  }
  
	  System.out.println();
	  
	  System.out.print("Reverse Array");
	  int n=0;
	  for(int i=(size-1);i>=0;i--)
	  {  
		  reverse[n]=number[i];
		  n++;
	  }
	  
	  for(int i=0;i<size;i++)
	  {   
		  System.out.print(reverse[i]+" ");
	  }
	  
}
  
	
}
