package Comps.Aurionpro.IterativeStatement;
import java.util.*;

public class TableOfNumberUsingFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int number = sc.nextInt();
		
		for(int n=1;n<=10; n++)
		{
			System.out.println(number*n);
		}
		
	}
}
