package Comps.Aurionpro.IterativeStatement;
import java.util.*;

public class SumOfNthNumber {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number to find sum ");
    int number = sc.nextInt();
    int sum =0;
    int n=1;
    
    while(n<=number)
    {
    	sum = sum +n;
    	n++;
    }
    
    System.out.println("Sum  of number is "+sum);
 
}
}
