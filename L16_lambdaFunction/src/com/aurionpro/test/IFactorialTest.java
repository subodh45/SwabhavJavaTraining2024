package com.aurionpro.test;
import com.aurionpro.model.IFactorial;

public class IFactorialTest {
public static void main(String[] args) {
	
	IFactorial factorial = (number) -> {
		
		int fact =1;
		if(number ==1)
			return fact;
		
		for(int n=1;n<=number;n++)
		{
			fact =fact* n;
		}
		return fact;	
	};
	
	System.out.println(factorial.factorial(1));
}
}
