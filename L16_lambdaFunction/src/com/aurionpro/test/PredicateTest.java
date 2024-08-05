package com.aurionpro.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
public static void main(String[] args) {
	
	Predicate<Integer> EventChecker = (Integer number) -> (number%2 ==0);
	
	System.out.println(EventChecker.test(10));
	
	BiPredicate<Integer ,Integer> MaxNumber = (Integer number1,Integer number2) ->(number1<number2);
	
	int number1 =10;
	int number2=20;
	Boolean res =MaxNumber.test(number1,number2);
	
	if(res==true) {
		System.out.println(number2);
	    return;
	}
	System.out.println(number1);
	
}
}
