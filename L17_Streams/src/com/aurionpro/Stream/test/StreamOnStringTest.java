package com.aurionpro.Stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOnStringTest {
public static void main(String[] args) {
		
	List<String>names = Arrays.asList("Jayesh","Nimesh","Mark","Mahesh","Ramesh");
	
	names.stream().sorted((name1,name2)-> name1.compareTo(name2))
	.limit(3)
	.forEach((name)-> System.out.print(name + " "));
	
	System.out.println();
	System.out.println("contain a sort");
	names.stream().filter((name)-> name.contains("a"))
	.sorted((name1,name2)-> name1.compareTo(name2))
	.limit(3)
	.forEach((name)-> System.out.print(name + " "));
	
	System.out.println();
	System.out.println("descending order");
	names.stream().sorted((name1,name2)-> name2.compareTo(name1))
	.forEach((name)-> System.out.print(name + " "));
	
	System.out.println();
	System.out.println("length <=4");
	names.stream().filter((name)-> name.length()<=4)
	     .forEach((name)->System.out.print(name +" "));
	
	System.out.println();
	System.out.println("3 character ");
	
	names.stream().map((name)-> name.substring(0,3))
	.forEach((name)-> System.out.print(" "+ name));
	
}
}
