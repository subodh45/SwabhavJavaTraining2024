package com.Aurionpro.Test;

public class Test {
 public static void main(String[] args) {
	
	 try {
	 int number1=Integer.parseInt(args[0]);
	 int number2=Integer.parseInt(args[1]);
	 	 
		 double result =number1/number2;
		 
		 System.out.println("divison is "+ result);
	 }
	 catch(ArithmeticException exception)
	 {
		 System.out.println("Number2 cant be zero.");
	 }
	 catch(ArrayIndexOutOfBoundsException exception)
	 {
		 System.out.println("Plzz enter all input.");
	 }
	 catch(NumberFormatException exception)
	 {
		 System.out.println("enter integer only");
	 }
	 catch(Exception exception )
	 {
		 System.out.println("invalid input." + exception);
	 }
	 finally {
		 System.out.println("inside finally . closing activities.");
	 }
	 
	 System.out.println("success.");
}
}
