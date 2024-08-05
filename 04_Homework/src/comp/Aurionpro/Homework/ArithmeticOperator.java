package comp.Aurionpro.Homework;
import java.util.*;

public class ArithmeticOperator {
   public static void main(String[] args) {
	 
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter 1st number ");
	   int number1 = sc.nextInt();
	   
	   System.out.println("enter 2nd number ");
	   int number2 = sc.nextInt();
	   
	   //addition
	   int add = number1 + number2;
	   
	   //Multiplication
	   int multiply = number1* number2;
	   
	   //substraction
	   int sub = number1-number2;
	   
	   //division
	   int div = number1/number2;
	   
	   System.out.println("arithmatic opeartion are follows : ");
	   System.out.println("addition :" + add);
	   System.out.println("substraction :" + sub);
	   System.out.println("multiplication :" + multiply);
	   System.out.println("division :" + div);
	   
}
}
