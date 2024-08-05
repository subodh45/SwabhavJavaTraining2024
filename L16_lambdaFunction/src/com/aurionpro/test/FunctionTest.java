package com.aurionpro.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
public static void main(String[] args) {
	
	Function<Integer ,Integer> SquareFinder =(Integer number) -> number* number;
	
	System.out.println("Square "+SquareFinder.apply(5));
	
	BiFunction<Integer,Integer,Integer> Addition = (Integer number1,Integer number2) -> number1+number2;
    System.out.println("Addition "+Addition.apply(10, 20));
    
    method(Addition);
}

private static void method(BiFunction<Integer, Integer, Integer> addition) {
		{
	    System.out.println("Addition "+addition.apply(10, 20));
	}
		
}


}
