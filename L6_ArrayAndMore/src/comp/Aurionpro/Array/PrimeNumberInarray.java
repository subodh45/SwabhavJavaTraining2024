package comp.Aurionpro.Array;
import java.util.*;


public class PrimeNumberInarray {
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
	  System.out.print("Prime numbers are ");
	  int sum=0;
	  first:
	  for(int i=0;i<size;i++)
	  {
		  int ele =number[i];
		  second:
		  for(int n=2;n<ele;n++)
		  {
			  if(ele%n==0)
			  {   sum= sum+n;
			  }	 
		  }
		  
		  if(sum==0)
		  {System.out.print(ele +" "); 
		  }
		  else
		  {
			  sum=0;
		  }
		 
	  }
	    
}
  
	
}