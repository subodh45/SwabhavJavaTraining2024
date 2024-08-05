package com.Aurionpro.Test;
import com.Aurionpro.Model.*;
import com.Aurionpro.Model.Number;

public class NumberTest {

	public static void main(String[] args) {
		
		Number number1 = new Number(10);
		Number number2 = new Number(20);
		
		System.out.println("Before Swapping :");
		System.out.print("Number1 is"+ number1.getValue()+"  Number2 is"+ number2.getValue());
		
		
		swap(number1,number2);
		System.out.println();
		System.out.print("Number1 is"+ number1.getValue()+" ");
		System.out.print("  Number2 is"+ number2.getValue());
	}

	private static void swap(Number number1, Number number2) {
		// TODO Auto-generated method stub
		 int temp = number1.getValue();
		 number1.setValue(number2.getValue());
		 number2.setValue(temp);
		 
	}
}
