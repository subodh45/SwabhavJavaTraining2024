package comps.Aurionpro.Lecture3;
import java.util.*;

public class PositiveNegativeChecker {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number here ");
		int number = sc.nextInt();
		
		if(number == 0)
		{System.out.println("number is zero.");}
		else if(number >0)
		{System.out.println("number is positive.");}
		else
		{System.out.println("number is neagtive");}
	}

}
