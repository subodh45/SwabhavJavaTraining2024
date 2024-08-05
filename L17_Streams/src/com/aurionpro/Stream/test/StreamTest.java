package com.aurionpro.Stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		List<Integer> numbers =Arrays.asList(10,20,30,23);
		
		Stream<Integer> Streamnumbers = numbers.stream();
		
		Streamnumbers.forEach((number) ->System.out.print(number +" "));
		
	}
}
