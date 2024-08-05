package com.aurionpro.Stream.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddEvenFinderStream {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 23, 67, 89, 234, 80, 79);

		List<Integer> FilteredNumber = numbers.stream()
				.filter((number) -> (number % 2 != 0))
				.filter((number) -> (number > 35))
				.collect(Collectors.toList());

		FilteredNumber.forEach((number) -> System.out.print(number + " "));
		System.out.println();

		List<Integer> squareNumber = numbers.stream()
				.map((number) -> number * number)
				.collect(Collectors.toList());

		squareNumber.forEach((number) -> System.out.print(number + " "));
		System.out.println();

		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);

		System.out.println("Sum=" + sum);
		System.out.println("ascending order");
		numbers.stream()
		       .sorted()
		       .forEach(number-> System.out.print(number +" "));
		
		System.out.println();
		System.out.println("descending order with:");
		Stream<Integer> StreamPrint=numbers.stream()
		 .sorted((number1,number2) -> number2-number1)
		.limit(3);
		
		StreamPrint.forEach(number-> System.out.print(number +" "));
		System.out.println();
		
		Optional<Integer> max =numbers.stream().max((number1,number2) -> number1-number2 );
	
		if(max.isPresent())
			System.out.println("max is "+ max);
	       
		
		numbers.stream()
		.filter((number)-> number>20)
		.map((number)-> number*number)
		.forEach((number) -> System.out.print(number +" "));
	}
}
