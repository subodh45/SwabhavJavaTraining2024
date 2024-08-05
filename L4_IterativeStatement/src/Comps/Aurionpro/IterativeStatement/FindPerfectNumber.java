package Comps.Aurionpro.IterativeStatement;
import java.util.*;

public class FindPerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int number = sc.nextInt();
		
		int n=1;
		int sumOfDiviser=0;
		
		while(n<number)
		{
			if(number%n==0)
			{
				sumOfDiviser = sumOfDiviser + n;
			}
			n++;
		}
		
		System.out.println("sumOfDiviser "+sumOfDiviser);
		
		if(sumOfDiviser == number)
		{System.out.println("Yes! It is a perfect number. ");}
		else
			System.out.println("not an perfect number .");
	}
}
